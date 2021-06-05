package com.example.practiceadvancedgui.swiperefreshlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;

import com.example.practiceadvancedgui.R;

import java.util.ArrayList;

public class MainActivity11 extends AppCompatActivity implements ContactAdapter.OnItemLongClick {

    RecyclerView recyclerView;
    ArrayList<Contact> contactArrayList;
    ContactAdapter contactAdapter;
    int pos;
    SwipeRefreshLayout swipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        contactArrayList = Contact.getMockData();
        contactAdapter = new ContactAdapter(MainActivity11.this, contactArrayList, MainActivity11.this);

        recyclerView = findViewById(R.id.recyclerViewMain11);
        recyclerView.setAdapter(contactAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity11.this, LinearLayoutManager.VERTICAL, false));

        swipeRefreshLayout = findViewById(R.id.swipeRefreshMain11);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                contactArrayList.add(new Contact("Swipe Refresh", 0));
                contactAdapter.notifyDataSetChanged();
                swipeRefreshLayout.setRefreshing(true);
            }
        });
    }

    @Override
    public void setOnUserLongClick(int mPos) {
        pos = mPos;
    }
}