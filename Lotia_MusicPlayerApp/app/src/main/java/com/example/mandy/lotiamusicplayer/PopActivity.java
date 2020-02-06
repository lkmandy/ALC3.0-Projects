package com.example.mandy.lotiamusicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class PopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        // list of pop music
        ArrayList<Music> music = new ArrayList<Music>();
        music.add(new Music(R.id.musicLibraryIcon,R.string.popSongJanelleMonáe,
                R.string.popArtistJanelleMonáe));
        music.add(new Music(R.id.musicLibraryIcon,R.string.popSongChristinaAguilera,
                R.string.popArtistChristinaAguilera));
        music.add(new Music(R.id.musicLibraryIcon,R.string.popSongCharliePuth,
                R.string.popArtistCharliePuth));
        music.add(new Music(R.id.musicLibraryIcon,R.string.popSongCamilla,
                R.string.popArtistCamilla));
        music.add(new Music(R.id.musicLibraryIcon,R.string.popSongAriana,
                R.string.popArtistAriana));
        music.add(new Music(R.id.musicLibraryIcon,R.string.popSongAnneMarie,
                R.string.popArtistAnneMarie));
        music.add(new Music(R.id.musicLibraryIcon,R.string.popSongJustinTimberlake,
                R.string.popArtistJustinTimberlake));
        music.add(new Music(R.id.musicLibraryIcon,R.string.popSongShawnMendes,
                R.string.popArtistShawnMendes));
        music.add(new Music(R.id.musicLibraryIcon,R.string.popSongTinashe,
                R.string.popArtistTinashe));
        music.add(new Music(R.id.musicLibraryIcon,R.string.popSongKimbra,
                R.string.popArtistKimbra));

        MusicAdapter musicAdapter = new MusicAdapter(this, music);

        ListView listView = (ListView) findViewById(R.id.musicList);

        listView.setAdapter(musicAdapter);
    }
}