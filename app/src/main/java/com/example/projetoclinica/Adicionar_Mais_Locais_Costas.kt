package com.example.projetoclinica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Adicionar_Mais_Locais_Costas: AppCompatActivity() {

    var cocha1: Button? = null
    var cocha2: Button? = null
    var abdomen: Button? = null
    var bicep1: Button? = null
    var bicep2: Button? = null
    var peito: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adicionar_mais_locais_costas)


        cocha1 = findViewById(R.id.cocha1)
        cocha1!!.setOnClickListener {
            val intent = Intent(this@Adicionar_Mais_Locais_Costas, Coxas_e_Costas::class.java)
            startActivity(intent)
            finish()
        }

        cocha2 = findViewById(R.id.cocha2)
        cocha2!!.setOnClickListener {
            val intent = Intent(this@Adicionar_Mais_Locais_Costas, Coxas_e_Costas::class.java)
            startActivity(intent)
            finish()
        }

        bicep1 = findViewById(R.id.bicep1)
        bicep1!!.setOnClickListener {
            val intent = Intent(this@Adicionar_Mais_Locais_Costas, Biceps_e_Costas::class.java)
            startActivity(intent)
            finish()
        }

        bicep2 = findViewById(R.id.bicep2)
        bicep2!!.setOnClickListener {
            val intent = Intent(this@Adicionar_Mais_Locais_Costas, Biceps_e_Costas::class.java)
            startActivity(intent)
            finish()
        }

        peito = findViewById(R.id.peito)
        peito!!.setOnClickListener {
            val intent = Intent(this@Adicionar_Mais_Locais_Costas, Peito_e_Costas::class.java)
            startActivity(intent)
            finish()
        }

        abdomen = findViewById(R.id.abdomen)
        abdomen!!.setOnClickListener {
            val intent =
                Intent(this@Adicionar_Mais_Locais_Costas, Abdomen_e_Costas::class.java)
            startActivity(intent)
            finish()
        }

    }
}