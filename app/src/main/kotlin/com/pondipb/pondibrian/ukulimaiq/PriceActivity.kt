package com.pondipb.pondibrian.ukulimaiq

import android.os.Bundle
import android.view.ViewGroup
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class PriceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_price)
        
        val listView: ListView = findViewById(R.id.listv)
        val headerView = layoutInflater.inflate(R.layout.header, listView, false) as ViewGroup
        listView.addHeaderView(headerView)
        
        val items = resources.getStringArray(R.array.list_items)
        val adapter = ListAdapter(this, R.layout.row_layout, R.id.txtmodel, items)
        listView.adapter = adapter
    }
}
