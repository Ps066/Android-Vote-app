package com.logui.arghasen.votingapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class startup extends Activity {
    private Button move;
    private Button credit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.startscreen);
        move=findViewById(R.id.let);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( startup.this , MainActivity.class);
                startActivity(i);
            }


        });
        credit=findViewById(R.id.credit);
        credit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent( startup.this , Credits.class);
                startActivity(c);
            }
        });

    }

//    public void vote(View v){
//        if(v.getId() == R.id.let){
//            Intent i = new Intent(startup.this, MainActivity.class);
//            startActivity(i);
//
//        }


    }

