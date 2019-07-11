package com.choccac.mcontacto;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;


    public class TodoCursorAdapter extends CursorAdapter {
        public TodoCursorAdapter(Context context, Cursor cursor) {
            super(context, cursor, 0);
        }

        @Override
        public View newView(Context context, Cursor cursor, ViewGroup parent) {
            return LayoutInflater.from(context).inflate(R.layout.activity_buscar_persona, parent, false);
        }

        @Override
        public void bindView(View view, Context context, Cursor cursor) {

            TextView idtxt = (TextView) view.findViewById(R.id.id_txt);
            TextView apellidotxt = (TextView) view.findViewById(R.id.apellido_txt);
            TextView nombretxt = (TextView) view.findViewById(R.id.nombre_txt);

            // Extraccion de las propiedades del cursor


           int txtid = cursor.getInt(cursor.getColumnIndexOrThrow("_id"));
           String txtapellido = cursor.getString(cursor.getColumnIndexOrThrow("apellido"));
           String txtnombre = cursor.getString(cursor.getColumnIndexOrThrow("nombre"));

           idtxt.setText(String.valueOf(txtid));
           apellidotxt.setText(txtapellido);
           nombretxt.setText(txtnombre);

        }
    }



