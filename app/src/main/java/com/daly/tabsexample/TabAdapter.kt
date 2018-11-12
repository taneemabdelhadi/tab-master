package com.daly.tabsexample

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class TabAdapter(fm: FragmentManager?, var fragments: ArrayList<Fragment>) : FragmentPagerAdapter(fm) {

    override fun getItem(p0: Int): Fragment {
        return fragments[p0]

    }

    override fun getCount(): Int {
        return fragments.size

    }

    override fun getPageTitle(position: Int): CharSequence? {

        return when (position) {
            0 ->
                "مشروبات"
            1 ->
                "معلبات"
            2 ->
                "صلصات "
            3 ->
                "عسل ومربى"
            4->
                " زيوت وسمنة"
            else ->
                "Three Tab"

        }
    }
}