package com.example.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class olevel extends AppCompatActivity {

    Button btn_mathb, btn_physics, btn_economics, btn_puremath, btn_bengali,
            btn_biology, btn_chemistry, btn_commerce, btn_english, btn_accounting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_olevel);

        btn_mathb=findViewById(R.id.mathb);
        btn_physics=findViewById(R.id.physics);
        btn_puremath=findViewById(R.id.puremath);
        btn_accounting=findViewById(R.id.accounting);
        btn_bengali=findViewById(R.id.bengali);
        btn_biology=findViewById(R.id.biology);
        btn_chemistry=findViewById(R.id.chemistry);
        btn_commerce=findViewById(R.id.commerce);
        btn_english=findViewById(R.id.english);
        btn_economics=findViewById(R.id.economics);

        btn_mathb.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), mathb.class);
            startActivity(intent);
            finish();
        });

        btn_physics.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), physics.class);
            startActivity(intent);
            finish();
        });

        btn_puremath.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), olevel.class);
            startActivity(intent);
            finish();
        });

        btn_accounting.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), olevel.class);
            startActivity(intent);
            finish();
        });

        btn_bengali.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), olevel.class);
            startActivity(intent);
            finish();
        });

        btn_biology.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), biology.class);
            startActivity(intent);
            finish();
        });

        btn_chemistry.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), chemistry.class);
            startActivity(intent);
            finish();
        });

        btn_commerce.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), olevel.class);
            startActivity(intent);
            finish();
        });

        btn_economics.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), economics.class);
            startActivity(intent);
            finish();
        });

        btn_english.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), olevel.class);
            startActivity(intent);
            finish();
        });
    }
}