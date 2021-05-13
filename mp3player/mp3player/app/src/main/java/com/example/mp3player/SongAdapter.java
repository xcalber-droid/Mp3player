package com.example.mp3player;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    /**
     * @param Song A List of song objects to display in a list
     */
    public SongAdapter(Activity context, ArrayList<Song> Song) {

        super(context, 0, Song);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link song} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID song_name_text_view
        TextView nameTextView =  listItemView.findViewById(R.id.song_name_text_view);
        // Get the song name from the current Song object and
        // set this text on the name TextView
        nameTextView.setText(currentSong.getSongName());

        // Find the TextView in the list_item.xml layout with the ID artist_name_text_view
        TextView artistNameTextView =  listItemView.findViewById(R.id.artist_name_text_view);
        // Get the Artist name from the current Song object and
        // set this text on the number TextView
        artistNameTextView.setText(currentSong.getArtistName());

        // Find the ImageView in the list_item.xml layout with the ID list_item_album_art
        ImageView iconView = listItemView.findViewById(R.id.list_item_album_art);
        // Get the image resource ID from the current Song object and
        // set the image to iconView
        iconView.setImageResource(currentSong.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
