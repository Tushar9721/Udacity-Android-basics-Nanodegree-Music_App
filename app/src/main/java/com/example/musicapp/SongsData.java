package com.example.musicapp;

public class SongsData {

    public String songName;
    public String artistName;
    public String duration;

    public SongsData(String songName, String artistName){

        this.songName = songName;
        this.artistName = artistName;

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
