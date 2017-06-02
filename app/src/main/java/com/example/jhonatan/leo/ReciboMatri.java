package com.example.jhonatan.leo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ReciboMatri extends AppCompatActivity {
    WebView wRecibo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibo_matri);

        wRecibo=(WebView)findViewById(R.id.reciboma);
        wRecibo.loadUrl("http://www.uniremington.edu.co/manizales/843-recibo-de-matricula.html");
    }
}
