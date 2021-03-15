package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class CityActivity extends AppCompatActivity {

    Toolbar tb;
    Button save;
    EditText editText;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);



        tb = findViewById(R.id.toolbar);
        save = findViewById(R.id.save);
        editText = findViewById(R.id.change_cityName);
        imageView = findViewById(R.id.imageView_city);
        setActionBar(tb);



        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        tb.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            finish();

            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                intent.putExtra("key", editText.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });



    }
}