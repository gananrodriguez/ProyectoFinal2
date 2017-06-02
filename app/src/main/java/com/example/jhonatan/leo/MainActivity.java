package com.example.jhonatan.leo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //declaro variables
    ToggleButton ingresar;
    RadioButton  rec;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        //linkeo el togglebutton con el que ire a la segunda vista

        ingresar = (ToggleButton) findViewById(R.id.button);
        //le asigno al ToggleButton el metodo OnclickListener, por aqui escucha

        ingresar.setOnClickListener(this);


        //linkeo el radiobutton que muestra el mensaje recordar
        rec = (RadioButton)findViewById(R.id.radioButton);
        //llamo el metodo que al seleccionar el radiobutton me muetre el mensaje
        mostrar();
    }

//metodo onclick para pasar a la otra vista
    @Override
    public void onClick(View view) {

        //convierto a string lo que ingreso en los dos editext y los linkeo

        String usua = ((EditText) findViewById(R.id.editText)).getText().toString();
        String contra = ((EditText) findViewById(R.id.editText2)).getText().toString();

        //creacion del loging

        if (usua.equals("leo") && contra.equals("leo"))
        {


            Intent intent = new Intent(this,Main2Activity.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(getApplicationContext(),"incorrecto",Toast.LENGTH_LONG).show();
            return;
        }
    }


    //metodo que me muestra el mensaje recordado a traves de un radiobutton
    public  void mostrar () {

        rec.setOnCheckedChangeListener(new RadioButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    Toast.makeText(getApplicationContext(),"recordado",Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        });
    }


}
