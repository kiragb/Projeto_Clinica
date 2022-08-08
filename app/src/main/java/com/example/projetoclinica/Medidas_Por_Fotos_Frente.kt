package com.example.projetoclinica

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import android.widget.ImageView


class Medidas_Por_Fotos_Frente : AppCompatActivity() {

    var imagefrente: ImageView? = null
    var costas: Button? = null
    var direita: Button? = null
    var imageViewFotoCostas: ImageView? = null
    var imageViewFotoDireita: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medidas_por_fotos_frente)


        costas = findViewById<View>(R.id.costas) as Button
        imageViewFotoCostas = findViewById<View>(R.id.imagecostas) as ImageView

        imageViewFotoDireita = findViewById<View>(R.id.imagedireita) as ImageView

        costas!!.setOnClickListener {
            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(cameraIntent, CAMERA_REQUEST)
        }


        imagefrente = findViewById<View>(R.id.imagefrente) as ImageView
        val extras = intent.extras
        if (extras != null) {
            val image = extras["imagefrente"] as Bitmap?
            if (image != null) {
                imagefrente!!.setImageBitmap(image)
            }
        }

        imagefrente = findViewById<View>(R.id.imageesquerda) as ImageView
        val extras2 = intent.extras
        if (extras2 != null) {
            val image = extras2["imagefrente"] as Bitmap?
            if (image != null) {
                imagefrente!!.setImageBitmap(image)
            }
        }

    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == CAMERA_REQUEST && resultCode == RESULT_OK) {
            val imageBitmap = data!!.extras!!.get("data") as Bitmap
            imageViewFotoCostas!!.setImageBitmap(imageBitmap)

        }
        if (requestCode == CAMERA_REQUEST && resultCode == RESULT_OK) {
            val imageBitmap = data!!.extras!!.get("data") as Bitmap
            imageViewFotoDireita!!.setImageBitmap(imageBitmap)

        }

    }

    companion object {
        private const val CAMERA_REQUEST = 100
        private const val STORAGE_PERMISSION_CODE = 1
    }
}