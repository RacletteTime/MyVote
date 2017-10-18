package com.pierre.myvote;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class ChoiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        TextView textView = (TextView) findViewById(R.id.choiceTitle);

        Intent intent = getIntent();
        String message = intent.getStringExtra(CustomAdapter.EXTRA_MESSAGE);
        textView.setText(message);
    }
}
