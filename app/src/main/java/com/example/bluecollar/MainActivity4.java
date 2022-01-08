package com.example.bluecollar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
TextView N1;
EditText N2,N3;
Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        N2=findViewById(R.id.editTextNumber);
        N1=findViewById(R.id.textView8);
        N3=findViewById(R.id.salary_input);
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
                int time = Integer.parseInt (s);
                int sal = Integer.parseInt(s2);
                if(sal>300 || sal<200) {
                    int Total = sal * time;
                    N1.setText("the total cost is: "+ Total );

                }
                else{
                    Toast.makeText(MainActivity4.this, "Enter Within the limit", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}