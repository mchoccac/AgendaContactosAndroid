package com.choccac.mcontacto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){

        Intent i = new Intent(this, Agregar.class);
        startActivity(i);
    }

    public void onListar(View view){
        Intent i = new Intent(this, BuscarPersona.class);
        startActivity(i);
    }

    public void onEliminar(View view){
        Intent i = new Intent(this, eliminar.class);
        startActivity(i);
    }

    public void premodificar(View view){
        Intent i = new Intent(this, pre_modificar.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
