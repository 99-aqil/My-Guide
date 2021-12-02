package com.example.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class notes1 extends AppCompatActivity {

    PDFView notes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes1);

        notes1=findViewById(R.id.pdfnotes1);
        notes1.fromAsset("EOBYN.pdf").load();
    }
}