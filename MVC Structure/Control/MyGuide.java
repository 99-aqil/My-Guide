package com.example.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MyGuide extends AppCompatActivity {

    Button btn_edexcel, btn_cambridge, btn_bise, btn_bmeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_guide);

        btn_edexcel=findViewById(R.id.edexcel);
        btn_cambridge=findViewById(R.id.cambridge);
        btn_bise=findViewById(R.id.bise);
        btn_bmeb=findViewById(R.id.bmeb);

        btn_edexcel.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), edexcel.class);
            startActivity(intent);
            finish();
        });

        btn_cambridge.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MyGuide.class);
            startActivity(intent);
            finish();
        });

        btn_bise.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MyGuide.class);
            startActivity(intent);
            finish();
        });

        btn_bmeb.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MyGuide.class);
            startActivity(intent);
            finish();
        });
    }
}