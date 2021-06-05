package com.example.practiceadvancedgui.viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class OneAdapter extends FragmentStatePagerAdapter {

    public OneAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Override
    public Fragment getItem(int position) {
        return OneFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return 4;
    }
}
