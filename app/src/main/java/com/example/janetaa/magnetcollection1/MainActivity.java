package com.example.janetaa.magnetcollection1;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] magnets = {"Florida Magnets", "Wisconsin Magnets", "Chicago Land Magnets", "Misouri Magnets"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.collection));


    }
    protected void onListItemClick(ListView l, View v, int position, long id){
        switch (position){
            case 0:
                startActivity(new Intent(MainActivity.this, FloridaMagnets.class));
                break;
            case 1:
                startActivity(new Intent(MainActivity.this, ChicagoLandMagnets.class));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, MisouriMagnets.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, WisconsinMagnets.class));
                break;
            case 4:

                break;
        }

    }
}
