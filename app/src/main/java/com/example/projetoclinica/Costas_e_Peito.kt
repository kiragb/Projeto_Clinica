package com.example.projetoclinica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Costas_e_Peito : AppCompatActivity() {
    var imageView: ImageView? = null

    var Continuar: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_costas_e_peito)

        Continuar = findViewById(R.id.Continuar)
        Continuar!!.setOnClickListener {
            val intent = Intent(this@Costas_e_Peito, AST_Costas_e_Peito::class.java)
            startActivity(intent)
            finish()
        }
        imageView = findViewById(R.id.imageView)
        imageView!!.setOnClickListener {
            val intent = Intent(this@Costas_e_Peito, Peito::class.java)
            startActivity(intent)
            finish()
        }
    }
}