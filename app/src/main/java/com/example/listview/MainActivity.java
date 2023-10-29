package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView cities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        cities = findViewById(R.id.cities);
        ArrayList<String> array = new ArrayList<>();
        array.add("Mumbai");
        array.add("Pune");
        array.add("Hyderabad");
        array.add("Kolkata");
        array.add("Chennai");

        ArrayAdapter<String> cityAdapter = new ArrayAdapter<>(
                    this,
                android.R.layout.simple_list_item_1,
                array
                );
        cities.setAdapter(cityAdapter);

        cities.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, array.get(position)+" selected",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
