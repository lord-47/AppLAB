package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class P4 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    boolean Contestado=false ;
    Spinner spinner;
    String[] respuesta={"...","Marilyn Monroe","Audrey Hepburn","Elizabeth Taylor","Judy Garland"};
    int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p4);
        spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,respuesta);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(aa);
        contador= getIntent().getIntExtra("puntuacion",0);
    }



    public void Siguiente(View view) {
        if (spinner.getSelectedItem().toString()=="Audrey Hepburn") {
            Toast.makeText(this, "Correcto", Toast.LENGTH_LONG).show();
            contador =contador+3;
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Intent Volver = new Intent(this, P5.class);
            startActivity(Volver);
        }
        else{
            Toast.makeText(this, "Incorrecto", Toast.LENGTH_LONG).show();
            contador =contador-2;
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Intent Volver = new Intent(this, P5.class);
            Volver.putExtra("puntuacion", contador);
            startActivity(Volver);
        }

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}