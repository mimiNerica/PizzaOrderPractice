package com.miminerica.pizzaorderpractice

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.miminerica.pizzaorderpractice.datas.Store
import kotlinx.android.synthetic.main.activity_view_store.*

class ViewStoreActivity : BaseActivity() {

    lateinit var selectRoom : Store

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        storeTelBtn.setOnClickListener {

            val myUri = Uri.parse("tel:${selectRoom.phoneNum}")
            val myIntent = Intent(Intent.ACTION_DIAL, myUri)
            startActivity(myIntent)
        }
    }

    override fun setValues() {
        selectRoom = intent.getSerializableExtra("store") as Store
        Glide.with(mContext).load(selectRoom.logoUrl).into(storeImg)
        storeNameTxt.text = selectRoom.name
        storeTelTxt.text = selectRoom.phoneNum

    }


}