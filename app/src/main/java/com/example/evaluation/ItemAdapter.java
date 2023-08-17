package com.example.evaluation.;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.evaluation.Item;
import com.example.evaluation.R;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class ItemAdapter extends BaseAdapter {
    private Context context;
    private List<Item> items;


    public ItemAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items ;
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
            convertView = LayoutInflater.from(context).inflate(R.layout.layout, parent, false);
        }

        TextView textView = convertView.findViewById(R.id.question);
        RatingBar ratingBar = convertView.findViewById(R.id.ratingBar);
        EditText editText = convertView.findViewById(R.id.comment);
        //Spinner spinner= convertView.findViewById(R.id.spinner1);

        Button button = convertView.findViewById(R.id.btn);


        Item item = (Item) getItem(position);

        textView.setText(item.getQuestion());
        ratingBar.setRating(item.getRatingBar());
        editText.setText(item.getComment());

        return convertView;
    }


}