package com.example.nguyengon.service_example;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonStart, buttonStop, buttonNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStart = (Button) findViewById(R.id.buttonStart);
        buttonStop  = (Button) findViewById(R.id.buttonStop);
        buttonNext  = (Button) findViewById(R.id.buttonNext);

        buttonStart.setOnClickListener(this);
        buttonStop.setOnClickListener(this);
        buttonNext.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.buttonStart:
                startService(new Intent(this, MyService.class));
                break;
            case R.id.buttonStop:
                stopService(new Intent(this, MyService.class));
                break;

            case R.id.buttonNext:
                Intent i = new Intent(this, NextPage.class);

                startActivity(i);

                break;




        }








    }

/*    public void startService(View view){
        startService(new Intent(getBaseContext(), MyService.class));
    }
    public void stopService(View view){
        stopService(new Intent(getBaseContext(), MyService.class));
    }*/




}
