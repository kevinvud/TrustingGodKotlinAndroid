package com.example.pogo.trustinggod

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.pogo.trustinggod.Fragments.MoreFragment
import com.example.pogo.trustinggod.Fragments.ReadingsFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.appbar_main.*


class MainActivity : AppCompatActivity() {

    var pagerAdapter: PageAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar_main)

        pagerAdapter = PageAdapter(supportFragmentManager)
        pagerAdapter?.addFragments(ReadingsFragment(),"Readings")
        pagerAdapter?.addFragments(MoreFragment(),"More")

        costomViewPager.adapter = pagerAdapter
        costomTabLayout.setupWithViewPager(costomViewPager)




    }
}
