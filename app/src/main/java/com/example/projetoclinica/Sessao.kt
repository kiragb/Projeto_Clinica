package com.example.projetoclinica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_sessao.*
import kotlinx.android.synthetic.main.activity_tela_agenda.*

class Sessao : AppCompatActivity() {

    var vermaisinfo: TextView? = null
    var Entrar: Button? = null
    var cancelar: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sessao)

        vermaisinfo = findViewById(R.id.vermaisinfo)
        vermaisinfo!!.setOnClickListener {
            val intent = Intent(this@Sessao, Detalhes_da_Sessao::class.java)
            startActivity(intent)
            finish()
        }
        Entrar = findViewById(R.id.Entrar)
        Entrar!!.setOnClickListener {
            val intent = Intent(this@Sessao, Passo_a_Passo::class.java)
            startActivity(intent)
            finish()
        }

    }
}