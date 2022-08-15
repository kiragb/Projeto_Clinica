package com.example.projetoclinica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Biceps : AppCompatActivity() {
    var Adicionar: Button? = null
    var Continuar: Button? = null
    var imageView: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biceps)

        Adicionar = findViewById(R.id.Adicionar)
        Adicionar!!.setOnClickListener {
            val intent = Intent(this@Biceps, Adicionar_Mais_Locais_Biceps::class.java)
            startActivity(intent)
            finish()
        }


        Continuar = findViewById(R.id.Continuar)
        Continuar!!.setOnClickListener {
            val intent = Intent(this@Biceps, AST_Biceps::class.java)
            startActivity(intent)
            finish()
        }
        imageView = findViewById(R.id.imageView)
        imageView!!.setOnClickListener {
            val intent = Intent(this@Biceps, Pre_Sessao::class.java)
            startActivity(intent)
            finish()
        }
    }
}