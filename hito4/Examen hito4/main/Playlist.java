package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview.Adapter.RVAdapter;
import com.example.recyclerview.Adapter.RVAdapter2;

import java.util.ArrayList;
import java.util.Arrays;

public class Playlist extends AppCompatActivity {
    private RecyclerView recyclerView2;
    private RVAdapter2 rvAdapter2;
    private ArrayList<String> imagesName1 = new ArrayList<>();
    private ArrayList<String> imagesURL1 = new ArrayList<>();
    private ArrayList<String> imagesURL2 = new ArrayList<>();
    private ArrayList<String> imagesURL3 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);
        initImageBitMaps();
        initRecyclerView();
    }
    public void initImageBitMaps()
    {
         String imUR1="59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq";
         String imUR2="2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ";
         String imUR3="LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe";
         String imName1="music 1,music 2,music 3,music 4,music 5,music 6,music 7,music 8,music 9,music 10,music 11";
        imagesURL1.addAll(Arrays.asList(imUR1.split(",")));
        imagesURL2.addAll(Arrays.asList(imUR2.split(",")));
        imagesURL3.addAll(Arrays.asList(imUR3.split(",")));
        imagesName1.addAll(Arrays.asList(imName1.split(",")));
    }

    public void initRecyclerView()
    {
        recyclerView2 = findViewById(R.id.rvContainer2);
        rvAdapter2 = new RVAdapter2(this, imagesName1, imagesURL1,imagesURL2,imagesURL3);
        recyclerView2.setAdapter(rvAdapter2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
    }


}