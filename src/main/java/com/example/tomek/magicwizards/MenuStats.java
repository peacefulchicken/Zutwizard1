package com.example.tomek.magicwizards;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MenuStats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stats);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Thread exitTimer = new Thread() {
            @Override
            public void run()
            {
                try
                {
                    sleep(350); //zalozenie ze gracz kliknie staty zeby zobaczyc HP i szybko wroci
                    Intent intent = new Intent(getApplicationContext(),CustomGesturesActivity.class);
                    startActivity(intent);
                    finish();
                }catch(InterruptedException error)
                {
                    error.printStackTrace();
                }
            }


        };
        exitTimer.start();
    }
}
