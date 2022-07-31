package com.example.projetoclinica

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.item_list.view.*

class MeuAdapter(
    private val context: Context,
    var  txtTitle: Array<String>,
    var  Nome: Array<String>,
    var  Sessao: Array<String>,
    var CardBotao: Array<Int>) :

    BaseAdapter() {

    @SuppressLint("ViewHolder", "InflateParams")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {

            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view = inflater.inflate(R.layout.item_list, null,true)

        view.findViewById<TextView>(R.id.text).text = txtTitle[position]
        view.findViewById<TextView>(R.id.Sessao).text = Sessao[position]
        view.findViewById<TextView>(R.id.Nome).text = Nome[position]

        return view
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return CardBotao.size
    }
}