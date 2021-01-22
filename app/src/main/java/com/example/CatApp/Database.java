package com.example.CatApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Database extends AppCompatActivity {

    int[] images = {R.drawable.ragdoll, R.drawable.siamese, R.drawable.sphynx};

    String[] race = {"Ragdoll", "Siamese", "Sphynx"};


    ListView lView;

    ListAdapter lAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);

        lView = (ListView) findViewById(R.id.androidList);

        lAdapter = new ListAdapter(Database.this, race, images);

        lView.setAdapter(lAdapter);

        lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {

                Toast.makeText(Database.this, race[i], Toast.LENGTH_SHORT).show();

            }
        });


    }



}