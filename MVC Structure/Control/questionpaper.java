package com.example.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;


public class questionpaper extends AppCompatActivity {

    PDFView questionpaper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionpaper);

        questionpaper=findViewById(R.id.pdfquestionpaper);
        questionpaper.fromAsset("EOMBJ19P1QP.pdf").load();



    }
}