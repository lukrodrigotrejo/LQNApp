package com.loquenecesitas.lqnapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NewListProduct extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_list_product);

        //obtengo el listview del xml
        listView = (ListView) findViewById(R.id.list);

        //defino los valores del arreglo para setearlos en la lista
        String[] values = new String[]{"Android List View",
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android",
                "Android Example",
                "List View Source Code",
                "List View Array Adapter",
                "Android Example List View",
                "Android List View",
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android",
                "Android Example",
                "List View Source Code",
                "List View Array Adapter",
                "Android Example List View",
                "Android List View",
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android",
                "Android Example",
                "List View Source Code",
                "List View Array Adapter",
                "Android Example List View"
        };

        // Se crea un nuevo Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);

        // Assign adapter to ListView
        listView.setAdapter(adapter);

        /*
            CREAR NUEVO LISTADO CON LAS FILAS CUSTOMIZADAS
            -ListModel.java file (es el archivo de dominio, en nuestro caso la "oferta")
            -CustomAdapter.java file (es el archivo java que va a procesar los elementos de la lista
            -tabitem.xml (es la vista que va a tener cada elemento de la lista)
            -CustomListViewAndroidExample.java file (es el activity en el cual vamos a setear la lista) (NewListProduct.java)
            -activity_custom_list_view_android_example.xml file (es la vista donde vamos a mostrar la lista) (new_list_product.xml)
         */

    }
}
