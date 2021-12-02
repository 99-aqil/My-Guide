package com.example.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class edexcel extends AppCompatActivity {

    Button btn_olevel, btn_alevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edexcel);

        btn_olevel=findViewById(R.id.olevel);
        btn_alevel=findViewById(R.id.alevel);

        btn_olevel.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), olevel.class);
            startActivity(intent);
            finish();
        });

        btn_alevel.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), edexcel.class);
            startActivity(intent);
            finish();
        });
    }
}