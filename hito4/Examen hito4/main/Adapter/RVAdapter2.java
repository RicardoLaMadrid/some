package com.example.recyclerview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.recyclerview.R;

import java.util.ArrayList;

public class RVAdapter2 extends RecyclerView.Adapter<ViewHolder2> {

    private Context context;
    private ArrayList<String> imageNames;
    private  ArrayList<String> imagesURI1;
    private  ArrayList<String> imagesURI2;
    private  ArrayList<String> imagesURI3;

    public RVAdapter2(Context context1, ArrayList<String> imageNames1, ArrayList<String> imagesURI1 ,ArrayList<String> imagesURI2,ArrayList<String> imagesURI3 ) {
        this.context=context1;
        this.imageNames=imageNames1;
        this.imagesURI1=imagesURI1;
        this.imagesURI2=imagesURI2;
        this.imagesURI3=imagesURI3;
    }
    @Override
    public ViewHolder2 onCreateViewHolder(ViewGroup viewGroup, int viewType){
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rl_list_item2,viewGroup,false);
        ViewHolder2 vHolder = new ViewHolder2(view);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder2 holder, final int position) {
        String URI = "https://i.imgur.com/";

        Glide.with(context).asBitmap()
                .load(URI + imagesURI1.get(position)+ ".png").into(holder.getTvImage1());

        Glide.with(context).asBitmap()
                .load(URI + imagesURI2.get(position)+ ".png").into(holder.getTvImage2());

        Glide.with(context).asBitmap()
                .load(URI + imagesURI3.get(position)+ ".png").into(holder.getTvImage3());

        holder.getTvImage1().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                holder.getTvImage1().setVisibility(View.INVISIBLE);
                holder.getTvImage2().setVisibility(View.VISIBLE);
            }
        });
        holder.getTvImage2().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                holder.getTvImage1().setVisibility(View.VISIBLE);
                holder.getTvImage2().setVisibility(View.INVISIBLE);
            }
        });
                holder.getTvImage3().setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "Stop " , Toast.LENGTH_SHORT).show();
                    }
                });
            }

    @Override
    public int getItemCount() {
        return imageNames.size();
    }
}
