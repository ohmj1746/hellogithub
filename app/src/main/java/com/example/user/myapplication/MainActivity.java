package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnHello=findViewById(R.id btnHello);
        htnHello.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,"과과감",Toast.LENGTH_LONG).show();
    }
}
