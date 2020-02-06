package com.example.mandy.lotiamusicplayer;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class NowPlayingActivity extends AppCompatActivity {

    AnimationDrawable playPauseAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        ImageView musicCategory = (ImageView) findViewById(R.id.musicCategory);

        // Sets a click listener on the music category  View
        musicCategory.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the gospel image genre is clicked on.
            @Override
            public void onClick(View view) {
                // Creates a new intent to open the MainActivity
                Intent songStructureIntent = new Intent(NowPlayingActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(songStructureIntent);
            }
        });

        ImageView previousIcon = (ImageView) findViewById(R.id.previousIcon);

        // Sets a click listener on the previous icon  View
        previousIcon.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the previous icon image is clicked on.
            @Override
            public void onClick(View view) {

                // kills the current activity and goes to the previous activity
                NowPlayingActivity.super.finish();
            }
        });

        ImageView nextIcon = (ImageView) findViewById(R.id.nextIcon);

        // Sets a click listener on the next icon  View
        nextIcon.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the gospel image genre is clicked on.
            @Override
            public void onClick(View view) {

                // kills the current activity and goes to the previous activity
                NowPlayingActivity.super.finish();
            }
        });

        // Play/Pause icon view animation
        ImageView playPauseAnimationImage = (ImageView) findViewById(R.id.playIcon);
        playPauseAnimationImage.setBackgroundResource(R.drawable.animation_play_pause);
        playPauseAnimation = (AnimationDrawable) playPauseAnimationImage.getBackground();
        playPauseAnimationImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playPauseAnimation.start();
            }
        });
    }
}