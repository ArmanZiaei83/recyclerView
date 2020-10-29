package com.example.list;

import androidx.annotation.ArrayRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import static com.example.list.R.drawable.ic_android;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView ;
    private RecyclerView.Adapter mAdapter ;
    private  RecyclerView.LayoutManager mLayoutManager ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<view> viewRes = new ArrayList<>();
        viewRes.add(new view(R.drawable.ic_android , "Android" , "line 1"));
        viewRes.add(new view(R.drawable.ic_baseline_account_box_24 , "Circle Account" , "line2"));
        viewRes.add(new view(R.drawable.ic_baseline_account_circle_24 , "_XXX_" , "line 3"));

        mRecyclerView = findViewById(R.id.recview);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(viewRes);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}