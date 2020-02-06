package com.example.mandy.lotiamusicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class GospelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        // list of gospel music
        ArrayList<Music> music = new ArrayList<Music>();
        music.add(new Music(R.id.musicLibraryIcon, R.string.gospelSongJonathan,
                R.string.gospelArtistJonathan));
        music.add(new Music(R.id.musicLibraryIcon, R.string.gospelSongJonnie,
                R.string.gospelArtistJonnie));
        music.add(new Music(R.id.musicLibraryIcon, R.string.gospelSongAda,
                R.string.gospelArtistAda));
        music.add(new Music(R.id.musicLibraryIcon, R.string.gospelSongAtta,
                R.string.gospelArtistAtta));
        music.add(new Music(R.id.musicLibraryIcon, R.string.gospelSongDonMoen,
                R.string.gospelArtistDonMoen));
        music.add(new Music(R.id.musicLibraryIcon, R.string.gospelSongDrTumi,
                R.string.gospelArtistDrTumi));
        music.add(new Music(R.id.musicLibraryIcon, R.string.gospelSongTasha,
                R.string.gospelArtistTasha));
        music.add(new Music(R.id.musicLibraryIcon, R.string.gospelSongSinach,
                R.string.gospelArtistSinach));
        music.add(new Music(R.id.musicLibraryIcon, R.string.gospelSongSteve,
                R.string.gospelArtistSteve));
        music.add(new Music(R.id.musicLibraryIcon, R.string.gospelSongHillSong,
                R.string.gospelArtistHillSong));

        MusicAdapter musicAdapter = new MusicAdapter(this, music);

        ListView listView = (ListView) findViewById(R.id.musicList);

        listView.setAdapter(musicAdapter);
    }
}