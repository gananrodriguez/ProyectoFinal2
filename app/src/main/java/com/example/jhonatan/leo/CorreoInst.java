package com.example.jhonatan.leo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class CorreoInst extends AppCompatActivity {

    WebView wCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correo_inst);

        wCorreo =(WebView)findViewById(R.id.correoin);
        wCorreo.loadUrl("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Frli%3Dl239bmdmjjv8%26rld%3D1&service=mail&hd=uniremington.edu.co&sacu=1&flowName=GlifWebSignIn&flowEntry=AddSession");
    }
}
