package com.example.barilliant.Interface;

import com.example.barilliant.Model.Song;

public interface SongCallback {
    void editClicked(String songId);

    void favoriteClicked(Song song, int position);
}