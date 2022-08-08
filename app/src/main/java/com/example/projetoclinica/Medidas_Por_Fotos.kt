package com.example.projetoclinica

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat

class Medidas_Por_Fotos : AppCompatActivity() {
    var frente: Button? = null
    var costas: Button? = null
    var esquerda: Button? = null
    var direita: Button? = null
    var imageViewFotoFrente: ImageView? = null
    var imageViewFotoCostas: ImageView? = null
    var imageViewFotoDireita: ImageView? = null
    var imageViewFotoEsquerda: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medidas_por_fotos)
        frente = findViewById<View>(R.id.frente) as Button
        frente!!.setOnClickListener {
            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(cameraIntent, CAMERA_REQUEST)
        }

        costas = findViewById<View>(R.id.costas) as Button
        costas!!.setOnClickListener {
            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(cameraIntent, CAMERA_REQUEST)
        }

        direita = findViewById<View>(R.id.direita) as Button
        direita!!.setOnClickListener {
            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(cameraIntent, CAMERA_REQUEST)
        }

        esquerda = findViewById<View>(R.id.esquerda) as Button
        esquerda!!.setOnClickListener {
            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(cameraIntent, CAMERA_REQUEST)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == CAMERA_REQUEST && resultCode == RESULT_OK) {
            val thumbnail = data!!.extras!!["data"] as Bitmap?
            val intent = Intent(this@Medidas_Por_Fotos, Medidas_Por_Fotos_Frente::class.java )
            intent.putExtra("imagefrente", thumbnail)
            startActivity(intent)
        }

    }

    companion object {
        private const val CAMERA_REQUEST = 100
        private const val STORAGE_PERMISSION_CODE = 1
    }
}