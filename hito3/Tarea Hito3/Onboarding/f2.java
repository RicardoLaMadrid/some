package com.example.calcu.Onboarding;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.calcu.R;
public class f2 extends Fragment {
    private TextView textPrev, textNext;
    private TextView textDoneIns, textPrevIns;
    private ViewPager viewPager;
    private View view;
    public f2() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        //initialize view pager from main activity
        _initializeInflater(inflater, container);
        //initialize components
        _initialize();
        //add click event to text Next and prev text
        _addClickDoneAndPrev();
        //return
        return view;
    }
    private void _addClickDoneAndPrev() {
        textPrev.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                viewPager.setCurrentItem(3);
            }
        });

        textNext.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                viewPager.setCurrentItem(2);
            }
        });
    }
    private void _initialize() {
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);
        textNext = view.findViewById(R.id.textNext);
        textPrev = view.findViewById(R.id.Skip);
    }
    private void _initializeInflater(LayoutInflater inflater, ViewGroup container) {
        view = inflater.inflate(R.layout.fragment_f2, container, false);
    }
}
