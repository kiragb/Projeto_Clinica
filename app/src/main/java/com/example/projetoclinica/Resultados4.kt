package com.example.projetoclinica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Resultados4 : AppCompatActivity() {
    var peitoral: TextView? = null
    var quadriceps: TextView? = null
    var cintura: TextView? = null
    var bicepsr: TextView? = null
    var panturrilha: TextView? = null
    var Continuar: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultados4)

        peitoral = findViewById<View>(R.id.peitoral) as TextView?
        val valor1 = intent.getStringExtra("Peitoral")
        peitoral?.text = valor1

        quadriceps = findViewById<View>(R.id.quadriceps) as TextView?
        val valor2 = intent.getStringExtra("Quadriceps")
        quadriceps?.text = valor2

        cintura = findViewById<View>(R.id.cintura) as TextView?
        val valor3 = intent.getStringExtra("Cintura")
        cintura?.text = valor3

        bicepsr = findViewById<View>(R.id.biceps) as TextView?
        val valor4 = intent.getStringExtra("Biceps")
        bicepsr?.text = valor4

        panturrilha = findViewById<View>(R.id.panturrilha) as TextView?
        val valor5 = intent.getStringExtra("Panturrilha")
        panturrilha?.text = valor5

        Continuar = findViewById(R.id.Continuar)
        Continuar!!.setOnClickListener {
            val intent = Intent(this@Resultados4, Mais_Fotos_1_Pos::class.java)
            startActivity(intent)
            finish()
        }

    }
}