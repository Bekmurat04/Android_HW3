  package com.example.hw3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton call;
    ImageButton camera;
    ImageButton changeCity;
    ImageButton search;
    Button toast;
    String string;
    TextView city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeCity = findViewById(R.id.edit_city);
        camera = findViewById(R.id.ib_camera);
        call = findViewById(R.id.phone);
        search = findViewById(R.id.internet);
        toast = findViewById(R.id.get_toast);
        city = findViewById(R.id.tv_bishkek);


        // поменять город



        //звонок
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phone = new Intent(MainActivity.this, CallActivity.class);
                startActivityForResult(phone, 15);
            }
        });
//гугл
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent google = new Intent(MainActivity.this, GoogleActivity.class);
                startActivityForResult(google, 15);
            }
        });

        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent camera = new Intent(MainActivity.this, CameraActivity.class);
                startActivityForResult(camera, 15);
            }
        });

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "dflklkslknv", Toast.LENGTH_SHORT).show();
            }
        });

        changeCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent city = new Intent(MainActivity.this, CityActivity.class);
                startActivityForResult(city, 15);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 15 && resultCode == RESULT_OK && data != null) {
              string = data.getStringExtra("key");
                city.setText(string);
            }
        }
    }

