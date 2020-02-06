package com.example.mandy.lotiamusicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class HipHopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        // list of HipHop music
        ArrayList<Music> music = new ArrayList<Music>();
        music.add(new Music(R.id.musicLibraryIcon, R.string.hip_hopSongBlanche,
                R.string.hip_hopArtistBlanche));
        music.add(new Music(R.id.musicLibraryIcon, R.string.hip_hopSongCharlotte,
                R.string.hip_hopArtistCharlotte));
        music.add(new Music(R.id.musicLibraryIcon, R.string.hip_hopSongChidima,
                R.string.hip_hopArtistChidima));
        music.add(new Music(R.id.musicLibraryIcon, R.string.hip_hopSongFalz,
                R.string.hip_hopArtistFalz));
        music.add(new Music(R.id.musicLibraryIcon, R.string.hip_hopSongTzy,
                R.string.hip_hopArtistTzy));
        music.add(new Music(R.id.musicLibraryIcon, R.string.hip_hopSongTyler,
                R.string.hip_hopArtistTyler));
        music.add(new Music(R.id.musicLibraryIcon, R.string.hip_hopSongKodak,
                R.string.hip_hopArtistKodak));
        music.add(new Music(R.id.musicLibraryIcon, R.string.hip_hopSongJohann,
                R.string.hip_hopArtistJohann));
        music.add(new Music(R.id.musicLibraryIcon, R.string.hip_hopSongJosey,
                R.string.hip_hopArtistJosey));
        music.add(new Music(R.id.musicLibraryIcon, R.string.hip_hopSongVictor,
                R.string.hip_hopArtistVictor));

        MusicAdapter musicAdapter = new MusicAdapter(this, music);

        ListView listView = (ListView) findViewById(R.id.musicList);

        listView.setAdapter(musicAdapter);
    }
}