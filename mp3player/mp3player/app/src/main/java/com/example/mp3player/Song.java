package com.example.mp3player;

/**
 * Each object has 3 properties: name, version number, and image resource ID.
 */
public class Song {

    // Name of the Song
    private String mSongName;

    //  Name of the Artist
    private String mArtistName;

    // Drawable resource ID
    private int mImageResourceId;

    /*
     * Create a new song object.
     *
     * @param vName is the name of Song
     * @param vNumber is the corresponding name of Artist
     * @param image is drawable reference ID that corresponds to the Song
     * */
    public Song(String vName, String vArtist, int imageResourceId)
    {
        mSongName = vName;
        mArtistName = vArtist;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the Song
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the name of the Artist Name
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }


}
