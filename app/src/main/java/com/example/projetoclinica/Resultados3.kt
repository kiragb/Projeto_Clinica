package com.example.projetoclinica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Resultados3 : AppCompatActivity() {
    var EditarMedidas: Button? = null
    var Continuar: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resutados3)

        EditarMedidas = findViewById(R.id.EditarMedidas)
        EditarMedidas!!.setOnClickListener {
            val intent = Intent(this@Resultados3, Editar_Medidas_2::class.java)
            startActivity(intent)
        }
        Continuar = findViewById(R.id.Continuar)
        Continuar!!.setOnClickListener {
            val intent = Intent(this@Resultados3, Mais_fotos_1::class.java)
            startActivity(intent)
            finish()
        }

    }
}