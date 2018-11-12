package com.daly.tabsexample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class ItemAdapter(var context: Context, var items: ArrayList<ItemModel>) : BaseAdapter() {

    override fun getItem(position: Int): ItemModel {
        return items.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return items.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var view: View
        var viewHolder: ViewHolder
        if (convertView == null) {

            var layoutInflater = LayoutInflater.from(context)
            view = layoutInflater.inflate(R.layout.activity_empty_template, parent, false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = convertView.tag as ViewHolder
        }

        return view
    }

    class ViewHolder(view: View) {

    }
}