package com.example.mandy.lotiamusicplayer;

public class Music {

    // variables for song. artist and image resource
    private int mSong;
    private int mArtist;
    private int mImageResourceId;

    // Music constructor
    public Music(int ImageResourceId, int song, int artist) {
        mSong = song;
        mArtist = artist;
        mImageResourceId = ImageResourceId;
    }

    public int getSongStringResource() {
        return mSong;
    }

    public int getArtistStringResource() {
        return mArtist;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}