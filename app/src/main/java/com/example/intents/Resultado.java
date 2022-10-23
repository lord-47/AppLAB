package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Resultado extends AppCompatActivity {
    int contador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rwsultado);
        contador= getIntent().getIntExtra("puntuacion",0);
  }

}