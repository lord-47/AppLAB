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
    String[] respuesta={"si","no","puede"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p4);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner2);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner3);
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,respuesta);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(aa);
        spinner1.setAdapter(aa);
        spinner2.setAdapter(aa);
    }



    public void Siguiente(View view) {
        if (Contestado) {
            Intent Volver = new Intent(this, P1.class);
            startActivity(Volver);
        }
        else {
            Toast.makeText(this, "No has contestado", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(getApplicationContext(),respuesta[i] , Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}