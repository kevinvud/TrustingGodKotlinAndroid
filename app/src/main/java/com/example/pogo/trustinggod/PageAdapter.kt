package com.example.pogo.trustinggod

import android.app.FragmentManager
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by pogo on 11/27/17.
 */
class PageAdapter(fm: android.support.v4.app.FragmentManager) : FragmentPagerAdapter(fm) {

    var mFm = fm
    var mFragmentItems: ArrayList<Fragment> = ArrayList()
    var mFragmentTitles: ArrayList<String> = ArrayList()


    fun addFragments(fragmentItem: Fragment, fragmentTitle : String) {
        mFragmentItems.add(fragmentItem)
        mFragmentTitles.add(fragmentTitle)

    }



    override fun getCount(): Int {
        return mFragmentItems.size
    }

    override fun getItem(position: Int): Fragment {
        return mFragmentItems[position]
    }

    override fun getPageTitle(position: Int): CharSequence {
        return mFragmentTitles[position]
    }

}