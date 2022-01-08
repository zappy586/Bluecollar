package com.example.bluecollar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
TextView N1;
EditText N2;
Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        N2=findViewById(R.id.editTextNumber);
        N1=findViewById(R.id.textView8);
        b=findViewById(R.id.button5);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = N2.getText().toString();
                int salary = Integer.parseInt (s);
                int Total = 100* salary;
                N1.setText("the total cost is: "+ Total );
            }
        });

    }
}