package com.example.onboardingappt.Onboarding;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.onboardingappt.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TextRecognitionFragment extends Fragment {

    public TextRecognitionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_text_recognition, container, false);
    }
}
