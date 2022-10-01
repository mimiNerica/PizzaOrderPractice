package com.miminerica.pizzaorderpractice.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.miminerica.pizzaorderpractice.fragments.ChickenStoreFragment
import com.miminerica.pizzaorderpractice.fragments.PizzaStoreFragment

class MyViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> PizzaStoreFragment()
            else -> ChickenStoreFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "피자 가게"
            else -> "치킨 가게"
        }
    }
}