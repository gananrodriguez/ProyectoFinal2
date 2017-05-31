package com.example.jhonatan.leo;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    Spinner spinner1;
    Spinner spinner2;
    Spinner spinner3;

    Spinner spinner4;
    Spinner spinner5;
    Spinner spinner6;


    Button plMoodle;
    Button plQdiez;
    Button Correos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        spinner1 = (Spinner) findViewById(R.id.spinner);
        List spinnerUno = new ArrayList();

        spinnerUno.add("CAT MANIZALES");

        ArrayAdapter uno = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,spinnerUno);
        uno.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner1.setAdapter(uno);

        spinner1.setOnItemSelectedListener (new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Main2Activity.this,"" + String.valueOf(spinner1.getSelectedItem()),Toast.LENGTH_SHORT).show();
                return;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {



            }
        });

        spinner2 = (Spinner)findViewById(R.id.spinner2);

        List spinnerdos = new ArrayList();

        spinnerdos.add ("Aspirantes");
        spinnerdos.add ("oferta academica");
        spinnerdos.add ("formas de pago");
        spinnerdos.add ("convenios y descuentos");
        spinnerdos.add ("requisitos de inscripcion");
        spinnerdos.add ("homologaciones");
        spinnerdos.add ("traifas institucionales 2017");
        spinnerdos.add ("pre-inscripcion");
        spinnerdos.add ("documentos nuevos");

        ArrayAdapter dos  = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,spinnerdos);
        dos.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner2.setAdapter(dos);
        spinner2.setOnItemSelectedListener (new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Main2Activity.this,"" + String.valueOf(spinner2.getSelectedItem()),Toast.LENGTH_SHORT).show();
                return;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {



            }
        });

        spinner3 = (Spinner)findViewById(R.id.spinner3);
        List spinnertres = new ArrayList();

        spinnertres.add ("Estudiantes");
        spinnertres.add ("Calendario academico");
        spinnertres.add ("Tarifas institucionales 2017");
        spinnertres.add("Plataforma Moodle");
        spinnertres.add("Plataforma Q10");
        spinnertres.add("Correo institucional");
        spinnertres.add("Recibo de matricula");
        spinnertres.add("Homologaciones");
        spinnertres.add("Directorio administrativo");
        spinnertres.add("Lineamientos academicos");
        spinnertres.add("Reglamento estudiantil");

        ArrayAdapter tres = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, spinnertres);

        tres.setDropDownViewResource(android.R.layout.simple_spinner_item);

        spinner3.setAdapter(tres);


        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        spinner4 = (Spinner)findViewById(R.id.spinner4);

        List spinnercuatro = new ArrayList();

        spinnercuatro.add ("Docentes -  tutores");
        spinnercuatro.add ("Plataforma Moodle");
        spinnercuatro.add ("Plataforma Q10");
        spinnercuatro.add("Calendario academico");
        spinnercuatro.add("Correo Institucional");
        spinnercuatro.add("Directorio administrativo");
        spinnercuatro.add("Reserva de equipos");

        ArrayAdapter cuatro = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,spinnercuatro);
        cuatro.setDropDownViewResource(android.R.layout.simple_spinner_item);

        spinner4.setAdapter(cuatro);

        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinner5 = (Spinner) findViewById(R.id.spinner5);

        List spinnercinco = new ArrayList();

        spinnercinco.add("Egresados");
        spinnercinco.add("Epecializaciones");
        spinnercinco.add("Correo institucional");
        spinnercinco.add("Directorio administrativo");

        ArrayAdapter cinco= new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, spinnercinco);
        cinco.setDropDownViewResource(android.R.layout.simple_spinner_item);

        spinner5.setAdapter(cinco);
        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinner6 = (Spinner) findViewById(R.id.spinner6);
        List spinnerseis = new ArrayList();
        spinnerseis.add("Administrativos");
        spinnerseis.add("Plataforma Q10");
        spinnerseis.add("Correo institucional");
        spinnerseis.add("Directorio administrativo");
        spinnerseis.add("Reserva de equipos");

        ArrayAdapter seis  = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, spinnerseis);
        seis.setDropDownViewResource(android.R.layout.simple_spinner_item);

        spinner6.setAdapter(seis);

        spinner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        plMoodle = (Button) findViewById(R.id.button2);
        plMoodle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent moo =new Intent(Main2Activity.this,Moodle.class);
                startActivity(moo);
            }
        });


        plQdiez = (Button) findViewById( R.id.button3);
        plQdiez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent die = new Intent(Main2Activity.this,Diez.class);
                startActivity(die);
            }
        });



        Correos= (Button) findViewById( R.id.button4);
        Correos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent corr =new Intent(Main2Activity.this,Correo.class);
                startActivity(corr);
            }
        });



// ON

    }




    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.button2:
                Intent uno = new Intent(this, Moodle.class);
                startActivity(uno);

            case R.id.button3:

                Intent dos = new Intent(this, Diez.class);
                startActivity(dos);

            case R.id.button4:
                Intent tres = new Intent(this,Correo.class);
                startActivity(tres);


        }

    }







    }
