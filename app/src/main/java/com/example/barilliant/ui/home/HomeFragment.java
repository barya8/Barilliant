package com.example.barilliant.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.barilliant.Adapters.SongAdapter;
import com.example.barilliant.Interface.SongCallback;
import com.example.barilliant.Model.Song;
import com.example.barilliant.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
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
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        mainLSTSongs = binding.mainLSTSongs;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        mainLSTSongs.setLayoutManager(linearLayoutManager);
        songAdapter = new SongAdapter(getContext(),homeViewModel.getSongs().getValue());
        mainLSTSongs.setAdapter(songAdapter);
        homeViewModel.getSongs().observe(getViewLifecycleOwner(), observer);
        songAdapter.setSongCallback(new SongCallback() {
            @Override
            public void editClicked(String songId) {
//                SignalGenerator.getInstance().toast(movie.getTitle(), Toast.LENGTH_SHORT);
            }

            @Override
            public void favoriteClicked(Song song, int position) {
                song.setFavorite(!song.isFavorite());
                mainLSTSongs.getAdapter().notifyItemChanged(position);
                homeViewModel.updateSong(song);
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