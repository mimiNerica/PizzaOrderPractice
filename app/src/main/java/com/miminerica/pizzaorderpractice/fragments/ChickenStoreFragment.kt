package com.miminerica.pizzaorderpractice.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.miminerica.pizzaorderpractice.R
import com.miminerica.pizzaorderpractice.ViewStoreActivity
import com.miminerica.pizzaorderpractice.adapters.MyListViewAdapter
import com.miminerica.pizzaorderpractice.datas.Store
import kotlinx.android.synthetic.main.fragment_chicken_store.*
import kotlinx.android.synthetic.main.fragment_pizza_store.*

class ChickenStoreFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_chicken_store, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val chickenStoreList = ArrayList<Store>()

        chickenStoreList.add(Store("굽네치킨", "1577-1991","https://www.goobne.co.kr/resources/assets/images/common/logo.svg"))
        chickenStoreList.add(Store("BBQ치킨", "1588-9282","https://www.bbq.co.kr/images/common/logo_header_bbq.png"))
        chickenStoreList.add(Store("노랑통닭", "1599-2527","http://www.norangtongdak.co.kr/renew/image/main/logo.png"))
        chickenStoreList.add(Store("BHC", "1577-5577","https://www.bhc.co.kr/images/common/logo.png"))
        chickenStoreList.add(Store("60계치킨", "1234-5678","http://www.60chicken.com/img/logo.png"))
        chickenStoreList.add(Store("호식이두마리 치킨", "1688-9922","https://cdn.imweb.me/thumbnail/20220127/168ed76505625.jpg"))

        val myChickenStoreAdapter = MyListViewAdapter(requireContext(), R.layout.listview_pizza_store, chickenStoreList)
        myChickenListView.adapter = myChickenStoreAdapter

        myChickenListView.setOnItemClickListener { parent, view, position, id ->
            val selectStore = chickenStoreList[position]
            val myIntent = Intent(requireContext(), ViewStoreActivity::class.java)
            myIntent.putExtra("store", selectStore)
            startActivity(myIntent)
        }
    }
}