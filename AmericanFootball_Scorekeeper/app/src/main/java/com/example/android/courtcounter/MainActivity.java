package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    String message = " ";

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.teamScoreA);
        scoreView.setText(String.valueOf(scoreA));
    }

    public void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.teamScoreB);
        scoreView.setText(String.valueOf(scoreB));
    }

    public void displayResults(String message) {
        TextView messageView = (TextView) findViewById(R.id.winMessage);
        messageView.setText(String.valueOf(message));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
        displayResults(" ");
    }

    public void winMessage(View view) {
        if (scoreTeamA > scoreTeamB) {
            message = "Atlanta Falcons win with " + scoreTeamA + " points";
            displayResults(message);
        } else if (scoreTeamB > scoreTeamA) {
            message = "Carolina Panthers win with " + scoreTeamB + " points";
            displayResults(message);
        } else {
            message = "Ouch!! it's a draw ";
            displayResults(message);
        }
    }

    //Team A methods
    public void addPlusSixA(View view) {
        scoreTeamA += 6;
        displayForTeamA(scoreTeamA);
    }

    public void addPlusOneA(View view) {
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }

    public void addPlusThreeA(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void addPlusTwoA(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    //TeamB methods
    public void addPlusSixB(View view) {
        scoreTeamB += 6;
        displayForTeamB(scoreTeamB);
    }

    public void addPlusOneB(View view) {
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }

    public void addPlusThreeB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void addPlusTwoB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    // reset method
    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayResults(" ");
    }
}