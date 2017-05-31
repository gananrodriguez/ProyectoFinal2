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
    ToggleButton ingresar;
    RadioButton  rec;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        ingresar = (ToggleButton) findViewById(R.id.button);

        ingresar.setOnClickListener(this);

        rec.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(getApplicationContext(),"recordado",Toast.LENGTH_SHORT).show();
                return;
            }
        });
    }


    @Override
    public void onClick(View view) {

        String usua = ((EditText) findViewById(R.id.editText)).getText().toString();
        String contra = ((EditText) findViewById(R.id.editText2)).getText().toString();

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


}
