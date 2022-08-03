package com.example.projetoclinica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_coxas_ebiceps.*

class Adicionar_Mais_Locais_Coxas: AppCompatActivity() {

    var bicep1: Button? = null
    var bicep2: Button? = null
    var abdomen: Button? = null
    var costas: Button? = null
    var peito: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adicionar_mais_locais_coxas)

        peito = findViewById(R.id.peito)
        peito!!.setOnClickListener {
            val intent = Intent(this@Adicionar_Mais_Locais_Coxas, Peito_e_Coxas::class.java)
            startActivity(intent)
            finish()
        }



        costas = findViewById(R.id.costas)
        costas!!.setOnClickListener {
            val intent = Intent(this@Adicionar_Mais_Locais_Coxas, Costas_e_Coxas::class.java)
            startActivity(intent)
            finish()
        }


        abdomen = findViewById(R.id.abdomen)
        abdomen!!.setOnClickListener {
            val intent = Intent(this@Adicionar_Mais_Locais_Coxas, Abdomen_e_Coxas::class.java)
            startActivity(intent)
            finish()
        }

        bicep1 = findViewById(R.id.bicep1)
        bicep1!!.setOnClickListener {
            val intent = Intent(this@Adicionar_Mais_Locais_Coxas, Biceps_e_Coxas::class.java)
            startActivity(intent)
            finish()
        }

        bicep2 = findViewById(R.id.bicep2)
        bicep2!!.setOnClickListener {
            val intent = Intent(this@Adicionar_Mais_Locais_Coxas, Biceps_e_Coxas::class.java)
            startActivity(intent)
            finish()
        }


    }
}