package com.example.jhonatan.leo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Correo extends AppCompatActivity {

    WebView webView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correo);

        webView3 = (WebView) findViewById(R.id.cor);
        webView3.loadUrl("https://mail.google.com/mail/u/0/#inbox");
    }
}
