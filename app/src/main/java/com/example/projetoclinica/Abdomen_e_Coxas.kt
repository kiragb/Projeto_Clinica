package com.example.projetoclinica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Abdomen_e_Coxas : AppCompatActivity() {
    var Continuar: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abdomen_e_coxas)

        Continuar = findViewById(R.id.Continuar)
        Continuar!!.setOnClickListener {
            val intent = Intent(this@Abdomen_e_Coxas, AST_Abdomen_e_Coxas::class.java)
            startActivity(intent)
            finish()
        }
    }
}