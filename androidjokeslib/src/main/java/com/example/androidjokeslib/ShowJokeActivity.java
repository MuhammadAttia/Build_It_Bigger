package com.example.androidjokeslib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowJokeActivity extends AppCompatActivity {

    public static final String EXTRA_JOKE = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_joke);

        String joke = getIntent().getStringExtra(ShowJokeActivity.EXTRA_JOKE);
        TextView jokeTextView = (TextView) findViewById(R.id.joketext);
        if (joke != null && joke.length() != 0) {
            jokeTextView.setText(joke);
        }
    }
}
