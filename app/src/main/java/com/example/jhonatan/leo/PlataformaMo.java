package com.example.jhonatan.leo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class PlataformaMo extends AppCompatActivity {
    WebView wMoodle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plataforma_mo);

        wMoodle =(WebView)findViewById(R.id.moodless);
        wMoodle.loadUrl("http://virtual.uniremingtonmanizales.edu.co/moodle/login/index.php");
    }
}
