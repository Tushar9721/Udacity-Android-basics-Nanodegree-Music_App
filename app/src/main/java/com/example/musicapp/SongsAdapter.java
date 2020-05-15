package com.example.musicapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SongsAdapter extends RecyclerView.Adapter<SongsAdapter.ViewHolder> {


    private Context context;
    private ArrayList<SongsData> data = new ArrayList<>();

    public SongsAdapter(Context context, ArrayList<SongsData> data) {
        this.context = context;
        this.data = data;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.songs_list_view,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {

        //set text to adapter here.
        holder.artistName.setText(data.get(position).artistName);
        holder.duration.setText(data.get(position).duration);
        holder.songsName.setText(data.get(position).songName);


        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context,ParticularSong.class);
                context.startActivity(intent);


            }
        });


    }

    @Override
    public int getItemCount()
    {
        return data.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView songsName;
        TextView artistName;
        TextView duration;
        RelativeLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            songsName = itemView.findViewById(R.id.songName);
            artistName = itemView.findViewById(R.id.artistName);
            duration = itemView.findViewById(R.id.duration);
            parentLayout = itemView.findViewById(R.id.relativeLayout);
        }
    }
}