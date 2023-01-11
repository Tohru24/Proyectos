package com.example.turistiando.actividades;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.turistiando.R;

import java.util.Timer;
import java.util.TimerTask;

public class load extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);

        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                Intent intent =new Intent(load.this,login.class);
                startActivity(intent);
                finish();

            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(tarea,5000);



    }
}