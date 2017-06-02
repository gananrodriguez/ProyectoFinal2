package com.example.jhonatan.leo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class LineamientosAca extends AppCompatActivity {

    WebView wLineamientos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lineamientos_aca);

        wLineamientos =(WebView)findViewById(R.id.lineamient);
        wLineamientos.loadUrl("http://www.uniremington.edu.co/manizales/general/uniremington/2016-02-10-22-02-36.html");
    }
}
