package com.example.practiceadvancedgui.viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0: return PagerFragment.newInstance(0);
            case 1: return PagerFragment.newInstance(1);
            case 2: return PagerFragment.newInstance(2);
            case 3: return PagerFragment.newInstance(3);
            case 4: return PagerFragment.newInstance(4);
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
