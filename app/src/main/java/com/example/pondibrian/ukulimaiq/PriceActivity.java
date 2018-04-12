package com.example.pondibrian.ukulimaiq;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ListView;

public class PriceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price);
        ListView listView = findViewById(R.id.listv);
        ViewGroup headerView = (ViewGroup)getLayoutInflater().inflate(R.layout.header,listView,false);
        listView.addHeaderView(headerView);
        String[] items =getResources().getStringArray(R.array.list_items);
        ListAdapter adapter = new ListAdapter(this,R.layout.row_layout,R.id.txtmodel,items);
        listView.setAdapter(adapter);
    }
}
