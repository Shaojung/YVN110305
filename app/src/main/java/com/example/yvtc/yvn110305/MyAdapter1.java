package com.example.yvtc.yvn110305;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by yvtc on 2016/11/8.
 */

public class MyAdapter1 extends BaseAdapter {
    Context context;
    String[] data;
    public MyAdapter1(Context c, String[] f)
    {
        context = c;
        data = f;
    }
    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.myitem, null);

        TextView tv = (TextView) v.findViewById(R.id.textView);
        tv.setText(data[position]);
        return v;
    }
}
