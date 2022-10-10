package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class preguntas extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView list;
    List<String> respuestas;
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
        Intent Volver = new Intent(this, MainActivity.class);
        startActivity(Volver);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String respuesta = respuestas.get(i);
        if (respuesta == "Si") {
            Toast.makeText(this, "respuesta Correcta ;)", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "respuesta incorrecta :(", Toast.LENGTH_LONG).show();
        }

    }
}