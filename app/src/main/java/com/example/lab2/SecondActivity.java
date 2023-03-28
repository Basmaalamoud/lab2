package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView t = findViewById(R.id.PersonName);
        Intent i = getIntent();
        String s = (i).getStringExtra("PersonName");
        t.setText("Hello ,"+s+"!");
    }
}