package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class P1 extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView list;
    List<String> respuestas;
    boolean Contestado=false;
    int contador=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        list = findViewById(R.id.lista);
        respuestas = new ArrayList<>();
        respuestas.add("The Riddle");
        respuestas.add("Bane");
        respuestas.add("Joker");
        ArrayAdapter adapterresp = new ArrayAdapter(this, android.R.layout.simple_list_item_1,respuestas);
        list.setAdapter(adapterresp);
        list.setOnItemClickListener(this);
    }
    public void Volver(View view) {
        if (Contestado) {
            Intent Volver = new Intent(this, P2.class);
            Volver.putExtra("puntuacion", contador);
            startActivity(Volver);
        }
        else {
            Toast.makeText(this, "No has contestado", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String respuesta = respuestas.get(i);
        if (!Contestado) {
            if (respuesta == "The Riddle") {
                Toast.makeText(this, "Respuesta correcta ;)", Toast.LENGTH_LONG).show();
                contador=contador+3;
                Contestado=true;
            } else {
                Toast.makeText(this, "Respuesta incorrecta :(", Toast.LENGTH_LONG).show();
                contador=contador-1;
                Contestado=true;
            }
        }

    }
}