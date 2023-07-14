package com.example.barilliant.Adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.barilliant.AddAndEditSongActivity;
import com.example.barilliant.SongInfoActivity;
import com.example.barilliant.Interface.SongCallback;
import com.example.barilliant.Model.Song;
import com.example.barilliant.R;
import com.example.barilliant.Utilities.ImageLoader;
import com.example.barilliant.Utilities.StreamsFormatter;
import com.example.barilliant.Utilities.TimeFormatter;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongViewHolder> {

    private Context context;
    private ArrayList<Song> songs;
    private SongCallback songCallback;

    public SongAdapter(Context context, ArrayList<Song> songs) {
        this.context = context;
        this.songs = songs;
    }

    public void setSongCallback(SongCallback songCallback) {
        this.songCallback = songCallback;
    }

    @NonNull
    @Override
    public SongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d("passed VT:", "" + viewType);
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.song_item, parent, false);
        SongViewHolder songViewHolder = new SongViewHolder(view);
        return songViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SongViewHolder holder, int position) {
        Song song = getItem(position);
        holder.song_LBL_title.setText(song.getTitle());
        holder.song_LBL_artist.setText(song.getArtist());
        holder.song_LBL_album.setText(song.getAlbum());
        holder.song_LBL_year.setText(song.getYear() + "");
        holder.song_LBL_duration.setText(TimeFormatter.getFormattedTime(song.getDuration()));
        holder.song_LBL_streams.setText(StreamsFormatter.getFormattedStreams(song.getStreams()) + " Streams");
        holder.song_LBL_youtube.setText(song.getYoutubeUrl()+ "");
        ImageLoader.getInstance().loadImage(song.getImage(), holder.song_IMG_album);
        if (song.isFavorite())
            holder.song_IMG_favorite.setImageResource(R.drawable.heart);
        else
            holder.song_IMG_favorite.setImageResource(R.drawable.heart_empty);
    }

    @Override
    public int getItemCount() {
        return this.songs == null ? 0 : songs.size();
    }

    private Song getItem(int position) {
        return this.songs.get(position);
    }

    public void updateSongs(ArrayList<Song> songs) {
        this.songs = songs;
        notifyDataSetChanged();
    }

    public class SongViewHolder extends RecyclerView.ViewHolder {

        private ShapeableImageView song_IMG_favorite;
        private MaterialTextView song_LBL_streams;
        private MaterialTextView song_LBL_duration;
        private MaterialTextView song_LBL_year;
        private MaterialTextView song_LBL_title;
        private MaterialTextView song_LBL_youtube;
        private MaterialTextView song_LBL_artist;
        private MaterialTextView song_LBL_album;
        private ShapeableImageView song_IMG_album;
        private ShapeableImageView song_IMG_edit;
        private ShapeableImageView song_IMG_info;

        public SongViewHolder(@NonNull View itemView) {
            super(itemView);
            song_IMG_favorite = itemView.findViewById(R.id.song_IMG_favorite);
            song_LBL_youtube=itemView.findViewById(R.id.song_LBL_youtube);
            song_LBL_streams = itemView.findViewById(R.id.song_LBL_streams);
            song_LBL_duration = itemView.findViewById(R.id.song_LBL_duration);
            song_LBL_year = itemView.findViewById(R.id.song_LBL_year);
            song_LBL_title = itemView.findViewById(R.id.song_LBL_title);
            song_IMG_album = itemView.findViewById(R.id.song_IMG_album);
            song_IMG_edit = itemView.findViewById(R.id.song_IMG_edit);
            song_IMG_info=itemView.findViewById(R.id.song_IMG_info);
            song_LBL_artist=itemView.findViewById(R.id.song_LBL_artist);
            song_LBL_album=itemView.findViewById(R.id.song_LBL_album);
            song_IMG_album.setOnClickListener(v -> {
                if (songCallback != null) {
                    String youtubeUrl = song_LBL_youtube.getText().toString();
                    if (!youtubeUrl.isEmpty()) {
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse(youtubeUrl));
                        context.startActivity(intent);
                    }
                }
            });
            song_IMG_favorite.setOnClickListener(v -> {
                if (songCallback != null)
                    songCallback.favoriteClicked(getItem(getAdapterPosition()), getAdapterPosition());
            });
//            itemView.setOnClickListener(v -> {
//                if (songCallback != null)
//                    songCallback.editClicked(getItem(getAdapterPosition()), getAdapterPosition());
//            });
            song_IMG_edit.setOnClickListener(v ->  {
                String clickedPosition = getItem(getAdapterPosition()).getId();
                if (clickedPosition!=null) {
                    Intent intent = new Intent(context, AddAndEditSongActivity.class);
                    intent.putExtra("songId", clickedPosition);
                    intent.putExtra("mode","edit");
                    context.startActivity(intent);
                }
            });
            song_IMG_info.setOnClickListener(v ->  {
                String clickedPosition = getItem(getAdapterPosition()).getId();
                if (clickedPosition != null) {
                    Intent intent = new Intent(context, SongInfoActivity.class);
                    intent.putExtra("songId", clickedPosition);
                    context.startActivity(intent);
                }
            });

        }
    }
}
