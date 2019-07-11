package com.choccac.mcontacto;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ListView;


public class BuscarPersona extends AppCompatActivity {

    EditText inputSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_persona);

        MyDBHandler dbHandler;
        dbHandler = new MyDBHandler(this, null, null, 1);
        SQLiteDatabase db = dbHandler.getWritableDatabase();
        Cursor cursor = dbHandler.listarpersonas();

        ListView lvlitems = (ListView) findViewById(R.id.lvlitems);
        lvlitems.setTextFilterEnabled(true);
        final TodoCursorAdapter todoAdapter = new TodoCursorAdapter(this, cursor);
        lvlitems.setAdapter(todoAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_buscar_persona, menu);
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
