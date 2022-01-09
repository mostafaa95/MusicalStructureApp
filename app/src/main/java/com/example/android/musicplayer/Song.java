package com.example.android.musicplayer;

public class Song {

    private String mNameOfComposer;
    private String mSong;

    public Song(String nameOfComposer, String song) {
        mNameOfComposer = nameOfComposer;
        mSong = song;
    }
    // Get the name of composer.
    public String getNameOfComposer() {
        return mNameOfComposer;
    }
    // Get the name of opus.
    public String getSong() {
        return mSong;
    }
}

