package com.example.tomek.magicwizards;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

//selfnote:przypadkowo zczyscilem klase, odnowic potem
public class MenuCredits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.credits);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
