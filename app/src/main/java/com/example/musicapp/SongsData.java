package com.example.musicapp;

public class SongsData {

    public String songName;
    public String artistName;
    public String duration;

    public SongsData(String songName, String artistName){

        this.songName = songName;
        this.artistName = artistName;

    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
}
