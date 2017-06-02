package com.example.jhonatan.leo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Homologaciones extends AppCompatActivity {

    WebView wHomologaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homologaciones);

        wHomologaciones  =(WebView)findViewById(R.id.homologa);
        wHomologaciones.loadUrl("http://www.uniremington.edu.co/manizales/782-homologaciones.html");
    }
}
