package com.example.projetoclinica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Costas_e_Peito : AppCompatActivity() {

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
    }
}