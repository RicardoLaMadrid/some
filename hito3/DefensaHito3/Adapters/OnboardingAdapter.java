package com.example.defensahito3.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.defensahito3.Onboarding.FragmentDos;
import com.example.defensahito3.Onboarding.FragmentTres;
import com.example.defensahito3.Onboarding.FragmentUno;

public class OnboardingAdapter extends FragmentPagerAdapter {
    public OnboardingAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                return new FragmentUno();
            case 1:
                return new FragmentDos();
            case 2:
                return new FragmentTres();

            default:
                return null;
        }
    }

    @Override
    public int getCount()
    {
        return 3;
    }
}
