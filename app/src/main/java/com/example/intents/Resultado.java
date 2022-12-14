package com.example.intents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Resultado extends AppCompatActivity {

    int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rwsultado);
        contador= getIntent().getIntExtra("puntuacion",0);
        TextView result = (TextView) findViewById(R.id.result);
        if (contador>=0)
            result.setText(String.valueOf(contador));
        else
            result.setText("0");
        Animation shakes = AnimationUtils.loadAnimation(this,R.anim.shake);
        result.startAnimation(shakes);

        TextView message = (TextView) findViewById(R.id.message);
        if (contador==15)
            message.setText("Enhorabuena, te sabes la de ver pelis");
        else if(contador<=0)
            message.setText("Te falta cine crack");
        else
            message.setText("No está mal");
    }

    public void Siguiente(View view) {
        Intent Volver = new Intent(this, P1.class);
        startActivity(Volver);
    }

}