package com.example.user.click8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn, btn1;
    TextView tex;
    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        btn1 = (Button) findViewById(R.id.btn1);
        tex = (TextView) findViewById(R.id.tex);


    }

    public void click(View view) {
        tex.setText("number not found");
    }

    public void click1(View view) {
        Random rnd = new Random();
        x = rnd.nextInt(10) + 1;
        tex.setText(x);
    }
}