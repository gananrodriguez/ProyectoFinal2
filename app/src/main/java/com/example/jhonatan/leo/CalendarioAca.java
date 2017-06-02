package com.example.jhonatan.leo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class CalendarioAca extends AppCompatActivity {

        WebView wCalendario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario_aca);
        wCalendario =(WebView)findViewById(R.id.calendarioo);
        wCalendario.loadUrl("http://www.uniremington.edu.co/manizales/general/uniremington/2016-02-10-22-02-37.html");
    }
}
