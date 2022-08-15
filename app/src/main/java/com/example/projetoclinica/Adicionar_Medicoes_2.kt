package com.example.projetoclinica

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class Adicionar_Medicoes_2 : AppCompatActivity() {

    var MedidasPorFotos: Button? = null
    var pularmedidas: TextView? = null
    var imageView: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adicionar_medicoes_2)
        val Add_button = findViewById<View>(R.id.addmedidas) as Button
        Add_button.setOnClickListener { Add_Line()

        }

        MedidasPorFotos = findViewById(R.id.MedidasPorFotos)
        MedidasPorFotos!!.setOnClickListener {
            val intent = Intent(this@Adicionar_Medicoes_2, Medidas_Por_Fotos_2::class.java)
            startActivity(intent)
            finish()
        }
        pularmedidas = findViewById(R.id.pularmedidas)
        pularmedidas!!.setOnClickListener {
            val intent = Intent(this@Adicionar_Medicoes_2, Mais_Fotos_1_Pos::class.java)
            startActivity(intent)
            finish()
        }
        imageView = findViewById(R.id.imageView)
        imageView!!.setOnClickListener {
            val intent = Intent(this@Adicionar_Medicoes_2, Detalhes_da_Sessao::class.java)
            startActivity(intent)
            finish()
        }

    }

    @SuppressLint("ResourceType")
    fun Add_Line() {
        val ll = findViewById<View>(R.id.lineardoedit) as LinearLayout
        // add edittext
        val local = EditText(this)
        val medida = EditText(this)
        val texto = TextView(this)
        val p = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )

        for (i in 1..2) {
            texto.layoutParams = p
            texto.text = "Medida $i"
        }

        ll.addView(texto)

        local.layoutParams = p
        local.setBackgroundResource(R.drawable.rotulo)
        local.setPadding(0, 0, 0, 0  )
        local.height = 62
        local.hint = "         Local da medição"
        ll.addView(local)



        medida.layoutParams = p
        medida.setBackgroundResource(R.drawable.rotulo)
        medida.height = 62
        medida.hint = "         Medidas em cm"
        ll.addView(medida)


    }



}