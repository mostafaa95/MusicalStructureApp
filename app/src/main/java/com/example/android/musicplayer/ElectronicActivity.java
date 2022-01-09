package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ElectronicActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_list);
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Daft Punk ", "around the world"));
        songs.add(new Song("Daft punk", "get lucky"));
        songs.add(new Song("Moby", "porecalin"));
        songs.add(new Song("Daft punk", "robot rock"));
        songs.add(new Song("apex twin", "xtal"));
        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

        Song currentSong = (Song) adapterView.getItemAtPosition(position);
        String songForPlaying = currentSong.getSong();
        String composerForPlaying = currentSong.getNameOfComposer();
        Intent songIntent = new Intent(this, PlayerActivity.class);
        songIntent.putExtra("song", songForPlaying);
        songIntent.putExtra("composer", composerForPlaying);
        startActivity(songIntent);
    }
}
