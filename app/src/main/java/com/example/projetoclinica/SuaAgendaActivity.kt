package com.example.projetoclinica

import android.media.Image
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import java.text.SimpleDateFormat
import java.util.*
import android.content.Intent as Intent


class SuaAgendaActivity : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ):
            View? {
        return inflater.inflate(R.layout.sua_agenda, container, false)
    }

    var BotãoCard1: Button? = null
    var BotãoCard2: Button? = null
    var BotãoCard3: Button? = null
    var BotãoCard4: Button? = null
    var DataPosterior: ImageView? = null

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val date = Calendar.getInstance().time

        val DiaeMes = view.findViewById<TextView>(R.id.DiaeMes)

        var dateTimeFormat = SimpleDateFormat("EEEE, dd MMMM ", Locale.getDefault())
        DiaeMes!!.text = dateTimeFormat.format(date)

        val Agenda = view.findViewById<ListView>(R.id.Agenda)

        val txtTitle = arrayOf(
            "10h",
            "11h",
            "12h",
            "13h",
            "14h",
            "15h",
            "16h",
            "17h",
            "18h",
            "19h",
            "20h",
            "21h",
            "22h"
        )

        Agenda!!.adapter = MeuAdapter(
            view.context, txtTitle
        )

        BotãoCard1 = view.findViewById(R.id.BotãoCard1)
        BotãoCard1!!.setOnClickListener {
            val intent = Intent(view.context, Sessao::class.java)
            startActivity(intent)
        }

        BotãoCard2 = view.findViewById(R.id.BotãoCard2)
        BotãoCard2!!.setOnClickListener {
            val intent = Intent(view.context, Sessao::class.java)
            startActivity(intent)
        }

        BotãoCard3 = view.findViewById(R.id.BotãoCard3)
        BotãoCard3!!.setOnClickListener {
            val intent = Intent(view.context, Sessao::class.java)
            startActivity(intent)
        }

        BotãoCard4 = view.findViewById(R.id.BotãoCard4)
        BotãoCard4!!.setOnClickListener {
            val intent = Intent(view.context, Sessao::class.java)
            startActivity(intent)
        }

        DataPosterior = view.findViewById(R.id.DataPosterior)
        DataPosterior!!.setOnClickListener {
            // as per defined in your FragmentContainerView
        }




    }


}



