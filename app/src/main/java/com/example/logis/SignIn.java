package com.example.logis;

import static android.text.TextUtils.*;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.google.android.material.bottomnavigation.BottomNavigationView;


public class SignIn extends AppCompatActivity {
    EditText email,password;
    Button signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
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

        //Field SignIn
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        signInButton = findViewById(R.id.tombolSignIn);

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkDataEntered();
            }
        });


    }

    //fungsi cek empty field
    void checkDataEntered(){
        if (isEmpty(email.getText().toString())) {
            Toast t = Toast.makeText(this, "Email harus terisi", Toast.LENGTH_SHORT);
            t.show();
        }
        if (isEmpty(password.getText().toString())) {
            Toast t = Toast.makeText(this, "Password harus terisi", Toast.LENGTH_SHORT);
            t.show();
        }
        if(!isEmail(email)){
            email.setError("Masukkan alamat email yang valid");
        }
    };
    boolean isEmail(EditText text) {
        CharSequence email = text.getText().toString();
        return (!isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}