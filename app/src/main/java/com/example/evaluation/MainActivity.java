package com.example.evaluation.;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import   com.example.evaluation.ItemAdapter;
import com.example.evaluation.Item;
import com.example.evaluation.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView itemListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        itemListView = findViewById(R.id.listView);

        List<Item> items = generateSamplePosts();
         ItemAdapter  adapter = new ItemAdapter(this, items);
        itemListView.setAdapter(adapter);


    }
    private List<Item> generateSamplePosts() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("what do you think about course ?",2," add comment " ));
        items.add(new Item("what do you think about course time ?",4," add comment "));


        return items;
    }
}