package com.example.android.embedded_systems_quiz_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LandingPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);

        // This code segment displays the user's name in this activity
        Intent intent = getIntent();
        String userName = intent.getStringExtra("userName");
        TextView helloMessage = findViewById(R.id.helloMessage_textView);
        helloMessage.append("\t\t" + userName);
    }

    /**
     * This method launches the Questions Activity using an intent
     * when a user clicks on the start quiz button
     **/
    public void startQuiz(View view) {
        Intent intent = new Intent(this, QuestionsActivity.class);
        startActivity(intent);
    }
}