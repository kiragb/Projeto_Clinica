package com.example.projetoclinica

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Color.red
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.annotation.ColorRes
import androidx.annotation.RequiresApi

class AST_Peito : AppCompatActivity() {
    var Continuar: Button? = null
    var imageView: ImageView? = null

    var botão1: Button? = null
    var botão2: Button? = null
    var botão3: Button? = null
    var botão4: Button? = null
    @SuppressLint("ResourceType")
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ast_peito)

        botão1 = findViewById(R.id.botão1)
        botão1!!.setOnClickListener {
            botão1!!.setBackgroundResource(R.drawable.btn_pressionado)
            botão1!!.setTextAppearance(Color.WHITE)
        }
        botão2 = findViewById(R.id.botão2)
        botão2!!.setOnClickListener {
            botão2!!.setBackgroundResource(R.drawable.btn_pressionado)
            botão2!!.setTextAppearance(Color.WHITE)
        }

        botão3 = findViewById(R.id.botão3)
        botão3!!.setOnClickListener {
            botão3!!.setBackgroundResource(R.drawable.btn_pressionado)
            botão3!!.setTextAppearance(Color.WHITE)
        }

        botão4 = findViewById(R.id.botão4)
        botão4!!.setOnClickListener {
            botão4!!.setBackgroundResource(R.drawable.btn_pressionado)
            botão4!!.setTextAppearance(Color.WHITE)
        }
        Continuar = findViewById(R.id.Continuar)
        Continuar!!.setOnClickListener {
            val intent = Intent(this@AST_Peito, Adicionar_Medicoes::class.java)
            startActivity(intent)
            finish()
        }
        imageView = findViewById(R.id.imageView)
        imageView!!.setOnClickListener {
            val intent = Intent(this@AST_Peito, Peito::class.java)
            startActivity(intent)
            finish()
        }
    }
}