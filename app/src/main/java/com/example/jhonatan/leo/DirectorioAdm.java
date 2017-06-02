package com.example.jhonatan.leo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class DirectorioAdm extends AppCompatActivity {

    WebView wDirectorio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directorio_adm);

        wDirectorio =(WebView)findViewById(R.id.directorioo);
        wDirectorio.loadUrl("http://www.uniremington.edu.co/manizales/1445-directorio-administrativo.html");
    }
}
