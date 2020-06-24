package com.example.ejemploimportarlibreria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.libraryonboarding.Adapters.OnboardingAdapter;


public class MainActivity extends AppCompatActivity {

    private ViewPager viewPagerContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(com.example.libraryonboarding.R.layout.activity_main);

        //initializeComponents
        _initializeComponents();

        //initializeAdapter
        _initializeFragmentAdapter();
    }

    public void _initializeComponents()
    {
        viewPagerContainer = findViewById(com.example.libraryonboarding.R.id.viewPagerContainer);
    }

    public void _initializeFragmentAdapter()
    {
        OnboardingAdapter adapter = new OnboardingAdapter(getSupportFragmentManager());
        viewPagerContainer.setAdapter(adapter);
    }

}
