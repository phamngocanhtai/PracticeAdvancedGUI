package com.example.practiceadvancedgui.contextmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.practiceadvancedgui.R;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity implements ContactAdapter.OnItemLongClick {

    RecyclerView recyclerView;
    ArrayList<Contact> contactArrayList;
    ContactAdapter contactAdapter;
    int mPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        contactArrayList = Contact.getMockData();

        contactAdapter = new ContactAdapter(MainActivity3.this, contactArrayList, MainActivity3.this);

        recyclerView = findViewById(R.id.rvContact);
        recyclerView.setAdapter(contactAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        registerForContextMenu(recyclerView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.context_menu, menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.mnuEdit:
                Toast.makeText(this, "Menu Edit".concat(" Pos ").concat(String.valueOf(mPos)), Toast.LENGTH_SHORT).show(); break;
            case R.id.mnuDelete:
                Toast.makeText(this, "Menu Delete".concat(" Pos ").concat(String.valueOf(mPos)), Toast.LENGTH_SHORT).show(); break;
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public void setOnUserLongClick(int mPos) {
        mPos = mPos;
    }
}