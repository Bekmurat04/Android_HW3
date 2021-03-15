package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toolbar;

public class CallActivity extends AppCompatActivity {

    Toolbar tb;
    Button save;
    EditText editText;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        tb = findViewById(R.id.toolbar);
        save = findViewById(R.id.save);
        editText = findViewById(R.id.change_phoneNumber);
        imageView = findViewById(R.id.imageView_call);
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
                String phoneNumber = null;
                Intent intent = new Intent(
                        ContactsContract.Intents.SHOW_OR_CREATE_CONTACT,
                        Uri.parse("tel:" + phoneNumber));
                intent.putExtra(ContactsContract.Intents.EXTRA_FORCE_CREATE, true);
                startActivity(intent);
            }
        });


    }
}