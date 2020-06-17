package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.recyclerview.Adapter.RVAdapter;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity
{

    private RecyclerView recyclerView;
    private RVAdapter rvAdapter;
    private ArrayList<String> imagesName = new ArrayList<>();
    private ArrayList<String> imagesURL = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initImageBitMaps();
        initRecyclerView();
    }

    public void initImageBitMaps()
    {
        String imUR="DJabk5C,sypYnSP,9jMbaX2,XzffKgy,yB3d2qH,HBeK1ot,V4OgA4O,rYndmdq,YCqbt8r,eLk31XX,4ZHp7FO";
        String imName="Playlist 1,Playlist 2,Playlist 3,Playlist 4,Playlist 5,Playlist 6,Playlist 7,Playlist 8,Playlist 9,Playlist 10,Playlist 11";
        imagesURL.addAll(Arrays.asList(imUR.split(",")));
        imagesName.addAll(Arrays.asList(imName.split(",")));
    }

    public void initRecyclerView()
    {
        recyclerView = findViewById(R.id.rvContainer);
        rvAdapter = new RVAdapter(this, imagesName, imagesURL);
        recyclerView.setAdapter(rvAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}