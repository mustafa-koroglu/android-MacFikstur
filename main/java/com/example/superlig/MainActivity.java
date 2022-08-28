package com.example.superlig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler git= new Handler();
        Intent intent= new Intent(MainActivity.this,Takimlar.class);
        git.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
            }
        },3000);

    }
}