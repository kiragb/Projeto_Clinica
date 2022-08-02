package com.example.projetoclinica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Pre_Sessao : AppCompatActivity() {

    var abdomen: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pre_sessao)

        abdomen = findViewById(R.id.abdomem)
        abdomen!!.setOnClickListener {
            val intent = Intent(this@Pre_Sessao, Abdomen::class.java)
            startActivity(intent)
            finish()
        }
    }

}