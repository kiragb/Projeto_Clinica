package com.example.projetoclinica

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class Mais_Fotos_4_capture_Pos: AppCompatActivity() {

    var Continuar: Button? = null

    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mais_fotos4_capture_pos)


        val extras2 = intent.extras
        if (extras2 != null) {
            val image = extras2["foto1"] as Uri?
            if (image != null) {
                findViewById<ImageView>(R.id.iv_capture).setImageURI(image)
            }
        }
        Continuar = findViewById(R.id.Continuar)
        Continuar!!.setOnClickListener {
            val intent = Intent(this@Mais_Fotos_4_capture_Pos, Sucesso::class.java)
            startActivity(intent)
            finish()
        }
    }
}