package com.example.projetoclinica

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MeuAdapter(private val context: Context, var imgIcon: Array<Int>,var  txtTitle: Array<String>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {

            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view = inflater.inflate(R.layout.item_list, null,true)

        view.findViewById<ImageView>(R.id.imageView).setImageResource(imgIcon[position])
        view.findViewById<TextView>(R.id.text).text = txtTitle[position]

        return view
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return imgIcon.size
    }
}