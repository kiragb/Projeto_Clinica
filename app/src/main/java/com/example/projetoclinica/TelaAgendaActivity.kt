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
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.projetoclinica.ui.main.SectionsPagerAdapter
import com.example.projetoclinica.databinding.ActivityTelaAgendaBinding
import java.util.*

class TelaAgendaActivity : AppCompatActivity() {

    var NomeUsuario: TextView? = null
    var Saudações: TextView? = null
    var BotãoCard: Button? = null

    private lateinit var binding: ActivityTelaAgendaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




        NomeUsuario = findViewById<View>(R.id.NomeUsuario) as TextView?
        val valor = intent.getStringExtra("Chave")
        NomeUsuario?.text = valor

        setContentView(R.layout.activity_tela_agenda)
        Saudações = findViewById<View>(R.id.Saudações) as TextView
        val calendario = Calendar.getInstance()
        val relogio = calendario[Calendar.HOUR_OF_DAY]
        if (relogio >= 0 && relogio < 12) {
            Saudações!!.text = "Bom dia,"
        } else if (relogio >= 12 && relogio < 18) {
            Saudações!!.text = "Boa Tarde,"
        } else if (relogio >= 18 && relogio < 24) {
            Saudações!!.text = "Boa Noite,"
        }

        binding = ActivityTelaAgendaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = binding.viewPager
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.tabs
        tabs.setupWithViewPager(viewPager)

        BotãoCard = findViewById(R.id.BotãoCard)
        BotãoCard!!.setOnClickListener {
            val intent = Intent(this@TelaAgendaActivity, Sessao::class.java)
            startActivity(intent)
            finish()
        }



    }
}