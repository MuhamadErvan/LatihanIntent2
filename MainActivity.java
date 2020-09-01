package com.example.belajarintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button mpertama;
    Button mkedua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mpertama = findViewById(R.id.pertama);
        mpertama.setOnClickListener(this);
        mkedua = findViewById(R.id.kedua);
        mkedua.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.pertama:
                Intent satu = new Intent(MainActivity.this, IntentActivity.class);
                startActivity(satu);
                break;
                case R.id.kedua:
                    Intent dua = new Intent(MainActivity.this, Intent2Activity.class);
                    startActivity(dua);
                    break;
                default:
            }
        }
    }

