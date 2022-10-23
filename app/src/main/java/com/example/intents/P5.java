package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class P5 extends AppCompatActivity {
    Boolean Contestado = false;
    int contador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p5);
        contador= getIntent().getIntExtra("puntuacion",0);
    }

    public void respuesta(View view) {
        boolean pulsado = ((Button) view ).isClickable();
        if(! Contestado && pulsado) {
            if (view.getId() == R.id.op_1) {
                Toast.makeText(this, "Correcto", Toast.LENGTH_SHORT).show();
                contador =contador+3;
                Contestado = true;
            } else {
                Contestado = true;
                contador =contador-2;
                Toast.makeText(this, "Incorrecto", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void Siguiente(View view) {
        if (Contestado) {
            Intent Volver = new Intent(this, Resultado.class);
            Volver.putExtra("puntuacion", contador);
            startActivity(Volver);
        }
        else {
            Toast.makeText(this, "No has contestado", Toast.LENGTH_LONG).show();
        }
    }

}