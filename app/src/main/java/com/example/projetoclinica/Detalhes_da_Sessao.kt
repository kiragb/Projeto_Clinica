package com.example.projetoclinica

import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.example.projetoclinica.ui.main.SectionsPagerAdapter2
import com.example.projetoclinica.databinding.ActivityDetalhesDaSessaoBinding
import kotlinx.android.synthetic.main.activity_detalhes_da_sessao.*

class Detalhes_da_Sessao : AppCompatActivity() {

    private lateinit var binding: ActivityDetalhesDaSessaoBinding
    var imageView: ImageView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetalhesDaSessaoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sectionsPagerAdapter2 = SectionsPagerAdapter2(this, supportFragmentManager)
        val viewPager2: ViewPager = binding.viewPager2
        viewPager2.adapter = sectionsPagerAdapter2
        val tabs: TabLayout = binding.tabs2
        tabs.setupWithViewPager(viewPager2)
        val fab: FloatingActionButton = binding.fab

        imageView = findViewById(R.id.imageView)
        imageView!!.setOnClickListener {
            val intent = Intent(this@Detalhes_da_Sessao, Sessao::class.java)
            startActivity(intent)
            finish()
        }

    }
}