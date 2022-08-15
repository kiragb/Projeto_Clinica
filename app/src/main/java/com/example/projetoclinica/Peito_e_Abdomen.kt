package com.example.projetoclinica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Peito_e_Abdomen : AppCompatActivity() {
    var imageView: ImageView? = null

    var Continuar: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_peito_e_abdomen)

        Continuar = findViewById(R.id.Continuar)
        Continuar!!.setOnClickListener {
            val intent = Intent(this@Peito_e_Abdomen, AST_Peito_e_Abdomen::class.java)
            startActivity(intent)
            finish()
        }
        imageView = findViewById(R.id.imageView)
        imageView!!.setOnClickListener {
            val intent = Intent(this@Peito_e_Abdomen, Abdomen::class.java)
            startActivity(intent)
            finish()
        }
    }
}