package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toolbar;

public class CameraActivity extends AppCompatActivity {

    Toolbar toolbar;
    Button btnPhoto;
    Button btnVideo;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        img = findViewById(R.id.img);
        toolbar = findViewById(R.id.toolbar);
        setActionBar(toolbar);
        btnPhoto = findViewById(R.id.btn1);
        btnVideo = findViewById(R.id.btn2);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCamera = new Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA);
                startActivity(intentCamera);
            }
        });
        btnVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentVideo = new Intent(MediaStore.INTENT_ACTION_VIDEO_CAMERA);
                startActivity(intentVideo);
            }
        });


    }
}