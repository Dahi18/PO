package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void Enviar (View view){
        EditText nombreEditText = findViewById(R.id.nombreEditText);
        EditText passwordEditText = findViewById(R.id.passwordEditText);

        Log.i(  "nombre: ",nombreEditText.getText().toString() );
        Log.i(  "Contrseña: ",passwordEditText.getText().toString() );
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}