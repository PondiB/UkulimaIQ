package com.pondipb.pondibrian.ukulimaiq

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class ListAdapter(
    context: Context,
    private val vg: Int,
    id: Int,
    private val itemsList: Array<String>
) : ArrayAdapter<String>(context, vg, id, itemsList) {

    // ViewHolder pattern to improve scrolling performance
    private class ViewHolder {
        lateinit var txtModel: TextView
        lateinit var txtPrice: TextView
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var rowView = convertView
        
        if (rowView == null) {
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            rowView = inflater.inflate(vg, parent, false)
            
            val holder = ViewHolder()
            holder.txtModel = rowView.findViewById(R.id.txtmodel)
            holder.txtPrice = rowView.findViewById(R.id.txtprice)
            rowView.tag = holder
        }
        
        val items = itemsList[position].split("__")
        val holder = rowView!!.tag as ViewHolder
        
        if (items.isNotEmpty()) {
            holder.txtModel.text = items[0]
            if (items.size > 1) {
                holder.txtPrice.text = items[1]
            }
        }
        
        return rowView
    }
}
