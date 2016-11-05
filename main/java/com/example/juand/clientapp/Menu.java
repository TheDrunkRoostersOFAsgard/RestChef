package com.example.juand.clientapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.juand.main.QREscaner;
import com.example.juand.main.R;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONArray;
import org.json.JSONObject;

import httpGET.devazt.networking.HttpClient;
import httpGET.devazt.networking.OnHttpRequestComplete;
import httpGET.devazt.networking.Response;

/**
 * Pagina cuatro de la clientApp.
 * Se genere El GET del menu.
 * Autor: Juan D. Esquivel.
 */
public class Menu extends AppCompatActivity {
    Button btnOrdenar;
    Button btnMenu;
    LinearLayout MenuContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btnMenu=(Button)findViewById(R.id.btnMenu);
        MenuContent =(LinearLayout)findViewById(R.id.MenuContent);
        btnOrdenar=(Button)findViewById(R.id.btnOrdenar);
        btnMenu.setOnClickListener(new View.OnClickListener(){   //GET del menu.
            @Override
            /**
             * En este método al precionar el boton menu se genera el get del menú.
             * Se parsea el json.
             * Autor: Juan D.Esquivel.
             */
            public void onClick(View v) {
                HttpClient Cliente=new HttpClient(new OnHttpRequestComplete() {
                    @Override
                    public void onComplete(Response status) {
                        if (status.isSuccess()){
                            try{
                                Gson gson=new GsonBuilder().create();
                                String str=(status.getResult()).toString();
                                JSONArray jsonarray=new JSONArray(str);
                                for(int i=0;i<jsonarray.length();i++){
                                    JSONObject jsonobject = jsonarray.getJSONObject(i);
                                    String type = jsonobject.getString("type");
                                    String nombre = jsonobject.getString("nombre");
                                    String precio = jsonobject.getString("precio");
                                    TextView t = new TextView(Menu.this);
                                    t.setText(type+"\n"+nombre+"\n"+precio);
                                    MenuContent.addView(t);
                                }
                            }catch (Exception e){
                                e.printStackTrace();
                            }
                            Toast.makeText(Menu.this,status.getResult(),Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                Cliente.excecute("http://192.168.1.52:9080/RestServer/clientes/menu");
            }
        });
        btnOrdenar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(Menu.this, Ordenar.class);
                startActivity(intent4);
            }
        });
    }
}
