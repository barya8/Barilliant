package com.example.barilliant.ui.home;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.barilliant.Model.Song;
import com.example.barilliant.Utilities.Constants;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<ArrayList<Song>> mSongs;
    private String userId;

    public HomeViewModel() {
        mSongs = new MutableLiveData<>();
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user!=null)
            userId = user.getUid();
        else
            userId=null;
        mSongs.setValue(getSongsFromFirebase());
    }

    //get all the songs in firebase
    private ArrayList<Song> getSongsFromFirebase() {
        ArrayList<Song> songs = new ArrayList<>();
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference databaseReference = firebaseDatabase.getReference()
                .child(Constants.DBKeys.USERS)
                .child(userId)
                .child(Constants.DBKeys.SONGS);

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                songs.clear();
                for (DataSnapshot songSnapshot : snapshot.getChildren()) {
                    Song song = songSnapshot.getValue(Song.class);
                    songs.add(song);
                }
                mSongs.setValue(songs);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        return songs;
    }

    public LiveData<ArrayList<Song>> getSongs() {
        return mSongs;
    }

    //update firebase if the favorite changed
    public void updateSong(Song song) {
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference()
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
}