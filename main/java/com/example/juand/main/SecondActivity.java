package com.example.juand.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Pagina dos de la clientApp.
 * Autor: Juan D. Esquivel.
 */
public class SecondActivity extends AppCompatActivity {
    TextView txtCliente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        txtCliente=(TextView)findViewById(R.id.textNomCliente);
        Intent intentCliente=getIntent();
        Bundle cliente=intentCliente.getExtras();
        String NombreCliente=cliente.getString("Cliente");
        txtCliente.setText("Bienvenido "+ NombreCliente);
        }
    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second_activity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
         if (id == R.id.action_QRscanner) {
            Intent intent2 = new Intent(SecondActivity.this, QREscaner.class);
            startActivity(intent2);
        }
        return super.onOptionsItemSelected(item);
    }
    }


