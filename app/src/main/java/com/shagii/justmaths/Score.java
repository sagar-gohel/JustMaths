package com.shagii.justmaths;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Score extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        TextView tv = (TextView) findViewById(R.id.score);
        int score = getIntent().getIntExtra("score", 0);
        tv.setText("Current Score : " + score);
    }
}