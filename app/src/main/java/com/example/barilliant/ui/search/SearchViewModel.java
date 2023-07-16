package com.example.barilliant.ui.search;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.barilliant.Model.Song;
import com.example.barilliant.Utilities.Constants;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class SearchViewModel extends ViewModel {

    private final MutableLiveData<ArrayList<Song>> mSongs;
    private final String userId;
    private final ArrayList<Song> allSongs;
    private String currentQuery;

    public SearchViewModel() {
        mSongs = new MutableLiveData<>();
        mSongs.setValue(new ArrayList<>());
        allSongs = new ArrayList<>();
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            userId = user.getUid();
            getSongsFromFirebase();
        } else {
            userId = null;
        }
    }
    //get the songs from firebase
    private void getSongsFromFirebase() {
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = firebaseDatabase.getReference()
                .child(Constants.DBKeys.USERS)
                .child(userId)
                .child(Constants.DBKeys.SONGS);

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                allSongs.clear();
                for (DataSnapshot childSnapshot : snapshot.getChildren()) {
                    Song song = childSnapshot.getValue(Song.class);
                    allSongs.add(song);
                }
                filterSongs(""); // Filter songs with an empty search query
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    public LiveData<ArrayList<Song>> getSongs() {
        return mSongs;
    }

    //show the songs that sets to the filter
    public void updateSong(Song song) {
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = firebaseDatabase.getReference()
                .child(Constants.DBKeys.USERS)
                .child(userId)
                .child(Constants.DBKeys.SONGS);
        Query query = databaseReference.orderByChild("title").equalTo(song.getTitle());

        query.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    snapshot.getRef().child("favorite").setValue(song.isFavorite())
                            .addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if (task.isSuccessful()) {
                                        if (currentQuery != null) {
                                            filterSongs(currentQuery);
                                        }
                                    } else {
                                    }
                                }
                            });
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
    }

    public void searchSongs(String query) {
        currentQuery=query;
        filterSongs(query);
    }

    // search if there is title, artist or album that set to the search
    private void filterSongs(String query) {
        ArrayList<Song> filteredSongs = new ArrayList<>();
        for (Song song : allSongs) {
            String title = song.getTitle().toLowerCase();
            String artist = song.getArtist().toLowerCase();
            String album = song.getAlbum().toLowerCase();
            if (title.contains(query.toLowerCase()) ||
                    artist.contains(query.toLowerCase()) ||
                    album.contains(query.toLowerCase())) {
                filteredSongs.add(song);
            }
        }
        mSongs.setValue(filteredSongs);
    }

    public void showAllSongs() {
        ArrayList<Song> filteredSongs = new ArrayList<>();
        for (Song song : allSongs) {
            filteredSongs.add(song);
        }
        mSongs.setValue(filteredSongs);
    }
}
