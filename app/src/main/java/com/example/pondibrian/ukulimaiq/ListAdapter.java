package com.example.pondibrian.ukulimaiq;

import android.content.Context;
import java.util.ArrayList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Pondi Brian on 4/11/2018.
 */

public class ListAdapter extends ArrayAdapter<String>{
    int vg;
    String[] items_list;
    Context context;
    public ListAdapter (Context context, int vg, int id, String[] items_list){
        super(context, vg, id, items_list);
        this.context =context;
        ArrayList<String> desc;
        this.items_list = items_list;
        this.vg = vg;
    }
// Holds views of Listview to improve its scrolling performance
    static class ViewHolder{
        public TextView txtModel;
        public TextView txtPrice;

    }
    public  View getView(int position,View convertView, ViewGroup parent){
        View rowView = convertView;
        if (rowView==null){
            LayoutInflater inflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(vg, parent,false);
            ViewHolder holder = new ViewHolder();
            holder.txtModel = rowView.findViewById(R.id.txtmodel);
            holder.txtPrice = rowView.findViewById(R.id.txtprice);
            rowView.setTag(holder);
        }
        String[] items = items_list[position].split("__");
        ViewHolder holder =(ViewHolder)rowView.getTag();
        holder.txtModel.setText(items[0]);
        holder.txtPrice.setText(items[1]);
        return  rowView;
    }
}
