package com.example.yvtc.yvn110305;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    String[] fruits = {"蘋果", "香蕉", "鳳梨", "芭樂", "檸檬", "蘋果1", "香蕉1", "鳳梨1", "芭樂1", "檸檬1"};
    MyAdapter1 adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listView);
        adapter = new MyAdapter1(MainActivity.this, fruits);
        lv.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("Show");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<fruits.length;i++)
        {
            if (adapter.chks[i])
            {
                sb.append(fruits[i] + ",");
            }
        }
        Toast.makeText(MainActivity.this, sb.toString(), Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }
}
