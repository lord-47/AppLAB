package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class P3 extends AppCompatActivity {
    boolean Contestado=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p3);
    }

    public void respuesta(View view) {
        boolean pulsado = ((ImageView) view ).isClickable();
        if(! Contestado && pulsado) {
            if (view.getId() == R.id.imageButton3) {
                Toast.makeText(this, "Correcto", Toast.LENGTH_SHORT).show();
                Contestado = true;
            } else {
                Contestado = true;
                Toast.makeText(this, "Incorrecto", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void Siguiente(View view) {
        if (Contestado) {
            Intent Volver = new Intent(this, P4.class);
            startActivity(Volver);
        }
        else {
            Toast.makeText(this, "No has contestado", Toast.LENGTH_LONG).show();
        }
    }

}