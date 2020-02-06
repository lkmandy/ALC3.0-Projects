package com.example.android.embedded_systems_quiz_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }

    /**
     * This method launches the LandingPage Activity using an intent
     * when a user clicks on the login button.
     * It also stores the value of the user's name and takes it to the LandingPge Activity
     **/
    public void login(View view) {
        Intent intent = new Intent(this, LandingPageActivity.class);
        TextView nameInputView = (TextView) findViewById(R.id.nameInputFieldView);
        String userName = nameInputView.getText().toString();
        intent.putExtra("userName", userName);
        startActivity(intent);
    }
}