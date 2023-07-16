package com.example.barilliant.ui.myMusic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.barilliant.Adapters.SongAdapter;
import com.example.barilliant.Interface.SongCallback;
import com.example.barilliant.Model.Song;
import com.example.barilliant.databinding.FragmentMyMusicBinding;

import java.util.ArrayList;

public class MyMusicFragment extends Fragment {

    private FragmentMyMusicBinding binding;
    private RecyclerView mainLSTSongs;
    private SongAdapter songAdapter;

    private Observer<ArrayList<Song>> observer = new Observer<ArrayList<Song>>() {
        @Override
        public void onChanged(ArrayList<Song> songs) {
            songAdapter.updateSongs(songs);
        }
    };

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MyMusicViewModel myMusicViewModel =
                new ViewModelProvider(this).get(MyMusicViewModel.class);

        binding = FragmentMyMusicBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        mainLSTSongs = binding.mainLSTSongs;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        mainLSTSongs.setLayoutManager(linearLayoutManager);
        songAdapter = new SongAdapter(getContext(),myMusicViewModel.getSongs().getValue());
        mainLSTSongs.setAdapter(songAdapter);
        myMusicViewModel.getSongs().observe(getViewLifecycleOwner(), observer);
        songAdapter.setSongCallback(new SongCallback() {
            @Override
            public void editClicked(String songId) {
            }
            //click on heart icon in one of the songs
            @Override
            public void favoriteClicked(Song song, int position) {
                song.setFavorite(!song.isFavorite());
                mainLSTSongs.getAdapter().notifyItemChanged(position);
                myMusicViewModel.updateSong(song);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}