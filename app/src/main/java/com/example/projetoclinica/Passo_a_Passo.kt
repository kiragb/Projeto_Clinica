package com.example.projetoclinica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Passo_a_Passo : AppCompatActivity() {

    var Entrar: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_passo_apasso)

        Entrar = findViewById(R.id.Entrar)
        Entrar!!.setOnClickListener {
            val intent = Intent(this@Passo_a_Passo, Pre_Sessao::class.java)
            startActivity(intent)
            finish()
        }
    }
}