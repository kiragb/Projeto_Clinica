package com.example.projetoclinica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Biceps_e_Abdomen : AppCompatActivity() {

    var Continuar: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biceps_e_abdomen)

        Continuar = findViewById(R.id.Continuar)
        Continuar!!.setOnClickListener {
            val intent = Intent(this@Biceps_e_Abdomen, AST_Biceps_e_Abdomen::class.java)
            startActivity(intent)
            finish()
        }
    }
}