package com.example.practiceadvancedgui.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.practiceadvancedgui.R;
import com.google.android.material.tabs.TabLayout;

public class MainActivity8 extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;
    BlankAdapter blankAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        blankAdapter = new BlankAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        viewPager = findViewById(R.id.viewPagerMain8);
        viewPager.setAdapter(blankAdapter);

        tabLayout = findViewById(R.id.tabLayoutMain8);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText("Home").setIcon(R.drawable.ic_baseline_home_24);
        tabLayout.getTabAt(1).setText("Setting").setIcon(R.drawable.ic_baseline_settings_24);
        tabLayout.getTabAt(2).setText("Help").setIcon(R.drawable.ic_baseline_help_24);
    }
}