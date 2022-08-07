package com.example.projetoclinica

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class Adicionar_Medicoes : AppCompatActivity() {

    var MedidasPorFotos: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adicionar_medicoes)
        val Add_button = findViewById<View>(R.id.addmedidas) as Button
        Add_button.setOnClickListener { Add_Line() }

        MedidasPorFotos = findViewById(R.id.MedidasPorFotos)
        MedidasPorFotos!!.setOnClickListener {
            val intent = Intent(this@Adicionar_Medicoes, Medidas_Por_Fotos::class.java)
            startActivity(intent)
            finish()
        }

    }

    fun Add_Line() {
        val ll = findViewById<View>(R.id.lineardoedit) as LinearLayout
        // add edittext
        val et = EditText(this)
        val p = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        et.layoutParams = p
        et.findViewById<EditText>(R.id.medida)
        var numberOfLines = 0
        et.id = numberOfLines + 1
        ll.addView(et)
        numberOfLines++
    }



}