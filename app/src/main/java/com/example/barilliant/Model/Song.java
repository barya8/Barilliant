package com.example.barilliant.Model;

public class Song {
    private String title = "";
    private String image = "";
    private int duration = 0; //in seconds
    private int year = 0;
    private long streams = 0;
    private String album= "";
    private String artist= "";
    private boolean favorite = false;
    private String youtubeUrl="";
    private String info="";
    private String id="";

    public String getId() {
        return id;
    }

    public Song setId(String id) {
        this.id = id;
        return this;
    }

    public Song() {}

    public Song(String title, String image, int duration, int year, long streams, String album, String artist, boolean favorite, String youtubeUrl, String info, String id) {
        this.title = title;
        this.image = image;
        this.duration = duration;
        this.year = year;
        this.streams = streams;
        this.album = album;
        this.artist = artist;
        this.favorite = favorite;
        this.youtubeUrl = youtubeUrl;
        this.info = info;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public Song setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getImage() {
        return image;
    }

    public Song setImage(String image) {
        this.image = image;
        return this;
    }

    public int getDuration() {
        return duration;
    }

    public Song setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Song setYear(int year) {
        this.year = year;
        return this;
    }

    public long getStreams() {
        return streams;
    }

    public Song setStreams(long streams) {
        this.streams = streams;
        return this;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public Song setFavorite(boolean favorite) {
        this.favorite = favorite;
        return this;
    }

    public String getYoutubeUrl() {
        return youtubeUrl;
    }

    public Song setYoutubeUrl(String youtubeUrl) {
        this.youtubeUrl = youtubeUrl;
        return this;
    }

    public String getInfo() {
        return info;
    }

    public Song setInfo(String info) {
        this.info = info;
        return this;
    }

    public String getAlbum() {
        return album;
    }

    public Song setAlbum(String album) {
        this.album = album;
        return this;
    }

    public String getArtist() {
        return artist;
    }

    public Song setArtist(String artist) {
        this.artist = artist;
        return this;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", duration=" + duration +
                ", year=" + year +
                ", streams=" + streams +
                ", isFavorite=" + favorite +
                ", youtubeUrl='" + youtubeUrl + '\'' +
                '}';
    }
}
