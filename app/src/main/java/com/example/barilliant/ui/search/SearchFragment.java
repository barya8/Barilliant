package com.example.barilliant.ui.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.barilliant.Adapters.SongAdapter;
import com.example.barilliant.Interface.SongCallback;
import com.example.barilliant.Model.Song;
import com.example.barilliant.databinding.FragmentSearchBinding;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class SearchFragment extends Fragment {

    private FragmentSearchBinding binding;
    private RecyclerView mainLSTSongs;
    private AppCompatEditText en_ET_name;
    private MaterialButton en_BTN_send;
    private SongAdapter songAdapter;
    private SearchViewModel searchViewModel;

    private Observer<ArrayList<Song>> observer = new Observer<ArrayList<Song>>() {
        @Override
        public void onChanged(ArrayList<Song> songs) {
            songAdapter.updateSongs(songs);
        }
    };

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        searchViewModel = new ViewModelProvider(this).get(SearchViewModel.class);

        binding = FragmentSearchBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        mainLSTSongs = binding.mainLSTSongs;
        en_ET_name = binding.enETName;
        en_BTN_send = binding.enBTNSend;

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        mainLSTSongs.setLayoutManager(linearLayoutManager);

        songAdapter = new SongAdapter(getContext(), new ArrayList<>());
        mainLSTSongs.setAdapter(songAdapter);

        searchViewModel.getSongs().observe(getViewLifecycleOwner(), observer);

        songAdapter.setSongCallback(new SongCallback() {
            @Override
            public void editClicked(String songId) {

            }

            @Override
            public void favoriteClicked(Song song, int position) {
                song.setFavorite(!song.isFavorite());
                mainLSTSongs.getAdapter().notifyItemChanged(position);
                searchViewModel.updateSong(song);
            }
        });

        en_BTN_send.setOnClickListener(v -> {
            String query = en_ET_name.getText().toString();
            if (!query.isEmpty()) {
                searchViewModel.searchSongs(query);
            }
            else
                searchViewModel.showAllSongs();
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
