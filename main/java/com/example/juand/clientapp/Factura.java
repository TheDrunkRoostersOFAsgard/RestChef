package com.example.juand.clientapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.juand.main.R;

/**
 * Pagina seis de la aplicación ClientApp.
 * Aqui se tomaban valores seleccinados por medio de get (No se implemento).
 * Autor: Juan D. Esquivel.
 */
public class Factura extends AppCompatActivity {
    Button btnPagar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factura2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btnPagar=(Button)findViewById(R.id.btnPagar);
        btnPagar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //Falto el metdo post.
                Intent intent8 = new Intent(Factura.this, Pagar.class);
                startActivity(intent8);
            }
        });
    }

}
