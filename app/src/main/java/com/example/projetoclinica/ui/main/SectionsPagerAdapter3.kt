package com.example.projetoclinica.ui.main

import android.content.Context
import androidx.fragment.app.FragmentPagerAdapter
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.projetoclinica.*

class SectionsPagerAdapter3(private val mContext: Context, fm: FragmentManager?) :
    FragmentPagerAdapter(
        fm!!
    ) {
    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = Equipamento()
            1 -> fragment = Cliente()
        }
        return fragment!!
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mContext.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        return 2
    }


    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf( R.string.tab_text_5, R.string.tab_text_6)
    }
}