package com.example.projetoclinica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Peito : AppCompatActivity() {
    var Adicionar: Button? = null
    var Continuar: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_peito)

        Continuar = findViewById(R.id.Continuar)
        Continuar!!.setOnClickListener {
            val intent = Intent(this@Peito, AST_Peito::class.java)
            startActivity(intent)
            finish()
        }

        Adicionar = findViewById(R.id.Adicionar)
        Adicionar!!.setOnClickListener {
            val intent = Intent(this@Peito, Adicionar_Mais_Locais_Peito::class.java)
            startActivity(intent)
            finish()
        }
    }
}