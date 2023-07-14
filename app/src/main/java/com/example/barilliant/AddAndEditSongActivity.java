    package com.example.barilliant;

    import android.os.Bundle;

    import androidx.annotation.NonNull;
    import androidx.appcompat.app.AppCompatActivity;
    import androidx.appcompat.widget.AppCompatEditText;

    import com.example.barilliant.Model.Song;
    import com.example.barilliant.Utilities.Constants;
    import com.google.android.gms.tasks.OnFailureListener;
    import com.google.android.gms.tasks.OnSuccessListener;
    import com.google.android.material.button.MaterialButton;
    import com.google.android.material.snackbar.Snackbar;
    import com.google.firebase.database.DataSnapshot;
    import com.google.firebase.database.DatabaseError;
    import com.google.firebase.database.DatabaseReference;
    import com.google.firebase.database.FirebaseDatabase;
    import com.google.firebase.database.Query;
    import com.google.firebase.database.ValueEventListener;

    public class AddAndEditSongActivity extends AppCompatActivity {
        private AppCompatEditText en_ET_title;
        private AppCompatEditText en_ET_artist;
        private AppCompatEditText en_ET_album;
        private AppCompatEditText en_ET_album_pic_url;
        private AppCompatEditText en_ET_year;
        private AppCompatEditText en_ET_duration;
        private AppCompatEditText en_ET_streams;
        private AppCompatEditText en_ET_youtube;
        private AppCompatEditText en_ET_info;
        private MaterialButton en_BTN_send;
        private String songPosition;
        private String mode;
        private Boolean favorite=false;

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.add_and_edit_song_activity);
            findViews();
            mode = getIntent().getStringExtra("mode");
            if (mode.equals("edit")) {
                songPosition = getIntent().getStringExtra("songId");
                LoadData();
            }
            else //add mode
                getLastPlaceInFirebase();
            en_BTN_send.setOnClickListener(v -> {
                boolean allFieldsValid = true;
                if (!checkIfEmpty(en_ET_title))
                    allFieldsValid = false;
                if (!checkIfEmpty(en_ET_artist))
                    allFieldsValid = false;
                if (!checkIfEmpty(en_ET_album))
                    allFieldsValid = false;
                if (!checkIfEmpty(en_ET_album_pic_url))
                    allFieldsValid = false;
                if (!checkIfEmpty(en_ET_year))
                    allFieldsValid = false;
                if (!checkIfEmpty(en_ET_duration))
                    allFieldsValid = false;
                if (!checkIfEmpty(en_ET_streams))
                    allFieldsValid = false;
                if (!checkIfEmpty(en_ET_youtube))
                    allFieldsValid = false;
                if (!checkIfEmpty(en_ET_info))
                    allFieldsValid = false;
                if (allFieldsValid)
                    addSong();
                else {
                    Snackbar.make(v, "Please fill in all the required fields", Snackbar.LENGTH_LONG).show();
                }
            });
        }
        private void findViews() {
            en_ET_title = findViewById(R.id.en_ET_title);
            en_ET_artist = findViewById(R.id.en_ET_artist);
            en_ET_album = findViewById(R.id.en_ET_album_name);
            en_ET_album_pic_url = findViewById(R.id.en_ET_album_pic_url);
            en_ET_year = findViewById(R.id.en_ET_year);
            en_ET_duration = findViewById(R.id.en_ET_duration);
            en_ET_streams = findViewById(R.id.en_ET_streams);
            en_ET_youtube = findViewById(R.id.en_ET_youtube);
            en_ET_info = findViewById(R.id.en_ET_info);
            en_BTN_send =findViewById(R.id.en_BTN_send);
        }

        private boolean checkIfEmpty(AppCompatEditText en_ET_someText){
            String query = en_ET_someText.getText().toString();
            if (query.isEmpty()) {
                en_ET_someText.setError("This field cannot be blank");
                return false;
            }
            else{
                en_ET_someText.setError(null);
                return true;
            }
        }
        private void LoadData() {
            DatabaseReference mDatabase;
            mDatabase = FirebaseDatabase.getInstance().getReference(Constants.DBKeys.SONGS)
                    .child(songPosition);

            mDatabase.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    en_ET_title.setText(dataSnapshot.child("title").getValue(String.class));
                    en_ET_artist.setText(dataSnapshot.child("artist").getValue(String.class));
                    en_ET_album.setText(dataSnapshot.child("album").getValue(String.class));
                    en_ET_album_pic_url.setText(dataSnapshot.child("image").getValue(String.class));
                    en_ET_year.setText(String.valueOf(dataSnapshot.child
                            ("year").getValue(Long.class)));
                    en_ET_duration.setText(String.valueOf(dataSnapshot.child
                            ("duration").getValue(Long.class)));
                    en_ET_streams.setText(String.valueOf(dataSnapshot.child
                            ("streams").getValue(Long.class)));
                    en_ET_youtube.setText(dataSnapshot.child("youtubeUrl").getValue(String.class));
                    en_ET_info.setText(dataSnapshot.child("info").getValue(String.class));
                    favorite= dataSnapshot.child("favorite").getValue(Boolean.class);
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
        }
        private void getLastPlaceInFirebase()
        {
            DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference(Constants.DBKeys.SONGS);
            Query lastPositionQuery = databaseReference.orderByKey().limitToLast(1);

            lastPositionQuery.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if (dataSnapshot.exists()) {
                        String lastKey = dataSnapshot.getChildren().iterator().next().getKey();
                        int lastPosition = Integer.parseInt(lastKey);
                        songPosition = String.valueOf(lastPosition + 1);
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
        }

        private void addSong() {
            String title = en_ET_title.getText().toString();
            String artist=en_ET_artist.getText().toString();
            String album=en_ET_album.getText().toString();
            String albumPicUrl = en_ET_album_pic_url.getText().toString();
            int duration = Integer.parseInt(en_ET_duration.getText().toString());
            int year = Integer.parseInt(en_ET_year.getText().toString());
            int streams = Integer.parseInt(en_ET_streams.getText().toString());
            String youtubeLink = en_ET_youtube.getText().toString();
            String info=en_ET_info.getText().toString();
            Song song;

            DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference(Constants.DBKeys.SONGS);
            song = new Song(title, albumPicUrl, duration, year, streams, album, artist,
                    favorite, youtubeLink, info, songPosition);
            databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    databaseReference.child(songPosition).setValue(song)
                            .addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void aVoid) {
                                    Snackbar snackbar = Snackbar.make(getWindow().getDecorView().getRootView(),
                                            "Song added successfully", Snackbar.LENGTH_SHORT);
                                    snackbar.addCallback(new Snackbar.Callback() {
                                        @Override
                                        public void onDismissed(Snackbar snackbar, int event) {
                                            finish();
                                        }
                                    });
                                    snackbar.show();
                                }
                            })
                            .addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    Snackbar snackbar=Snackbar.make(getWindow().getDecorView().getRootView(),
                                            "Failed to add song", Snackbar.LENGTH_SHORT);
                                    snackbar.addCallback(new Snackbar.Callback() {
                                        @Override
                                        public void onDismissed(Snackbar snackbar, int event) {
                                            finish();
                                        }
                                    });
                                    snackbar.show();
                                }
                            });
                }
                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
        }
    }
