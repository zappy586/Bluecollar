package com.example.bluecollar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    Button button_worker;
    Button client;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button_worker = findViewById(R.id.worker);
        button_worker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this , MainActivity3.class);
                startActivity(intent);
            }
        });
        client= findViewById(R.id.client);
        client.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent indent = new Intent (MainActivity2.this, client.class);
                startActivity(indent);
            }
        });
//jkhkjh
    }
}