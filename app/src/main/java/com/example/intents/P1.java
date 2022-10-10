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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        list = findViewById(R.id.lista);
        respuestas = new ArrayList<>();
        respuestas.add("SI");
        respuestas.add("NO");
        respuestas.add("Puede");
        ArrayAdapter adapterresp = new ArrayAdapter(this, android.R.layout.simple_list_item_1,respuestas);
        list.setAdapter(adapterresp);
        list.setOnItemClickListener(this);
    }
    public void Volver(View view) {
        if (Contestado) {
            Intent Volver = new Intent(this, P2.class);
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
            if (respuesta == "Si") {
                Toast.makeText(this, "respuesta Correcta ;)", Toast.LENGTH_LONG).show();
                Contestado=true;
            } else {
                Toast.makeText(this, "respuesta incorrecta :(", Toast.LENGTH_LONG).show();
                Contestado=true;
            }
        }

    }
}