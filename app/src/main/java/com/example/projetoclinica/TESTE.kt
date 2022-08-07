package com.example.projetoclinica

import android.Manifest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetoclinica.R
import androidx.core.app.ActivityCompat
import android.content.pm.PackageManager
import android.content.Intent
import android.provider.MediaStore
import android.app.Activity
import android.graphics.Bitmap
import android.view.View
import android.widget.ImageView

class TESTE : AppCompatActivity() {
    var imageViewFoto: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teste)
        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.CAMERA
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CAMERA), 0)
        }
        imageViewFoto = findViewById<View>(R.id.imageView) as ImageView
        findViewById<View>(R.id.button).setOnClickListener { tirarFoto() }
    }

    fun tirarFoto() {
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivityForResult(intent, 1)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == 1 && resultCode == RESULT_OK) {
            val extras = data!!.extras
            val imagem = extras!!["data"] as Bitmap?
            imageViewFoto!!.setImageBitmap(imagem)
        }
        super.onActivityResult(requestCode, resultCode, data)
    }
}