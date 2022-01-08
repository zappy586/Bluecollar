package com.example.bluecollar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextUN,editTextpass;
    Button button_sign, button_register;
    SharedPreferences sharedPreferences;

    private static final String SHARED_PREF_NAME = "mypref";
    private static final String UNAME = "username";
    private static final String PWD = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUN  = findViewById(R.id.username);
        editTextpass = findViewById(R.id.password);
        button_register = findViewById(R.id.register);
        button_sign = findViewById(R.id.sign_in);
        String username = editTextUN.getText().toString();
        String password = editTextpass.getText().toString();
        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);


        button_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(UNAME,username);
                editor.putString(PWD,password);
                sharedPreferences = getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);
                String m1 = sharedPreferences.getString(UNAME, " ");
                editor.apply();
                Toast.makeText(MainActivity.this, "Account Registered" + m1, Toast.LENGTH_SHORT).show();




            }
        });
        /*sharedPreferences = getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);
        String name1 = sharedPreferences.getString(UNAME," ");
        String pwd = sharedPreferences.getString(PWD, " ");*/

        button_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String uname = editTextUN.getText().toString();
                //String pwd = editTextUN.getText().toString();
            sharedPreferences = getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);
            String name1 = sharedPreferences.getString(UNAME,null);
            String pass = sharedPreferences.getString(PWD, null);
            if (username.equals(name1) && password.equals(pass))
            {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
            else
            {
                Toast.makeText(MainActivity.this, "Wrong Username or password", Toast.LENGTH_SHORT).show();
            }



            }
        });





    }
}