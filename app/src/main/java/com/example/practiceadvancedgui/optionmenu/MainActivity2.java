package com.example.practiceadvancedgui.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.practiceadvancedgui.R;

public class MainActivity2 extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        toolbar = findViewById(R.id.tbrOptionMenu);
        toolbar.setTitle("Option Menu");
        toolbar.setTitleTextColor(getColor(R.color.white));

        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.option_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.mnuAdd:
                Toast.makeText(this, "Menu Add", Toast.LENGTH_SHORT).show(); break;
            case R.id.mnuDash:
                Toast.makeText(this, "Menu Dashboard", Toast.LENGTH_SHORT).show(); break;
        }
        return super.onOptionsItemSelected(item);
    }
}