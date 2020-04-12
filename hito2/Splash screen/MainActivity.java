package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView imgLogo;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeVariables();

    }


    public void initializeVariables(){
        imgLogo = findViewById(R.id.imgLogo);

    }
    public void onClick(View v) {
        switch (v.getId()) {


        }

    }

    private void createAnmationForLogo() {
        imgLogo.animate().translationY(-900).setDuration(1200).setStartDelay(300);
    }



}
