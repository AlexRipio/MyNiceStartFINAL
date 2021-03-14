package com.siglas.mynicestart;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText ETEmail;
    private EditText ETPassword;
    private Button Login;
    private Button Log;

    private String email = "";
    private String password = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        ETEmail = (EditText) findViewById(R.id.ETEmail);
        ETPassword = (EditText) findViewById(R.id.ETPassword);
        Login = (Button) findViewById(R.id.btnlogin);
        Log = findViewById(R.id.btnOK);


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email = ETEmail.getText().toString();
                password = ETPassword.getText().toString();

                if (!email.isEmpty() && !password.isEmpty()){
                }
                else{
                    Toast.makeText(LoginActivity.this, "Debe completar todos los campos", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email = ETEmail.getText().toString();
                password = ETPassword.getText().toString();

                if (!email.isEmpty() && !password.isEmpty()){
                    Intent intent = new Intent (LoginActivity.this, MainActivity.class);
                    startActivityForResult(intent, 0);
                }
                else{
                    Toast.makeText(LoginActivity.this, "Debe completar todos los campos", Toast.LENGTH_SHORT).show();
                }
            }
        });

}}
