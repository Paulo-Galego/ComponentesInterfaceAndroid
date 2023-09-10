package com.example.componentesinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class CaixaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caixa);

        Button botao = findViewById(R.id.btnEntrar);
        TextInputEditText email = findViewById(R.id.edit_email);
        TextView nome = findViewById(R.id.editTextNome);

        botao.setOnClickListener(view -> {
            String nomeUser = nome.getText().toString();
            String emailUsuario = email.getText().toString();
            System.out.println("Nome usuário: " + nomeUser  + " E-mail: " + emailUsuario);
        });


    }
}