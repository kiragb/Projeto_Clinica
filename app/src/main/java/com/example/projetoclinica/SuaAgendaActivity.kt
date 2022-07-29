package com.example.projetoclinica

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import android.widget.ArrayAdapter
import android.widget.Toast.makeText
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import java.util.*


class SuaAgendaActivity : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View? {
        return inflater.inflate(R.layout.sua_agenda, container, false)
    }


    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val Agenda = view.findViewById<ListView>(R.id.Agenda)

        val nomes= arrayOf("10h", "11h", "12h", "13h", "14h", "15h", "16h", "17h", "18h", "19h", "20h", "21h", "22h")

        Agenda!!.adapter = ArrayAdapter(
            view.context,
            android.R.layout.simple_list_item_1, nomes
        )

        }
}



