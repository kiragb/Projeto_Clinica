package com.example.projetoclinica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Sucesso : AppCompatActivity() {

    var fechar: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sucesso)

        fechar = findViewById(R.id.Fechar)
        fechar!!.setOnClickListener {
            val intent = Intent(this@Sucesso, TelaAgendaActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

}