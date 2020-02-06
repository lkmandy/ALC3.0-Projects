package com.example.android.embedded_systems_quiz_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuestionsActivity extends AppCompatActivity {
    private int correctAnswerCount;
    private int section2Count;
    private int section3Count;
    private String scoreMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
    }

    public void submitAnswersSection1(View view) {
        RadioButton answer_question1_section1 = (RadioButton) findViewById(R.id.
                radio_button1_answer1_question1_section1);

        RadioButton answer_question2_section1 = (RadioButton) findViewById(R.id.
                radio_button2_answer2_question2_section1);

        RadioButton answer_question3_section1 = (RadioButton) findViewById(R.id.
                radio_button1_answer1_question3_section1);

        // checks the current state of the correct radio button (true or false to question1 .
        Boolean answer_question1_section1_button_state = answer_question1_section1.isChecked();

        // checks the current state of the correct radio button (true or false to question2 .
        Boolean answer_question2_section1_button_state = answer_question2_section1.isChecked();

        // checks the current state of the correct radio button (true or false to question3 .
        Boolean answer_question3_section1_button_state = answer_question3_section1.isChecked();

        Button submitSection1 = (Button) findViewById(R.id.section1_submit);

        if (answer_question1_section1_button_state) {
            correctAnswerCount++;

        } else {
            correctAnswerCount += 0;

        }
        if (answer_question3_section1_button_state) {
            correctAnswerCount++;
        } else {
            correctAnswerCount += 0;

        }

        if (answer_question2_section1_button_state) {
            correctAnswerCount++;

        } else {
            correctAnswerCount += 0;

        }
        //Toast message
        String toastMessage_submit_button1 = getString(R.string.toast_submit_button1);
        String numberOfQuestions = getString(R.string.number_of_questions);

        scoreMessage = toastMessage_submit_button1 + correctAnswerCount + numberOfQuestions;

        // initiates the Toast with context, message and a long duration for the Toast
        Toast toast = Toast.makeText(getApplicationContext(), scoreMessage, Toast.LENGTH_SHORT);
        toast.show(); // displays the Toast
        submitSection1.setVisibility(View.GONE); // hide it
    }

    public void submitAnswersSection2(View view) {

        // Question1
        CheckBox answer1_question1_section2 = (CheckBox) findViewById(
                R.id.checkbox1_answer1_question1_section2);

        CheckBox answer2_question1_section2 = (CheckBox) findViewById(
                R.id.checkbox2_answer2_question1_section2);

        CheckBox answer3_question1_section2 = (CheckBox) findViewById(
                R.id.checkbox3_answer3_question1_section2);

        // Question2
        CheckBox answer1_question2_section2 = (CheckBox) findViewById(
                R.id.checkbox1_answer1_question2_section2);

        CheckBox answer2_question2_section2 = (CheckBox) findViewById(
                R.id.checkbox2_answer2_question2_section2);

        CheckBox answer3_question2_section2 = (CheckBox) findViewById(
                R.id.checkbox3_answer3_question2_section2);

        // Question3
        CheckBox answer1_question3_section2 = (CheckBox) findViewById(
                R.id.checkbox1_answer1_question3_section2);

        CheckBox answer2_question3_section2 = (CheckBox) findViewById(
                R.id.checkbox2_answer2_question3_section2);

        CheckBox answer3_question3_section2 = (CheckBox) findViewById(
                R.id.checkbox3_answer3_question3_section2);

        Button submitSection2 = (Button) findViewById(R.id.section2_submit);

        if (answer1_question1_section2.isChecked() && answer2_question1_section2.isChecked() &&
                answer3_question1_section2.isChecked()) {
            section2Count++;
        } else {
            section2Count += 0;
        }

        if (answer1_question2_section2.isChecked() && answer2_question2_section2.isChecked() &&
                !answer3_question2_section2.isChecked()) {
            section2Count++;
        } else if (answer3_question2_section2.isChecked()) {
            section2Count += 0;
        } else {
            section2Count += 0;
        }

        if (answer1_question3_section2.isChecked() && answer3_question3_section2.isChecked() &&
                !answer2_question3_section2.isChecked()) {
            section2Count++;
        } else if (answer2_question3_section2.isChecked()) {
            section2Count += 0;
        } else {
            section2Count += 0;
        }
        //Toast message
        String toastMessage_submit_button1 = getString(R.string.toast_submit_button2);
        String numberOfQuestions = getString(R.string.number_of_questions);

        scoreMessage = toastMessage_submit_button1 + section2Count + numberOfQuestions;

        // initiates the Toast with context, message and a long duration for the Toast
        Toast toast = Toast.makeText(getApplicationContext(), scoreMessage, Toast.LENGTH_SHORT);
        toast.show(); // displays the Toast
        submitSection2.setVisibility(View.GONE); // hide it
    }


    public void submitAnswersSection3(View view) {
        EditText answer_field1_section3 = (EditText) findViewById(
                R.id.editText1_question1_section3);

        String user_field1 = answer_field1_section3.getText().toString();

        if (user_field1.equals(getString(R.string.lower_case_design_for_testability)) ||
                user_field1.equals(getString(R.string.upper_case_design_for_testability))) {
            section3Count++;
        } else {
            section3Count += 0;
        }

        EditText answer_field2_section3 = (EditText) findViewById(
                R.id.editText2_question2_section3);

        String user_field2 = answer_field2_section3.getText().toString();

        Button submitSection3 = (Button) findViewById(R.id.section3_submit);

        if (user_field2.equals(getString(R.string.lower_case_robot))
                || user_field2.equals(getString(R.string.upper_case_robot))) {
            section3Count++;
        } else {
            section3Count += 0;
        }

        EditText answer_field3 = (EditText) findViewById(
                R.id.editText3_question3_section3);
        String user_field3 = answer_field3.getText().toString();

        if (user_field3.equals(getString(R.string.lower_case_jtag)) ||
                user_field3.equals(getString(R.string.upper_case_jtag))) {
            section3Count++;
        } else {
            section3Count += 0;
        }

        EditText answer_field4 = (EditText) findViewById(
                R.id.editText4_question4_section3);

        String user_field4 = answer_field4.getText().toString();

        if (user_field4.equals(getString(R.string.lower_case_micro_processor)) ||
                user_field4.equals(getString(R.string.upper_case_micro_processor))) {
            section3Count++;
        } else {
            section3Count += 0;
        }
        //Toast message
        String toastMessage_submit_button1 = getString(R.string.section4_score);
        String numberOfQuestions = getString(R.string.total_section_points);

        scoreMessage = toastMessage_submit_button1 + section3Count + numberOfQuestions;

        // initiates the Toast with context, message and a long duration for the Toast
        Toast toast = Toast.makeText(getApplicationContext(), scoreMessage, Toast.LENGTH_SHORT);
        toast.show(); // displays the Toast
        submitSection3.setVisibility(View.GONE); // hide it
    }

    public void getResultSummary(View view) {
        int total_score = correctAnswerCount + section2Count + section3Count;
        String total_score_view = getString(R.string.quiz_results) + "\t";
        String resultSummary = total_score_view + total_score + getString(R.string.total_points);
        Toast toast = Toast.makeText(getApplicationContext(), resultSummary, Toast.LENGTH_LONG);
        toast.show();
    }

    public void startAfresh(View view) {
        Intent intent = new Intent(this, LoginPageActivity.class);
        startActivity(intent);
    }
}