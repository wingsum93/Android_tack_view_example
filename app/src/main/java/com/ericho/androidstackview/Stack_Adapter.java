package com.ericho.androidstackview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by EricH on 27/7/2016.
 */
public class Stack_Adapter extends BaseAdapter {

    ArrayList<Stack_Items> arrayList;
    LayoutInflater inflater;
    ViewHolder holder = null;

    public Stack_Adapter(Context context, ArrayList<Stack_Items> arrayList) {
        this.arrayList = arrayList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return arrayList.size();
    }

    @Override
    public Stack_Items getItem(int pos) {
        // TODO Auto-generated method stub
        return arrayList.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        // TODO Auto-generated method stub
        return pos;
    }

    @Override
    public View getView(int pos, View view, ViewGroup parent) {
        if (view == null) {
            view = inflater.inflate(R.layout.display_item, parent, false);
            holder = new ViewHolder();

            holder.text = (TextView) view.findViewById(R.id.textView1);
            holder.image = (ImageView) view.findViewById(R.id.imageView1);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        holder.text.setText(arrayList.get(pos).getName());
        holder.image.setBackgroundResource(arrayList.get(pos).getImage());

        return view;
    }

    public class ViewHolder {
        TextView text;
        ImageView image;
    }
}
