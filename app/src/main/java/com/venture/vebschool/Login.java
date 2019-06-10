package com.venture.vebschool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.AutoCompleteTextView;

public class Login extends AppCompatActivity {
AutoCompleteTextView phone,password;
AppCompatButton login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = findViewById(R.id.login);
        phone = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Login.this,Home.class);
                startActivity(i);
                finish();
            }
        });
    }
}
