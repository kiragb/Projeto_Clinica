package com.example.projetoclinica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Abdomen_e_Costas : AppCompatActivity() {
    var imageView: ImageView? = null

    var Continuar: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abdomen_e_costas)

        Continuar = findViewById(R.id.Continuar)
        Continuar!!.setOnClickListener {
            val intent = Intent(this@Abdomen_e_Costas, AST_Abdomen_e_Costas::class.java)
            startActivity(intent)
            finish()
        }
        imageView = findViewById(R.id.imageView)
        imageView!!.setOnClickListener {
            val intent = Intent(this@Abdomen_e_Costas, Costas::class.java)
            startActivity(intent)
            finish()
        }
    }
}