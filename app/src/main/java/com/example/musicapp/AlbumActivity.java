package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AlbumActivity extends AppCompatActivity {



    ImageView backButtonAlbum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_acitvity);

        //creating views.
        backButtonAlbum = findViewById(R.id.backButtonAlbum);

        //adding Onclick listener.
        backButtonAlbum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
