package com.example.projetoclinica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Costas : AppCompatActivity() {
    var Adicionar: Button? = null
    var Continuar: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_costas)

        Continuar = findViewById(R.id.Continuar)
        Continuar!!.setOnClickListener {
            val intent = Intent(this@Costas, AST_Costas::class.java)
            startActivity(intent)
            finish()
        }
        Adicionar = findViewById(R.id.Adicionar)
        Adicionar!!.setOnClickListener {
            val intent = Intent(this@Costas, Adicionar_Mais_Locais_Costas::class.java)
            startActivity(intent)
            finish()
        }
    }
}