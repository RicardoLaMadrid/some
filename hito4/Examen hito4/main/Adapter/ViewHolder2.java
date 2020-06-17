package com.example.recyclerview.Adapter;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.request.target.Target;
import com.example.recyclerview.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ViewHolder2 extends RecyclerView.ViewHolder {

    private RelativeLayout rlContainer;
    private CircleImageView circleImage1,circleImage2,circleImage3;
    private TextView tvImage;

    public ViewHolder2( View itemView) {
        super(itemView);
        initComponents(itemView);
    }

    private void initComponents(View itemView) {
        rlContainer= itemView.findViewById(R.id.rlListItem2);
        circleImage1= itemView.findViewById(R.id.civItem1);
        circleImage2= itemView.findViewById(R.id.civItem2);
        circleImage3= itemView.findViewById(R.id.civItem3);

        tvImage= itemView.findViewById(R.id.tvImage);

    }
    public RelativeLayout getRlContainer() {
        return rlContainer;
    }

    public CircleImageView getTvImage1() {
        return circleImage1;
    }
    public CircleImageView getTvImage2() {
        return circleImage2;
    }
    public CircleImageView getTvImage3() {
        return circleImage3;
    }

    public TextView getTvImage() {
        return tvImage;
    }



}