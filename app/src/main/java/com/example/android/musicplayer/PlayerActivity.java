package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player);

        playing();
    }

    public void playing() {
        // Get extras from Intent.
        Intent opusIntent = getIntent();

        // Set the name of opus for playing.
        TextView opusTextView = findViewById(R.id.player_song);
        String songForPlaying = opusIntent.getStringExtra("song");
        opusTextView.setText(songForPlaying);

        // Set the name of composer for playing.
        TextView composerTextView = findViewById(R.id.player_composer);
        String composerForPlaying = opusIntent.getStringExtra("composer");
        composerTextView.setText(composerForPlaying);
    }
}
