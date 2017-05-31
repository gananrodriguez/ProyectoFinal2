package com.example.jhonatan.leo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Diez extends AppCompatActivity {

    WebView webView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diez);

        webView2 = (WebView) findViewById(R.id.diez);

        webView2.loadUrl("https://www.q10academico.com/");


    }
}
