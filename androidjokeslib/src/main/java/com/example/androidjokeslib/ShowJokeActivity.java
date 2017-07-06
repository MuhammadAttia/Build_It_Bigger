package com.example.androidjokeslib;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowJokeActivity extends AppCompatActivity {

    public static final String EXTRA_JOKE = "extra joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_joke);

        String joke = getIntent().getStringExtra(ShowJokeActivity.EXTRA_JOKE);
        TextView jokeTextView = (TextView) findViewById(R.id.joketext_view);
        if (joke != null && joke.length() != 0) {
            jokeTextView.setText(joke);
        }
    }
}
