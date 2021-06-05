package com.example.practiceadvancedgui.popupmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.practiceadvancedgui.R;

public class MainActivity4 extends AppCompatActivity {

    ImageView imgPopup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        imgPopup = findViewById(R.id.imgPopup);
        imgPopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(MainActivity4.this, v);
                popupMenu.inflate(R.menu.popup_menu);
                popupMenu.show();

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId())
                        {
                            case R.id.mnuProfile:
                                Toast.makeText(MainActivity4.this, "Menu Profile Popup", Toast.LENGTH_SHORT).show(); break;
                            case R.id.mnuAbout:
                                Toast.makeText(MainActivity4.this, "Menu About Popup", Toast.LENGTH_SHORT).show(); break;
                        }
                        return false;
                    }
                });
            }
        });
    }
}