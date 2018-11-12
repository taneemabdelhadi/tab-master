package com.daly.tabsexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.daly.tabsexample.fragments.ThreeFragment
import com.daly.tabsexample.fragments.TwoFragment
import android.support.v4.app.Fragment
import com.daly.tabsexample.fragments.FirstFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fragment = ArrayList<Fragment>()
        fragment.add(ItemsFragment().newInstance(1))
        fragment.add(ItemsFragment().newInstance(2))
        fragment.add(ItemsFragment().newInstance(3))
        fragment.add(ItemsFragment().newInstance(4))
        fragment.add(ItemsFragment().newInstance(5))


        var fragmentPagerAdapter = TabAdapter(supportFragmentManager, fragment)
        mViewPager.adapter = fragmentPagerAdapter

        mTabLayout.setupWithViewPager(mViewPager)


    }
}
