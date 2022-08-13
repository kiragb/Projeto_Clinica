package com.example.projetoclinica

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class Mais_Fotos_1_capture_Pos: AppCompatActivity() {

    var PularFoto: Button? = null

    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mais_fotos_1_picture_pos)


        val extras2 = intent.extras
        if (extras2 != null) {
            val image = extras2["foto1"] as Uri?
            if (image != null) {
                findViewById<ImageView>(R.id.iv_capture).setImageURI(image)
            }
        }
        PularFoto = findViewById(R.id.PularFoto)
        PularFoto!!.setOnClickListener {
            val intent = Intent(this@Mais_Fotos_1_capture_Pos, Mais_foto_2::class.java)
            startActivity(intent)
            finish()
        }
    }
}