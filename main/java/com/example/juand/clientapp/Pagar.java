package com.example.juand.clientapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.juand.main.R;

/**
 * Pagina siete de la clientApp.
 * Se genera la ventana de pago electronico fictisio.
 * Autor: Juan D. Esquivel.
 */
public class Pagar extends AppCompatActivity {
    EditText txtNomTar, txtNumTar;
    Button btnTarjeta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btnTarjeta = (Button) findViewById(R.id.btnTarjeta);
        btnTarjeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtNumTar = ((EditText) findViewById(R.id.txtNumtarjeta)).getText().toString();
                String txtNomTar = ((EditText) findViewById(R.id.txtNomtarjeta)).getText().toString();
                if (txtNomTar.equals("") || txtNumTar.equals(""))
                    Toast.makeText(getApplicationContext(), "Por favor ingrese los datos solicitados para continuar.", Toast.LENGTH_LONG).show();
                else {
                    Intent intent9 = new Intent(Pagar.this, Final.class);
                    startActivity(intent9);
                }
            }
        });
    }
}