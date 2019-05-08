package com.example.tomek.magicwizards;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MenuConnect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connect);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    //Grzebaem tu z laczeniem, ale nic mi nie wyszlo wiec przywrocilem do czysta klase -S
}
