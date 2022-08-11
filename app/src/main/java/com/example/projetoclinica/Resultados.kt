package com.example.projetoclinica

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Resultados : AppCompatActivity() {
    var EditarMedidas: Button? = null
    var Continuar: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultados)

        EditarMedidas = findViewById(R.id.EditarMedidas)
        EditarMedidas!!.setOnClickListener {
            val intent = Intent(this@Resultados, Editar_Medidas::class.java)
            startActivity(intent)
        }
        Continuar = findViewById(R.id.Continuar)
        Continuar!!.setOnClickListener {
            val intent = Intent(this@Resultados, Mais_fotos_1::class.java)
            startActivity(intent)
            finish()
        }

    }
}