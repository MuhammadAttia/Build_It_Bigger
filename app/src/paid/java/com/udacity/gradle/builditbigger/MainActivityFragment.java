package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.androidjokeslib.ShowJokeActivity;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public boolean testOk = false;

    public String Joke = null;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        Button button = (Button) root.findViewById(R.id.joke_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getJoke();
            }
        });
        return root;
    }

    public void getJoke() {
        new JokeAsyncTask().execute(this);
    }

    public void DisplayJokeActivity() {
        if (!testOk) {
            Context context = getActivity();
            Intent intent = new Intent(context, ShowJokeActivity.class);
            intent.putExtra(ShowJokeActivity.EXTRA_JOKE, Joke);
            context.startActivity(intent);
        }

    }

}
