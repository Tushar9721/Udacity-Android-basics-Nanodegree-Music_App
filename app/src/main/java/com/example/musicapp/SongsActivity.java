package com.example.musicapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    public ArrayList<SongsData> data = new ArrayList<>();
    public SongsData songsData;
    public RecyclerView recyclerView;
    public ImageView backButton;
    public String[] songName = {"Yummy", "How long", "7 Rings", "Attention", "Wolves", "CrossFire", "Perfect", "Friends", "Shape of you", "East Side", "Mr Man", "Start a fire"};
    public String[] artistName = {"Justin Bieber", "Charlie Puth", "Ariana Grande", "Charlie Puth", "Selina Gomez", "Stephen", "Ed Sheeran", "Marshmellow", "Ed Sheeran", "Benny Blanco", "Setphen", "Stephen"};
    public String[] duration = {"3:10 min", "3:30 min", "3:05 min", "3:52 min", "3:00 min", "2:50 min", "3:00 min", "3:00 min", "3:10 min", "4:10 min", "2:10 min", "2:40 min"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
        backButton = findViewById(R.id.backButton);
        recyclerView = findViewById(R.id.recyclerView);

        addValues(songName, artistName, duration);
        setAdapter();
        setOnclickListener();

    }


    private void addValues(String[] name, String[] artist, String[] duration) {

        for (int i = 0; i < songName.length; i++) {
            songsData = new SongsData(name[i], artist[i], duration[i]);
            data.add(songsData);

        }


    }

    private void setOnclickListener() {

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    private void setAdapter() {

        SongsAdapter adapter = new SongsAdapter(this, data);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
