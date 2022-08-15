package com.example.projetoclinica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Adicionar_Mais_Locais_Abdomen : AppCompatActivity() {
    var imageView: ImageView? = null

    var cocha1: Button? = null
    var cocha2: Button? = null
    var bicep1: Button? = null
    var bicep2: Button? = null
    var costas: Button? = null
    var peito: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adicionar_mais_locais_abdomen)


        cocha1 = findViewById(R.id.cocha1)
        cocha1!!.setOnClickListener {
            val intent = Intent(this@Adicionar_Mais_Locais_Abdomen, Coxas_e_Abdomen::class.java)
            startActivity(intent)
            finish()
        }

        cocha2 = findViewById(R.id.cocha2)
        cocha2!!.setOnClickListener {
            val intent = Intent(this@Adicionar_Mais_Locais_Abdomen, Coxas_e_Abdomen::class.java)
            startActivity(intent)
            finish()
        }

        peito = findViewById(R.id.peito)
        peito!!.setOnClickListener {
            val intent = Intent(this@Adicionar_Mais_Locais_Abdomen, Peito_e_Abdomen::class.java)
            startActivity(intent)
            finish()
        }

        bicep1 = findViewById(R.id.bicep1)
        bicep1!!.setOnClickListener {
            val intent =
                Intent(this@Adicionar_Mais_Locais_Abdomen, Biceps_e_Abdomen::class.java)
            startActivity(intent)
            finish()
        }

        bicep2 = findViewById(R.id.bicep2)
        bicep2!!.setOnClickListener {
            val intent =
                Intent(this@Adicionar_Mais_Locais_Abdomen, Biceps_e_Abdomen::class.java)
            startActivity(intent)
            finish()
        }

        costas = findViewById(R.id.costas)
        costas!!.setOnClickListener {
            val intent = Intent(this@Adicionar_Mais_Locais_Abdomen, Costas_e_Abdomen::class.java)
            startActivity(intent)
            finish()
        }

        imageView = findViewById(R.id.imageView)
        imageView!!.setOnClickListener {
            val intent = Intent(this@Adicionar_Mais_Locais_Abdomen, Abdomen::class.java)
            startActivity(intent)
            finish()
        }
    }
}