package com.miminerica.pizzaorderpractice.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.miminerica.pizzaorderpractice.R
import com.miminerica.pizzaorderpractice.datas.Store


class MyListViewAdapter(val mContext: Context, val resId : Int, val mList: List<Store>) : ArrayAdapter<Store>(mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getCount(): Int {
        return mList.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(resId, null)
        }

        val row = tempRow!!
        val logo = row.findViewById<ImageView>(R.id.logoImg)
        val name = row.findViewById<TextView>(R.id.nameTxt)
        name.text = mList[position].name

        Glide.with(mContext).load(mList[position].logoUrl).into(logo)


        return row
    }
}
