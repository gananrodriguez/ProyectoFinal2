package com.example.jhonatan.leo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ReglamentoEst extends AppCompatActivity {

    WebView wReglamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reglamento_est);

        wReglamento =(WebView)findViewById(R.id.reglamentos);
        wReglamento.loadUrl("http://www.uniremington.edu.co/manizales/general/uniremington/reglamento-estudiantil.html");
    }
}
