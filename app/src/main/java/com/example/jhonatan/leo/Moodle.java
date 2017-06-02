package com.example.jhonatan.leo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Moodle extends AppCompatActivity {

    //declaro variables
    WebView webView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moodle);


        //linkeo el webview para cargar el moodle
        webView1 =(WebView) findViewById(R.id.mood);

        //cargar al webview la url
        webView1.loadUrl("http://virtual.uniremingtonmanizales.edu.co/moodle/my/");
    }
}
