package com.example.ekart;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GridAdapter extends BaseAdapter {

    private final Context context;
    private final ArrayList<Object> items;

    public GridAdapter(Context context, ArrayList<Object> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context)
                    .inflate(R.layout.grid_item, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.grid_image);
        TextView textView = convertView.findViewById(R.id.grid_text);

        // Get the current GridItem
        GridItem currentItem = (GridItem) getItem(position);

        // Set values using getters
        imageView.setImageResource(currentItem.getImageResource());
        textView.setText(currentItem.getText());

        return convertView;
    }
}
