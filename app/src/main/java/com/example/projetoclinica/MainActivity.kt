package com.example.projetoclinica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.projetoclinica.R
import com.example.projetoclinica.TelaAgendaActivity


class MainActivity : AppCompatActivity(), OnClickListener {


    lateinit var Usuario: EditText
    lateinit var  Entrar: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Usuario = findViewById(R.id.Usuario)
        Entrar = findViewById(R.id.Entrar)
        Entrar!!.setOnClickListener {
            val intent = Intent(this@MainActivity, TelaAgendaActivity::class.java)
            intent.putExtra("Chave", Usuario!!.text.toString())
            startActivity(intent)
            finish()
        }

    }
    override fun onClick(v: View?)
    {
        val name = Usuario.text
        Usuario.text = name
    }
}