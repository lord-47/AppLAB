package com.example.intents;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Resultado extends AppCompatActivity {

    int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rwsultado);
        contador= getIntent().getIntExtra("puntuacion",0);
        TextView result = (TextView) findViewById(R.id.result);
        result.setText(String.valueOf(contador));
        Animation shakes = AnimationUtils.loadAnimation(this,R.anim.shake);

        result.startAnimation(shakes);

        TextView message = (TextView) findViewById(R.id.message);
        if (contador==15)
            message.setText("Enhorabuena, te sabes la de ver pelis");
        else if(contador==0)
            message.setText("Te falta cine crack");
        else
            message.setText("No está mal");
    }
}