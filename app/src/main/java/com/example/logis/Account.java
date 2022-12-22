package com.example.logis;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class Account extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        // Initialize and assign variable
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottomNavigationView);

        // Set Home selected
        bottomNavigationView.setSelectedItemId(R.id.menuAccount);

        // Perform item selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId())
                {
                    case R.id.menuAccount:
                        return true;
                    case R.id.menuSchedule:
                        startActivity(new Intent(getApplicationContext(),Schedule.class));
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

        //List Menu Account
        ListView listView = findViewById(R.id.listMenuAccount);

        List<String> list = new ArrayList<>();
        list.add("Register");
        list.add("Sign In");
        list.add("Profil Saya");
        list.add("About Us");
        list.add("Sign Out");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    startActivity(new Intent(Account.this,Register.class));
                    overridePendingTransition(0,0);
                }else if(position==1){
                    startActivity(new Intent(getApplicationContext(),SignIn.class));
                    overridePendingTransition(0,0);
                }else if(position==2){
                    startActivity(new Intent(getApplicationContext(),Profil.class));
                    overridePendingTransition(0,0);
                }else if(position==3){
                    startActivity(new Intent(getApplicationContext(),AboutUs.class));
                    overridePendingTransition(0,0);
                }else if(position==4){
                    Toast t = Toast.makeText(view.getContext(), "Anda sudah berhasil log out", Toast.LENGTH_SHORT);
                    t.show();
                }
            }
        });
    }
}