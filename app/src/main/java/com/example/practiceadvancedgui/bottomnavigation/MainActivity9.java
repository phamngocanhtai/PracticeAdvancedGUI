package com.example.practiceadvancedgui.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.practiceadvancedgui.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity9 extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        bottomNavigationView = findViewById(R.id.bottomNAVMain9);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                ShowFragment(item.getItemId());
                return true;
            }
        });
        ShowFragment(R.id.mnuHome);
    }

    private void ShowFragment(int itemId) {

        Fragment fragment = null;

        switch (itemId)
        {
            case R.id.mnuHome: fragment = new Blank1Fragment(); break;
            case R.id.mnuSetting: fragment = new Blank2Fragment(); break;
            case R.id.mnuHelp: fragment = new Blank3Fragment(); break;
        }

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.contentMain9, fragment);
        ft.commit();
    }
}