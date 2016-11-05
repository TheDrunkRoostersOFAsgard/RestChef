package com.example.juand.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.juand.clientapp.Factura;
import com.example.juand.clientapp.Menu;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import static com.google.zxing.integration.android.IntentIntegrator.QR_CODE_TYPES;

/**
 * Página tres de la clientApp, escanea el Código QR.
 * Autor: Juan D. Esquivel.
 */
public class QREscaner extends AppCompatActivity {
    private Button botonScan;
    private  Button btnReservar;
    private TextView txtResultado;
    private TextView txtReservar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrscan);
        botonScan=(Button)findViewById(R.id.botonScan);
        final Activity activity = this;
        botonScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IntentIntegrator integrator = new IntentIntegrator(activity);
                integrator.setDesiredBarcodeFormats(QR_CODE_TYPES);
                integrator.setPrompt("Escaneando");
                integrator.setCameraId(0);
                integrator.setBeepEnabled(false);
                integrator.setBarcodeImageEnabled(false);
                integrator.initiateScan();
            }
        });
    }
    @Override
    /**
     * Método para poder escanear el código QR.
     * Se implemento el uso de la libreria zXing.
     * Autor:Juan D. Esquivel.
     */
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = new IntentIntegrator(this).parseActivityResult(requestCode,resultCode,data);
        if(result!=null){
            if(result.getContents()==null){
                Toast.makeText(this,"Escaneo de código cancelado",Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this,result.getContents(),Toast.LENGTH_LONG).show();
                final String resultado=result.getContents().toString();
                txtResultado=(TextView)findViewById(R.id.txtResult);
                txtResultado.setText(resultado);
                txtReservar=(TextView)findViewById(R.id.textReservar);
                txtReservar.setText("¿Seguro que quieres reservar esta mesa?");
                btnReservar=(Button)findViewById(R.id.btnReservar);
                btnReservar.setVisibility(View.VISIBLE);
                btnReservar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent3 = new Intent(QREscaner.this, Menu.class);
                        startActivity(intent3);
                    }
                });
            }
        }else{
            super.onActivityResult(requestCode, resultCode, data);
        }

    }
}
