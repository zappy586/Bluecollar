package com.example.bluecollar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
TextView N1;
EditText N2,N3,N4;
Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        N2=findViewById(R.id.work_hours);
        N1=findViewById(R.id.textView8);
        N3=findViewById(R.id.salary_input);
        N4=findViewById(R.id.work_hours);
        b1=findViewById(R.id.button5);
        b2=findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            Intent intent = new Intent(MainActivity4.this, Final.class);
            startActivity(intent);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = N2.getText().toString();
                String s2 = N3.getText().toString();
                String s3 = N4.getText().toString();
                int time = Integer.parseInt (s);
                int sal = Integer.parseInt(s2);
                int hour = Integer.parseInt(s3);
                int Total = sal * time;
                N1.setText("the total cost is: "+ Total );


                if(sal>100 || sal<200 || hour>7)
                    N1.setText("Please enter within limit");

                }

        });

    }}