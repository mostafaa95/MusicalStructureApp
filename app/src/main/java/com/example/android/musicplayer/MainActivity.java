package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView rockTextView = findViewById(R.id.rock);
        TextView electronicTextView = findViewById(R.id.electronic);
        TextView arabicTextView = findViewById(R.id.arabic);

        rockTextView.setOnClickListener(v -> {
            Intent rockIntent = new Intent(MainActivity.this, RockActivity.class);
            startActivity(rockIntent);

        });

        electronicTextView.setOnClickListener(v -> {
            Intent electronicIntent = new Intent(MainActivity.this, ElectronicActivity.class);
            startActivity(electronicIntent);
        });

        arabicTextView.setOnClickListener(v -> {
            Intent arabicIntent = new Intent(MainActivity.this, ArabicActivity.class);
            startActivity(arabicIntent);
        });
    }
}