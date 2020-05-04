package com.example.defensahito3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Basica extends AppCompatActivity {
    private TextView tvShowUsername;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basica);
        initializeComponents();
    }

    private void initializeComponents()
    {
        tvShowUsername = findViewById(R.id.tvShowUsername);
        String username = getIntent().getStringExtra("username");
        String msg = "App: Basica \n Bienvenido: " + username;
        tvShowUsername.setText(msg);
    }
}
