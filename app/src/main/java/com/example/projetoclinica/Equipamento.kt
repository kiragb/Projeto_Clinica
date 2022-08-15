package com.example.projetoclinica

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction


class Equipamento : Fragment() {

    var Continuar: Button? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_equipamento, container, false)
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
