package com.example.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class biology extends AppCompatActivity {

    Button btn_notes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biology);

        btn_notes=findViewById(R.id.notes);

        btn_notes.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), notes1.class);
            startActivity(intent);
            finish();
        });
    }
}