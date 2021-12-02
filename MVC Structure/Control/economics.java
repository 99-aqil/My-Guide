package com.example.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class economics extends AppCompatActivity {

    Button btn_pastpapers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_economics);

        btn_pastpapers=findViewById(R.id.pastpapers);

        btn_pastpapers.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(),pastpapers1.class);
            startActivity(intent);
            finish();
        });
    }
}