package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ProfileReza(View view) {
        Intent intent = new Intent(this, reza.class);
        startActivity(intent);
    }
    public void ProfileYudha(View view) {
        Intent intent = new Intent(this, activity_yudha.class);
        startActivity(intent);
    }
    public void ProfileFadil(View view) {
        Intent intent = new Intent(this, activity_fadil.class);
        startActivity(intent);
    }

    public void ProfileFadhlan(View view) {
        Intent intent = new Intent(this, FadhlanActivity.class);
        startActivity(intent);
    }
}