package com.example.projetoclinica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Abdomen : AppCompatActivity() {
    var Continuar: Button? = null
    var Adicionar: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abdomen)

        Adicionar = findViewById(R.id.Adicionar)
        Adicionar!!.setOnClickListener {
            val intent = Intent(this@Abdomen, Adicionar_Mais_Locais_Abdomen::class.java)
            startActivity(intent)
            finish()
        }

        Continuar = findViewById(R.id.Continuar)
        Continuar!!.setOnClickListener {
            val intent = Intent(this@Abdomen, AST_Abdomen::class.java)
            startActivity(intent)
            finish()
        }
    }
}