package com.example.juand.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.juand.clientapp.Factura;

import java.net.Socket;

/**
 * Pagina principal de la clientApp.
 * Autor: Juan D. Esquivel.
 */
public class MainClientActivity extends AppCompatActivity {
    private Button btnConectar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_client);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btnConectar = (Button)findViewById(R.id.botonConectar);
        btnConectar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                final String cliente = ((EditText)findViewById(R.id.txtCliente)).getText().toString();
                if (cliente.equals(""))
                    Toast.makeText(getApplicationContext(),"Por favor ingrese su nombre.",Toast.LENGTH_LONG).show();
                else {
                    Intent intent1 = new Intent(MainClientActivity.this, SecondActivity.class);
                    intent1.putExtra("Cliente", cliente);
                    startActivity(intent1);
                }
                }
        });
    }
        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_main_client, menu);
            return true;
        }
        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
        }
    }
