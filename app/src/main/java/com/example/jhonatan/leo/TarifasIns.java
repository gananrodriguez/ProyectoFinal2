package com.example.jhonatan.leo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class TarifasIns extends AppCompatActivity {
    WebView wTarifas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarifas_ins);

        wTarifas =(WebView)findViewById(R.id.tarifas);
        wTarifas.loadUrl("http://www.uniremington.edu.co/manizales/784-tarifas-institucionales-2017.html");


    }
}
