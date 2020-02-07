package com.example.android.androidjokelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainJokeActivity extends AppCompatActivity {

    TextView jokeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_joke);

        Intent intent = getIntent();
        String joke = intent.getStringExtra(Intent.EXTRA_TEXT);

        jokeText = (TextView) findViewById(R.id.tv_joke);
        jokeText.setText(joke);
    }
}
