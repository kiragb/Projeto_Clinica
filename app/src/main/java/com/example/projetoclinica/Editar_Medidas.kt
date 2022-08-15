package com.example.projetoclinica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_editar_medidas.*
import kotlinx.android.synthetic.main.activity_resultados.*

class Editar_Medidas : AppCompatActivity(), View.OnClickListener {

    var editarquadriceps: EditText? = null
    var editarpeitoral: EditText? = null
    var editarcintura: EditText? = null
    var editarbiceps: EditText? = null
    var editarpanturrilha: EditText? = null
    var Salvar: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editar_medidas)

       editarpeitoral = findViewById(R.id.editarpeitoral)
        editarquadriceps= findViewById(R.id.editarquadriceps)
        editarcintura= findViewById(R.id.editarcintura)
        editarbiceps= findViewById(R.id.editarbiceps)
        editarpanturrilha= findViewById(R.id.editarpanturrilha)

        Salvar = findViewById(R.id.Salvar)
        Salvar!!.setOnClickListener {
            val intent = Intent(this@Editar_Medidas, Resultados2::class.java)
            intent.putExtra("Peitoral", editarpeitoral!!.text.toString())
            intent.putExtra("Quadriceps", editarquadriceps!!.text.toString())
            intent.putExtra("Cintura", editarcintura!!.text.toString())
            intent.putExtra("Biceps", editarbiceps!!.text.toString())
            intent.putExtra("Panturrilha", editarpanturrilha!!.text.toString())
            startActivity(intent)
            finish()
        }


    }
    override fun onClick(v: View?)
    {
        val name = editarpeitoral!!.text
        editarpeitoral!!.text = name
    }
}