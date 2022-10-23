package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class P2 extends AppCompatActivity {
    boolean Contestado=false;
    int contador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p2);
        contador= getIntent().getIntExtra("puntuacion",0);
    }

    public void Respuesta(View view) {
        boolean pulsado = ((Button) view ).isClickable();
        if(! Contestado && pulsado) {
            if (view.getId() == R.id.op_3) {
                Toast.makeText(this, "Correcto", Toast.LENGTH_SHORT).show();
                contador =contador+3;
                Contestado = true;
            } else {
                contador =contador-2;
                Contestado = true;
                Toast.makeText(this, "Incorrecto", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void Siguiente(View view) {
        if (Contestado) {
            Intent Volver = new Intent(this, P3.class);
            Volver.putExtra("puntuacion", contador);
            startActivity(Volver);
        }
        else {
            Toast.makeText(this, "No has contestado", Toast.LENGTH_LONG).show();
        }
    }

}