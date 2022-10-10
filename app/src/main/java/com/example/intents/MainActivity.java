package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView image = findViewById(R.id.Imagen);
        Animation shakes = AnimationUtils.loadAnimation(this,R.anim.shake);
        image.startAnimation(shakes);

    }
    public void Siguiente(View view) {
        Intent Siguiente= new Intent(this, preguntas.class);
        startActivity(Siguiente);
        setContentView(R.layout.activity_main);
    }


}