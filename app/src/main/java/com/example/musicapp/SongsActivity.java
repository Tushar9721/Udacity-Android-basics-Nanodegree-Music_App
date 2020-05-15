package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    public ArrayList<SongsData> data = new ArrayList<>();
    public RecyclerView recyclerView;
    public ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);
        backButton = findViewById(R.id.backButton);
        recyclerView = findViewById(R.id.recyclerView);
        setAdapter();
        setOnclickListener();

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

        SongsAdapter adapter = new SongsAdapter(this,data);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
