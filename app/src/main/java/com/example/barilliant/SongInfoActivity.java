package com.example.barilliant;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.barilliant.Fragments.CommentsFragment;
import com.example.barilliant.Fragments.InfoFragment;
import com.example.barilliant.Model.Comment;
import com.example.barilliant.Utilities.Constants;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


import java.util.ArrayList;
import java.util.List;

public class SongInfoActivity extends AppCompatActivity {
    private InfoFragment infoFragment;
    private CommentsFragment commentsFragment;
    private String userId;
    private String songPosition;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_activity);
        songPosition = getIntent().getStringExtra("songId");
        initFragments();
        beginTransactions();
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            userId = user.getUid();
            loadData();
        }
    }

    private void beginTransactions() {
        getSupportFragmentManager().beginTransaction().add(R.id.main_FRAME_info, infoFragment).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.main_FRAME_comments, commentsFragment).commit();
    }

    private void initFragments() {
        infoFragment = new InfoFragment();
        commentsFragment = new CommentsFragment();
        Bundle bundle = new Bundle();
        bundle.putString("songPosition", songPosition);
        commentsFragment.setArguments(bundle);
    }

    private void loadData() {
        DatabaseReference songRef = FirebaseDatabase.getInstance().getReference()
                .child(Constants.DBKeys.USERS)
                .child(userId)
                .child(Constants.DBKeys.SONGS)
                .child(songPosition);

        songRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String info = dataSnapshot.child("info").getValue(String.class);
                if (info != null) {
                    infoFragment.setInfo(info);
                }

                DatabaseReference commentsRef = dataSnapshot.child(Constants.DBKeys.COMMENTS).getRef();
                commentsRef.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        List<Comment> commentsList = new ArrayList<>();
                        for (DataSnapshot commentSnapshot : dataSnapshot.getChildren()) {
                            String commentText = commentSnapshot.child("comment").getValue(String.class);
                            String userName = commentSnapshot.child("userName").getValue(String.class);

                            if (commentText != null && userName != null) {
                                Comment comment = new Comment(userName, commentText);
                                commentsList.add(comment);
                            }
                        }
                        commentsFragment.setComments(commentsList);
                    }
                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

}
