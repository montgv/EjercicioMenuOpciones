package com.example.ejerciciomenuopciones;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //Declaramos la siguientes variables de imageView
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtenemos las referencias a los controles
        imageView1 = findViewById(R.id.idIVAsir);
        imageView2 = findViewById(R.id.idIVDam);
        imageView3 = findViewById(R.id.idIVDaw);

        //Asociamos los menus contextuales a los controles
        registerForContextMenu(imageView1);
        registerForContextMenu(imageView2);
        registerForContextMenu(imageView3);
    }

    /*
    Sobreescribimos el evento encargado de construir los menus opciones asociados a los diferentes
    controles
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_opciones, menu);
        return true;
    }

    /*
    Sobreescribimos el evento encargado de construir los menus contextuales asociados a los diferentes
    controles
     */
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_opciones, menu);
    }

    /*
    Implementamos las acciones a realizar tras pulsar una opcion determinada del menu
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.idAsir:
                Intent intent1 = new Intent(this, ScrollingASIR.class);
                startActivity(intent1);
                finish();
                return true;
            case R.id.idDaw:
                Intent intent3 = new Intent(this, ScrollingDAW.class);
                startActivity(intent3);
                finish();
                return true;
            case R.id.idDam:
                Intent intent2 = new Intent(this, ScrollingDAM.class);
                startActivity(intent2);
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    /*
    Implementamos las acciones a realizar tras pulsar una opcion determinada del menu contextual
     */
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.idAsir:
                Intent intent1 = new Intent(this, com.example.ejerciciomenuopciones.ScrollingASIR.class);
                startActivity(intent1);
                finish();
                return true;
            case R.id.idDaw:
                Intent intent2 = new Intent(this, com.example.ejerciciomenuopciones.ScrollingDAW.class);
                startActivity(intent2);
                finish();
                return true;
            case R.id.idDam:
                Intent intent3 = new Intent(this, com.example.ejerciciomenuopciones.ScrollingDAM.class);
                startActivity(intent3);
                finish();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}