package com.example.projetoclinica

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import android.widget.Toast.makeText
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import java.util.*


class SuaAgendaActivity : Fragment(), View.OnClickListener{

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View? {
        return inflater.inflate(R.layout.sua_agenda, container, false)
    }
    var DataPosterior: ImageView? = null
    var DataAnterior: ImageView? = null
    var DiaeMes: TextView? = null

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        DataPosterior = view.findViewById<View>(R.id.DataPosterior) as ImageView
        DataAnterior = view.findViewById<View>(R.id.DataAnterior) as ImageView

        DataPosterior!!.setOnClickListener(this)

        view.findViewById<TextView>(R.id.DiaeMes) as TextView
        DiaeMes?.setOnClickListener{ Toast.makeText(this.activity,
           "jsssssss", Toast.LENGTH_LONG).show() }
    }

    override fun onClick(p0: View?) {
        
    }
}

/* class agenda: AppCompatActivity() {

    var DataPosterior: ImageView? = null
    var DataAnterior: ImageView? = null
    var DiaeMes: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sua_agenda)

        DataPosterior = findViewById<View>(R.id.DataPosterior) as ImageView
        DataAnterior = findViewById<View>(R.id.DataAnterior) as ImageView

        DataPosterior!!.setOnClickListener{

            @Override
           fun onClick(v: View?)
            {
                Toast.makeText(this, "imagem não encotrada",Toast.LENGTH_SHORT).show();
            }
        }
}
    }*/

