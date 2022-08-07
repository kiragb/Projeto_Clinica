package com.example.projetoclinica

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat

class Medidas_Por_Fotos : AppCompatActivity() {
    var imageViewFotoFrente: ImageView? = null
    var imageViewFotoCostas: ImageView? = null
    var imageViewFotoDireita: ImageView? = null
    var imageViewFotoEsquerda: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medidas_por_fotos)
        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.CAMERA
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CAMERA), 0)
        }

        imageViewFotoFrente = findViewById<View>(R.id.imagefrente) as ImageView
        findViewById<View>(R.id.frente).setOnClickListener { dispatchTakePictureIntent() }

        imageViewFotoCostas = findViewById<View>(R.id.imagecostas) as ImageView
        findViewById<View>(R.id.costas).setOnClickListener { dispatchTakePictureIntent() }

        imageViewFotoDireita = findViewById<View>(R.id.imagedireita) as ImageView
        findViewById<View>(R.id.direita).setOnClickListener { dispatchTakePictureIntent() }

        imageViewFotoEsquerda = findViewById<View>(R.id.imageesquerda) as ImageView
        findViewById<View>(R.id.esquerda).setOnClickListener { dispatchTakePictureIntent() }
    }

    fun tirarFotoFrente() {
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivityForResult(intent, 1)
    }

    fun tirarFotoCostas() {
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivityForResult(intent, 1)
    }

    fun tirarFotoDireita() {
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivityForResult(intent, 1)
    }

    fun tirarFotoEsquerda() {
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivityForResult(intent, 1)
    }


    val REQUEST_IMAGE_CAPTURE = 1

    private fun dispatchTakePictureIntent() {
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { takePictureIntent ->
            takePictureIntent.resolveActivity(packageManager)?.also {
                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            val imageBitmap = data!!.extras!!.get("data") as Bitmap
            imageViewFotoFrente!!.setImageBitmap(imageBitmap)
        }

        }
}