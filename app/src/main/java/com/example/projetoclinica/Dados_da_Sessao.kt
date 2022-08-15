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
import android.widget.Button
import com.example.projetoclinica.ui.main.SectionsPagerAdapter
import com.example.projetoclinica.databinding.ActivityDadosDaSessaoBinding
import com.example.projetoclinica.ui.main.SectionsPagerAdapter2
import com.example.projetoclinica.ui.main.SectionsPagerAdapter3
import kotlinx.android.synthetic.main.activity_adicionar_medicoes_2.*

class Dados_da_Sessao : AppCompatActivity() {



    private lateinit var binding: ActivityDadosDaSessaoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDadosDaSessaoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sectionsPagerAdapter3 = SectionsPagerAdapter3(this, supportFragmentManager)
        val viewPager3: ViewPager = binding.viewPager3
        viewPager3.adapter = sectionsPagerAdapter3
        val tabs: TabLayout = binding.tabs3
        tabs.setupWithViewPager(viewPager3)

    }
}