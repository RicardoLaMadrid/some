package com.example.calcu.Onboarding;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.calcu.Calcu;
import com.example.calcu.R;
public class f3 extends Fragment {
    private EditText etSelectapp,etUsername;
    private Button btLogin;
    private ViewPager viewPager;
    private View view;
    public f3()
    {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        //initialize viewpager from main activity
        initializeInflater(inflater, container);
        //initialize components
        initializeComponents();
        //add click event to text Next and prev text
        eventClickAction();
        //return
        return view;
    }
    public void initializeInflater(LayoutInflater inflater, ViewGroup container)
    {
        view = inflater.inflate(R.layout.fragment_f3, container, false);
    }
    public void initializeComponents()
    {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);
        btLogin = view.findViewById(R.id.btLogin);
    }
    public void eventClickAction()
    {

        btLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getActivity(), Calcu.class);
                startActivity(intent);
            }
        });
    }
}