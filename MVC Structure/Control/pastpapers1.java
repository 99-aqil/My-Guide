package com.example.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class pastpapers1 extends AppCompatActivity {

    Button btn_questionpaper, btn_markscheme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pastpapers1);

        btn_questionpaper=findViewById(R.id.questionpaper);
        btn_markscheme=findViewById(R.id.markscheme);

        btn_questionpaper.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), questionpaper.class);
            startActivity(intent);
            finish();
        });

        btn_markscheme.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), markscheme.class);
            startActivity(intent);
            finish();
        });
    }
}