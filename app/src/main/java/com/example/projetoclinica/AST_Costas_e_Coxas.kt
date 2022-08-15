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

class AST_Costas_e_Coxas : AppCompatActivity() {
    var Continuar: Button? = null
    var imageView: ImageView? = null

    var botão1: Button? = null
    var botão2: Button? = null
    var botão3: Button? = null
    var botão4: Button? = null
    var botão5: Button? = null
    var botão6: Button? = null
    var botão7: Button? = null
    var botão8: Button? = null
    @SuppressLint("ResourceType")
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ast_costas_e_coxas)

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


        botão5 = findViewById(R.id.botão5)
        botão5!!.setOnClickListener {
            botão5!!.setBackgroundResource(R.drawable.btn_pressionado)
            botão5!!.setTextAppearance(Color.WHITE)
        }
        botão6 = findViewById(R.id.botão6)
        botão6!!.setOnClickListener {
            botão6!!.setBackgroundResource(R.drawable.btn_pressionado)
            botão6!!.setTextAppearance(Color.WHITE)
        }

        botão7 = findViewById(R.id.botão7)
        botão7!!.setOnClickListener {
            botão7!!.setBackgroundResource(R.drawable.btn_pressionado)
            botão7!!.setTextAppearance(Color.WHITE)
        }

        botão8 = findViewById(R.id.botão8)
        botão8!!.setOnClickListener {
            botão8!!.setBackgroundResource(R.drawable.btn_pressionado)
            botão8!!.setTextAppearance(Color.WHITE)
        }
        Continuar = findViewById(R.id.Continuar)
        Continuar!!.setOnClickListener {
            val intent = Intent(this@AST_Costas_e_Coxas, Adicionar_Medicoes::class.java)
            startActivity(intent)
            finish()
        }
        imageView = findViewById(R.id.imageView)
        imageView!!.setOnClickListener {
            val intent = Intent(this@AST_Costas_e_Coxas, Costas_e_Coxas::class.java)
            startActivity(intent)
            finish()
        }
    }
}