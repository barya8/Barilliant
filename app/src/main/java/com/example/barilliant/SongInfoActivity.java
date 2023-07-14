package com.example.barilliant;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.barilliant.Utilities.Constants;
import com.google.android.material.textview.MaterialTextView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class SongInfoActivity extends AppCompatActivity {
    private String songPosition;
    private MaterialTextView en_LBL_info;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_activity);
        en_LBL_info=findViewById(R.id.en_LBL_info);
        songPosition = getIntent().getStringExtra("songId");
        LoadData();
    }

    private void LoadData() {
        DatabaseReference mDatabase;
        mDatabase = FirebaseDatabase.getInstance().getReference(Constants.DBKeys.SONGS)
                .child(songPosition);

        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                en_LBL_info.setText(dataSnapshot.child("info").getValue(String.class));
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
