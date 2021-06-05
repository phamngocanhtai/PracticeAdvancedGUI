package com.example.practiceadvancedgui.viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class BlankAdapter extends FragmentStatePagerAdapter {

    public BlankAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0: return new Blank1Fragment();
            case 1: return new Blank2Fragment();
            case 2: return new Blank3Fragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
