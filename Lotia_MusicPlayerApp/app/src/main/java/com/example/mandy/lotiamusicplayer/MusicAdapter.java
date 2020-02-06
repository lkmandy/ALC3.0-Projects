package com.example.mandy.lotiamusicplayer;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter<Music> {

    // Music Adapter constructor
    MusicAdapter(Activity context, ArrayList<Music> music_adapter) {
        super(context, 0, music_adapter);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Checks if the existing view is being reused, otherwise it inflates the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_structure, parent, false);
        }

        // Gets the  object located at the current position in the music list
        Music currentMusic = getItem(position);

        // TextView in the song_structure.xml layout with the ID song
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song);
        assert currentMusic != null;
        songTextView.setText(currentMusic.getSongStringResource());

        // Sets a click listener on the song list view
        songTextView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the gospel image genre is clicked on.
            @Override
            public void onClick(View view) {
                // Creates a new intent to open the NowPlayingActivity
                Intent songStructureIntent = new Intent(getContext(), NowPlayingActivity.class);
                getContext().startActivity(songStructureIntent);
            }
        });

        // TextView in the song_structure.xml layout with the ID artist
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist);
        artistTextView.setText(currentMusic.getArtistStringResource());

        // Sets a click listener on the artist text  View
        artistTextView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the gospel image genre is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowPlayingActivity}
                Intent songStructureIntent = new Intent(getContext(), NowPlayingActivity.class);

                // Start the new activity
                getContext().startActivity(songStructureIntent);
            }
        });

        // ImageView in the song_structure.xml layout with the ID music Library Icon
        ImageView musicLibraryIconView = (ImageView) listItemView.findViewById(R.id.musicLibraryIcon);
        musicLibraryIconView.setImageResource(R.drawable.music_library_icon);

        // Set a click listener on the image View
        musicLibraryIconView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the gospel image genre is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowPlayingActivity}
                Intent songStructureIntent = new Intent(getContext(), MainActivity.class);

                // Start the new activity
                getContext().startActivity(songStructureIntent);
            }
        });

        // Returns the whole list item layout (containing 2 TextViews and an ImageView)
        return listItemView;
    }
}