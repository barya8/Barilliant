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
    private final ArrayList<Song> allSongs;

    public SearchViewModel() {
        mSongs = new MutableLiveData<>();
        mSongs.setValue(new ArrayList<>());
        allSongs = new ArrayList<>();
        getSongsFromFirebase();
    }

    private void getSongsFromFirebase() {
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = firebaseDatabase.getReference(Constants.DBKeys.SONGS);

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

    public void updateSong(Song song) {
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference(Constants.DBKeys.SONGS);
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
                                    } else {
                                    }
                                }
                            });
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                // Handle the cancellation case
            }
        });
    }

    public void searchSongs(String query) {
        filterSongs(query);
    }

    private void filterSongs(String query) {
        ArrayList<Song> filteredSongs = new ArrayList<>();
        for (Song song : allSongs) {
            if (song.getTitle().toLowerCase().contains(query.toLowerCase())) {
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
