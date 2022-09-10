package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void Enviar(View view) {
        EditText nombreEditText = findViewById(R.id.nombreEditText);
        EditText passwordEditText = findViewById(R.id.passwordEditText);

        Log.i("testme", "email: " + nombreEditText.getText().toString());
        Log.i("testme", "contrasena: " + passwordEditText.getText().toString());

        Intent intent = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}