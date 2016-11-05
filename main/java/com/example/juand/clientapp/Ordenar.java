package com.example.juand.clientapp;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.juand.main.MainClientActivity;
import com.example.juand.main.R;
import com.example.juand.main.SecondActivity;

import java.util.ArrayList;
import java.util.Locale;

/**
 * Pagina cinco de la clientApp.
 * Se usa el lector de voz para hacer los pedidos con respecto al menu visto.
 * Autor: Juan D. Esquivel.
 */
public class Ordenar extends AppCompatActivity {
    ImageButton btnGrabar;
    static TextView txtResult;
    TextView txtR1;
    TextView txtR2;
    Button btnConfirmar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordenar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        txtResult=(TextView)findViewById(R.id.txtResult);
        txtR1=(TextView)findViewById(R.id.textR1);
        txtR2=(TextView)findViewById(R.id.textR2);
        btnGrabar = (ImageButton)findViewById(R.id.btnGrabar);
        btnConfirmar=(Button)findViewById(R.id.btnConfirmar);
        btnGrabar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                VozaTexto();
            }
        });
        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Metodo al presionar confirmar, usar el post.
                Intent intent5 = new Intent(Ordenar.this, Factura.class);
                startActivity(intent5);
            }
        });
    }

    /**Método de uso de voz.
     *No se implemento una librería extra.
     */
    public void VozaTexto(){
        Intent i = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        i.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        i.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        i.putExtra(RecognizerIntent.EXTRA_PROMPT,"Por favor pide algo del menu.");
        try {
            startActivityForResult(i, 100);
        }catch(ActivityNotFoundException a){
            Toast.makeText(Ordenar.this,"Lo sentimos, su dispositivo no es compatible con la grabación.",Toast.LENGTH_LONG).show();
        }
    }
    public void onActivityResult(int request_code,int result_code,Intent i){
        super.onActivityResult(request_code,result_code,i);
        switch (request_code){
            case 100: if(result_code==RESULT_OK && i!=null){
                ArrayList<String> result = i.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                txtR1.setText("Has pedido: ");
                txtResult.setText(result.get(0));
                txtR2.setText("¿Estás seguro de tu orden?");
                btnConfirmar.setVisibility(View.VISIBLE);
            }
                break;
        }
    }


}
