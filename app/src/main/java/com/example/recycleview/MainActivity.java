package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        // obliger créer un layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new CustomAdapter( new String[]{
                "orange",
                "clementine",
                "banana",
                "ananas",
                "mango",
                "raisin",
                "mandarine",
                "citron",
                "orange",
                "clementine",
                "banana",
                "ananas",
                "mango",
                "raisin",
                "mandarine",
                "citron",
                "orange",
                "clementine",
                "banana",
                "ananas",
                "mango",
                "raisin",
                "mandarine",
                "citron",

        }));
    }
}