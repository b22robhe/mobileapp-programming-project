package com.example.project;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=b22robhe";

    ArrayList<Planet> planets;

    RecyclerViewAdapter adapter;

    RecyclerView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this)
			.build();
        ImageLoader.getInstance().init(config);


        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        planets = new ArrayList<>();


        new JsonTask(this).execute(JSON_URL);
    }

    @Override
    public void onPostExecute(String json) {

        Log.d("MainActivity", json);
        Gson gson = new Gson();
        Type type = new TypeToken<List<Planet>>() {}.getType();
        planets = gson.fromJson(json, type);

        Log.d("XD", planets.toString());

        adapter = new RecyclerViewAdapter(this, planets, new RecyclerViewAdapter.OnClickListener() {
            @Override
            public void onClick(Planet item) {
                Toast.makeText(MainActivity.this, item.getName(), Toast.LENGTH_SHORT).show();
            }
        });

        view = findViewById(R.id.recycler_view);
        view.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        view.setAdapter(adapter);



        this.adapter.notifyDataSetChanged();


    }

}
