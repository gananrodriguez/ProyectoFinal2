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

    //declaro variables
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

        //linkeo el spinner que me contine la informacion de la cat

        spinner1 = (Spinner) findViewById(R.id.spinner);

        //cracion del arraylist  que  me contiene la informacion

        List spinnerUno = new ArrayList();

        //campos que iran en la lista que despliega el spinner
        spinnerUno.add("CAT MANIZALES");

        //adaptador que me contiene el arraylist

        ArrayAdapter uno = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,spinnerUno);
        uno.setDropDownViewResource(android.R.layout.simple_spinner_item);

        //asignacion del adaptador al spinner
        spinner1.setAdapter(uno);

        //metodos que se crean para cuando este checkeado o no

        spinner1.setOnItemSelectedListener (new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {



            }
        });


        //linkeo el spinner que me contine la informacion de los aspirantes
        spinner2 = (Spinner)findViewById(R.id.spinner2);

        //cracion del arraylist  que  me contiene la informacion
        List spinnerdos = new ArrayList();

        //campos que iran en la lista que despliega el spinner
        spinnerdos.add ("Aspirantes");
        spinnerdos.add ("oferta academica");
        spinnerdos.add ("formas de pago");
        spinnerdos.add ("convenios y descuentos");
        spinnerdos.add ("requisitos de inscripcion");
        spinnerdos.add ("homologaciones");
        spinnerdos.add ("traifas institucionales 2017");
        spinnerdos.add ("pre-inscripcion");
        spinnerdos.add ("documentos nuevos");

        //adaptador que me contiene el arraylist


        ArrayAdapter dos  = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,spinnerdos);
        dos.setDropDownViewResource(android.R.layout.simple_spinner_item);
        //asignacion del adaptador al spinner
        spinner2.setAdapter(dos);

        //creacion de metodos
        spinner2.setOnItemSelectedListener (new AdapterView.OnItemSelectedListener() {
            //metodos que se crean para cuando este checkeado o no
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {



            }
        });
        //linkeo el spinner que me contine la informacion de los estudiantes
        spinner3 = (Spinner)findViewById(R.id.spinner3);
        //array list que cargare en el spinner
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

        //creacion del adaptador

        ArrayAdapter tres = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, spinnertres);

        tres.setDropDownViewResource(android.R.layout.simple_spinner_item);
        //asignacion del adaptador al spinner
        spinner3.setAdapter(tres);


        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
            {
                 switch (i)
                 {
                     case 0 :

                         break;
                     case 1:
                         Intent calen = new Intent(Main2Activity.this,CalendarioAca.class);
                         startActivity(calen);

                     case 2:
                         Intent tar = new Intent(Main2Activity.this,TarifasIns.class);
                         startActivity(tar);
                         break;

                     case 3:
                         Intent mood = new Intent(Main2Activity.this,PlataformaMo.class);
                         startActivity(mood);
                         break;
                     case 4:
                         Intent qdie = new Intent(Main2Activity.this,PlataformaQ.class);
                         startActivity(qdie);
                         break;

                     case 5:
                         Intent corinst = new Intent(Main2Activity.this,CorreoInst.class);
                         startActivity(corinst);
                         break;

                     case 6:
                         Intent reci = new Intent(Main2Activity.this,ReciboMatri.class);
                         startActivity(reci);
                         break;

                     case 7:
                         Intent homo = new Intent(Main2Activity.this,Homologaciones.class);
                         startActivity(homo);
                         break;

                     case 8:
                         Intent direc = new Intent(Main2Activity.this,DirectorioAdm.class);
                         startActivity(direc);
                         break;

                     case 9:
                         Intent line = new Intent(Main2Activity.this,LineamientosAca.class);
                         startActivity(line);
                         break;

                     case 10:
                         Intent regl = new Intent(Main2Activity.this,ReglamentoEst.class);
                         startActivity(regl);
                         break;


                 }
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

//linkeo el boton que me llevara al moodle
        plMoodle = (Button) findViewById(R.id.button2);

        //creacion del metodo que me comunica con la vista que tiene la informacion del moodle
        plMoodle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent moo =new Intent(Main2Activity.this,Moodle.class);
                startActivity(moo);
            }
        });

//linkeo el boton que me llevara a la plataforma q10
        plQdiez = (Button) findViewById( R.id.button3);

        //creacion del metodo que me comunica con la vista que tiene la informacion del Q10
        plQdiez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent die = new Intent(Main2Activity.this,Diez.class);
                startActivity(die);
            }
        });


//linkeo el boton que me llevara al correo
        Correos= (Button) findViewById( R.id.button4);

        //creacion del metodo que me comunica con la vista que tiene la informacion del correo
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
