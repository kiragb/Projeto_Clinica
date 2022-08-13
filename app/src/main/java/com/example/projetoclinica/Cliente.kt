package com.example.projetoclinica

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import com.example.projetoclinica.R

class Cliente : Fragment() {
    var Continuar: Button? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_cliente, container, false)
    }
    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Continuar = view.findViewById(R.id.Continuar)
        Continuar!!.setOnClickListener {
            val intent = Intent(view.context, Adicionar_Medicoes_2::class.java)
            startActivity(intent)
        }


    }
}