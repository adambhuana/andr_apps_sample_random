package com.example.adampuspabhuana.samplerandom;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView hasil;
    Button tombol;
    public int nomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hasil = (TextView) findViewById(R.id.idrandom);
        tombol = (Button) findViewById(R.id.btnacak);

        int min = 1;
        int max = 6;
        Random r = new Random();
        nomor = r.nextInt(max - min + 1) + min;
        hasil.setText(nomor);

    }
}
