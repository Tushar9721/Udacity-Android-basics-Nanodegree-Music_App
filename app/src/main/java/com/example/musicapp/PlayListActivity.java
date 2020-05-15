package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayListActivity extends AppCompatActivity{


    TextView favourite;
    TextView mostPlayed;
    TextView recentlyPlayed;
    TextView custom;
    ImageView backButtonPlaylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list);


        favourite = findViewById(R.id.favourite);
        mostPlayed = findViewById(R.id.mostPlayed);
        recentlyPlayed = findViewById(R.id.recentlyPlayed);
        custom = findViewById(R.id.custom);
        backButtonPlaylist = findViewById(R.id.backButtonPlaylist);

        setOnclick();

    }

    private void setOnclick() {

        favourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SongsActivity.class);
                startActivity(intent);
            }
        });
        mostPlayed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SongsActivity.class);
                startActivity(intent);
            }
        });
        recentlyPlayed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SongsActivity.class);
                startActivity(intent);
            }
        });
        custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SongsActivity.class);
                startActivity(intent);
            }
        });

        backButtonPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }


}
