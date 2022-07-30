package com.example.projetoclinica

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

 class MeuAdapter(
    context: Context?,
     var imgIcon: Array <Int>,
    var txtTitle: Array <String>
) :
    BaseAdapter() {
    private val mInflater: LayoutInflater
    override fun getCount(): Int {
        return imgIcon.size
    }

    override fun getItem(position: Int): Int {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, view: View, parent: ViewGroup): View {
        var view = view
        val itemHolder: ItemSuporte

        if (view == null) {

            view = mInflater.inflate(R.layout.item_list, null)

            itemHolder = ItemSuporte()
            itemHolder.txtTitle = view.findViewById<View>(R.id.text) as TextView
            itemHolder.imgIcon = view.findViewById<View>(R.id.imagemview) as ImageView

            view.tag = itemHolder
        } else {
            itemHolder = view.tag as ItemSuporte
        }

        itemHolder.txtTitle!!.text = txtTitle[position]
        itemHolder.imgIcon!!.setImageResource(imgIcon[position])

        return view
    }


    private inner class ItemSuporte {
        var imgIcon: ImageView? = null
        var txtTitle: TextView? = null
    }

    init {
        //Itens do listview
        //Objeto responsável por pegar o Layout do item.
        mInflater = LayoutInflater.from(context)
    }
}



