package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class RockActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_list);
        ArrayList<Song> songs = new ArrayList<Song>();
        // Adding opuses to an array.
        songs.add(new Song("Pink Floyd", "us and them"));
        songs.add(new Song("Black sabbath", "Paranoid"));
        songs.add(new Song("Radiohead", "reckoner"));
        songs.add(new Song("Muse", "plug in baby"));
        songs.add(new Song("Led zeppelin", "kashmir"));
        songs.add(new Song("Radiohead", "kid a"));
        songs.add(new Song("Muse", "Panic Station"));
        songs.add(new Song("Motorhead", "ace of spades"));

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
