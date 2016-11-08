package com.example.yvtc.yvn110305;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    String[] fruits = {"蘋果", "香蕉", "鳳梨", "芭樂", "檸檬"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listView);
        MyAdapter1 adapter = new MyAdapter1(MainActivity.this, fruits);
        lv.setAdapter(adapter);
    }

}
