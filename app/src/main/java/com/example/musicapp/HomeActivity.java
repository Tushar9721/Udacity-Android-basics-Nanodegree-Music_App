package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    TextView songsView;
    TextView playList;
    TextView albumView;
    TextView artistView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        songsView = findViewById(R.id.songsView);
        artistView = findViewById(R.id.artistView);
        playList = findViewById(R.id.playList);
        albumView = findViewById(R.id.albumView);

        setOnClickListeners();
    }

    private void setOnClickListeners() {
        albumView.setOnClickListener(this);
        songsView.setOnClickListener(this);
        playList.setOnClickListener(this);
        artistView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.songsView:
                Intent intent=new Intent(getApplicationContext(),SongsActivity.class);
                startActivity(intent);
                break;

            case R.id.playList:
                Intent playListIntent = new Intent(getApplicationContext(),PlayListActivity.class);
                startActivity(playListIntent);
                break;

            case R.id.artistView:
                Intent artistIntent = new Intent(getApplicationContext(),ArtistActivity.class);
                startActivity(artistIntent);
                break;

            case R.id.albumView:
                Intent albumViewIntent = new Intent(getApplicationContext(),AlbumActivity.class);
                startActivity(albumViewIntent);
                break;

        }

        }
}
