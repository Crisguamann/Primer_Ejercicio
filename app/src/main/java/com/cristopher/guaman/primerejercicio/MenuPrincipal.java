package com.cristopher.guaman.primerejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        Intent intent = getIntent();
        String miusuario = intent.getStringExtra("usuarioNombre");

        TextView mitext = findViewById(R.id.name);
        mitext.setText("Bienvenido: "+miusuario);
    }
}