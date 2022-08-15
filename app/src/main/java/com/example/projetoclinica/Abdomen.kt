package com.example.projetoclinica

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Abdomen : AppCompatActivity() {
    var Continuar: Button? = null
    var Adicionar: Button? = null
    var imageView: ImageView? = null
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
        imageView = findViewById(R.id.imageView)
        imageView!!.setOnClickListener {
            val intent = Intent(this@Abdomen, Pre_Sessao::class.java)
            startActivity(intent)
            finish()
        }
    }
}