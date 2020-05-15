package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    TextView songsView;
    TextView playList;
    TextView albumView;
    TextView artistView;
    TextView timeOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        songsView = findViewById(R.id.songsView);
        artistView = findViewById(R.id.artistView);
        playList = findViewById(R.id.playList);
        albumView = findViewById(R.id.albumView);
        timeOut = findViewById(R.id.timeOut);

        Calendar cal = Calendar.getInstance();

        SimpleDateFormat timeOnly = new SimpleDateFormat("HH:mm:ss");
        if(cal.getTime().getHours()<=11){
            timeOut.setText("Good Morning....");
        }
        else if(cal.getTime().getHours()>11 && cal.getTime().getHours() <= 17 ){
            timeOut.setText("Good Afternoon....");
        }
        else {
            timeOut.setText("Good Evening....");
        }

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
