package com.example.fifthactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        t1=(TextView) findViewById(R.id.name);
        Intent myintent=getIntent();
        t1.setText(myintent.getStringExtra("name"));
    }
}