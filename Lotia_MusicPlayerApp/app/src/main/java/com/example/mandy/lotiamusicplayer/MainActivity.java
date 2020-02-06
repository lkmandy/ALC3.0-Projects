package com.example.mandy.lotiamusicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // The content of the activity is set to  the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Finds the view that  shows the gospel genre
        ImageView gospelGenre = (ImageView) findViewById(R.id.gospel);

        // Sets a click listener on the gospel genre image view
        gospelGenre.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the gospel image genre is clicked on.
            @Override
            public void onClick(View view) {
                Intent gospelIntent = new Intent(MainActivity.this, GospelActivity.class);

                // Start the new activity
                startActivity(gospelIntent);
            }
        });

        // Finds the view that shows the pop genre
        ImageView popGenre = (ImageView) findViewById(R.id.pop);

        // Sets a click listener on that pop genre image view
        popGenre.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the pop image genre is clicked on.
            @Override
            public void onClick(View view) {
                Intent popIntent = new Intent(MainActivity.this, PopActivity.class);

                // Starts the popIntent activity
                startActivity(popIntent);
            }
        });

        // Finds the view that shows the hip-hop genre
        ImageView hipHopGenre = (ImageView) findViewById(R.id.hipHop);

        // Sets a click listener on the hip-hop image view
        hipHopGenre.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the hip-hop image genre is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link HipHopActivity}
                Intent hipHopIntent = new Intent(MainActivity.this, HipHopActivity.class);

                // Starts thehipHop activity
                startActivity(hipHopIntent);
            }
        });

        // Finds the View that shows the classical genre
        ImageView classicalGenre = (ImageView) findViewById(R.id.classical);

        // Sets a click listener on the classical genre image view
        classicalGenre.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the gospel image genre is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ClassicalActivity}
                Intent classicalIntent = new Intent(MainActivity.this, ClassicalActivity.class);

                // Start the new activity
                startActivity(classicalIntent);
            }
        });
    }
}