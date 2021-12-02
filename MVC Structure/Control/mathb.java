package com.example.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class mathb extends AppCompatActivity {

    Button btn_pastpapers, btn_notes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathb);

        btn_pastpapers=findViewById(R.id.pastpapers);
        btn_notes=findViewById(R.id.notes);

        btn_pastpapers.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(),pastpapers1.class);
            startActivity(intent);
            finish();
        });

        btn_notes.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), mathb.class);
            startActivity(intent);
            finish();
        });
    }
}