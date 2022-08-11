package com.example.projetoclinica

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Mais_foto_4_capture : AppCompatActivity() {

    var PularFoto: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mais_foto_4_capture)


        val extras2 = intent.extras
        if (extras2 != null) {
            val image = extras2["foto1"] as Uri?
            if (image != null) {
                findViewById<ImageView>(R.id.iv_capture).setImageURI(image)
            }
        }

    }
}