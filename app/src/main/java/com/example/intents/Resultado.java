package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    int contador;
    TextView result = (TextView) findViewById(R.id.result);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rwsultado);
        contador= getIntent().getIntExtra("puntuacion",0);
        result.setText(String.valueOf(contador));
    }
}