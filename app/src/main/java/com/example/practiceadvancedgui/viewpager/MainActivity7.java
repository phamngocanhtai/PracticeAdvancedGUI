package com.example.practiceadvancedgui.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.practiceadvancedgui.R;

public class MainActivity7 extends AppCompatActivity {

    ViewPager viewPager;
    OneAdapter oneAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        oneAdapter = new OneAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager = findViewById(R.id.viewPagerMain7);
        viewPager.setAdapter(oneAdapter);
    }
}