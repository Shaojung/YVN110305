package com.example.yvtc.yvn110305;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by yvtc on 2016/11/8.
 */

public class MyAdapter1 extends BaseAdapter {
    Context context;
    String[] data;
    boolean[] chks;
    public MyAdapter1(Context c, String[] f)
    {
        context = c;
        data = f;
    }
    @Override
    public int getCount() {
        Log.d("MLIST", "getCount()");
        chks = new boolean[data.length];
        for (boolean b: chks)
        {
            b = false;
        }
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
    public View getView(final int position, View convertView, ViewGroup parent) {
        Log.d("MLIST", "getView() : " + position + "," + data[position]);
        ViewHolder holder;
        if (convertView == null)
        {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.myitem, null);
            holder = new ViewHolder();
            holder.tv = (TextView) convertView.findViewById(R.id.textView);
            holder.btn = (Button) convertView.findViewById(R.id.button);
            holder.chk = (CheckBox) convertView.findViewById(R.id.checkBox);
            convertView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.tv.setText(data[position]);
        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, data[position], Toast.LENGTH_SHORT).show();
            }
        });
        holder.chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                chks[position] = isChecked;
            }
        });
        holder.chk.setChecked(chks[position]);
        return convertView;
    }


    static class ViewHolder
    {
        TextView tv;
        Button btn;
        CheckBox chk;
    }
}
