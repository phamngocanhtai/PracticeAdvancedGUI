package com.example.practiceadvancedgui.drawerlayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.practiceadvancedgui.R;
import com.google.android.material.navigation.NavigationView;

public class MainActivity10 extends AppCompatActivity {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView navigationView;
    ActionBarDrawerToggle actionBarDrawerToggle;
    TextView txtUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        toolbar = findViewById(R.id.tbrMain10);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawerLayoutMain10);
        navigationView = findViewById(R.id.navMain10);

        actionBarDrawerToggle = new ActionBarDrawerToggle(MainActivity10.this, drawerLayout, toolbar,
                                                                R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                ShowFragment(item.getItemId());
                return true;
            }
        });
        ShowFragment(R.id.mnuHome);

        View headerView = navigationView.getHeaderView(0);
        txtUser = headerView.findViewById(R.id.txtUser);
        txtUser.setText("abc@example.com");
    }

    private void ShowFragment(int itemId) {

        Fragment fragment = null;
        switch (itemId)
        {
            case R.id.mnuHome: fragment = new Blank1Fragment(); toolbar.setTitle("Home"); break;
            case R.id.mnuSetting: fragment = new Blank2Fragment(); toolbar.setTitle("Setting"); break;
            case R.id. mnuHelp: fragment = new Blank3Fragment(); toolbar.setTitle("Help"); break;
        }

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.contentMain10, fragment);
        ft.commit();
        drawerLayout.closeDrawers();
    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);

        actionBarDrawerToggle.syncState();
    }
}