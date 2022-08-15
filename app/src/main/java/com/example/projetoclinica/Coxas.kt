package com.example.projetoclinica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Coxas : AppCompatActivity() {
    var imageView: ImageView? = null

    var Adicionar: Button? = null
    var Continuar: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coxas)

        Continuar = findViewById(R.id.Continuar)
        Continuar!!.setOnClickListener {
            val intent = Intent(this@Coxas, AST_Coxas::class.java)
            startActivity(intent)
            finish()
        }

        Adicionar = findViewById(R.id.Adicionar)
        Adicionar!!.setOnClickListener {
            val intent = Intent(this@Coxas, Adicionar_Mais_Locais_Coxas::class.java)
            startActivity(intent)
            finish()
        }
        imageView = findViewById(R.id.imageView)
        imageView!!.setOnClickListener {
            val intent = Intent(this@Coxas, Pre_Sessao::class.java)
            startActivity(intent)
            finish()
        }
    }
}