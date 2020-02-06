package com.example.mandy.lotiamusicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ClassicalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        // list of classical music
        ArrayList<Music> music = new ArrayList<Music>();
        music.add(new Music(R.id.musicLibraryIcon, R.string.classicSongErik,
                R.string.classicArtistErik));
        music.add(new Music(R.id.musicLibraryIcon, R.string.classicSongEdward,
                R.string.classicArtistEdward));
        music.add(new Music(R.id.musicLibraryIcon, R.string.classicSongLudwig,
                R.string.classicArtistLudwig));
        music.add(new Music(R.id.musicLibraryIcon, R.string.classicSongClaude,
                R.string.classicArtistClaude));
        music.add(new Music(R.id.musicLibraryIcon, R.string.classicSongCharles,
                R.string.classicArtistCharles));
        music.add(new Music(R.id.musicLibraryIcon, R.string.classicSongAntonio,
                R.string.classicArtistAntonio));
        music.add(new Music(R.id.musicLibraryIcon, R.string.classicSongJules,
                R.string.classicArtistJules));
        music.add(new Music(R.id.musicLibraryIcon, R.string.classicSongJohann,
                R.string.classicArtistJohann));
        music.add(new Music(R.id.musicLibraryIcon, R.string.classicSongWolfang,
                R.string.classicArtistWolfang));
        music.add(new Music(R.id.musicLibraryIcon, R.string.classicSongGustav,
                R.string.classicArtistGustav));

        MusicAdapter musicAdapter = new MusicAdapter(this, music);

        ListView listView = (ListView) findViewById(R.id.musicList);

        listView.setAdapter(musicAdapter);
    }
}