package com.example.guide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class markscheme extends AppCompatActivity {

    PDFView markscheme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_markscheme);

        markscheme=findViewById(R.id.pdfmarkscheme);
        markscheme.fromAsset("EOESM18P1MS.pdf").load();

    }
}