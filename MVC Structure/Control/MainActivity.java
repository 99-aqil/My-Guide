package com.example.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_myguide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_myguide=findViewById(R.id.myguide);

        btn_myguide.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MyGuide.class);
            startActivity(intent);
            finish();
        });
    }
}