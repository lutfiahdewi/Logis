package com.example.logis;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.logis.adapter.SchedulerAdapter;
import com.example.logis.model.Scheduler;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
public class Schedule extends AppCompatActivity {
    private FloatingActionButton addScheduleButton;
    private RecyclerView recyclerView;
    private SchedulerAdapter adapter;
    private ArrayList<Scheduler> schedulerArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        // Initialize and assign variable
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottomNavigationView);

        // Set Home selected
        bottomNavigationView.setSelectedItemId(R.id.menuSchedule);

        // Perform item selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId())
                {
                    case R.id.menuSchedule:
                        return true;
                    case R.id.menuAccount:
                        startActivity(new Intent(getApplicationContext(), Account.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.menuHome:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

        //List Jadwal
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new SchedulerAdapter(schedulerArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Schedule.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        //add button
        addScheduleButton = findViewById(R.id.tombolAdd);

        addScheduleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),addSchedule.class));
                overridePendingTransition(0,0);
            }
        });
    }

    void addData() {
        schedulerArrayList = new ArrayList<>();
        schedulerArrayList.add(new Scheduler(1,78,"sby","09:00","jkt","22:30",650000,300));
        schedulerArrayList.add(new Scheduler(1,781,"sby","09:00","jkt","22:30",650000,300));
        schedulerArrayList.add(new Scheduler(1,782,"sby","09:00","jkt","22:30",650000,300));
        //schedulerArrayList.add(new Scheduler());
    }
}