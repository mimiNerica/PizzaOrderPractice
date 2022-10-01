package com.miminerica.pizzaorderpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.miminerica.pizzaorderpractice.adapters.MyViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        val viewPageAdapter = MyViewPagerAdapter(supportFragmentManager)
        myViewPager.adapter = viewPageAdapter
        myTabLayout.setupWithViewPager(myViewPager)

    }

}