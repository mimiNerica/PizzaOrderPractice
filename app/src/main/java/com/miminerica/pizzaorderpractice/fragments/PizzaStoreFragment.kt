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
import kotlinx.android.synthetic.main.fragment_pizza_store.*

class PizzaStoreFragment : Fragment() {

//    val mPizzaStoreList = ArrayList<Store>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pizza_store, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val mPizzaStoreList = ArrayList<Store>()
        mPizzaStoreList.add(Store("A피자가게", "1111-1111", "https://cdn3.iconfinder.com/data/icons/street-food-and-food-trucker-1/64/pizza-fast-food-bake-bread-128.png"))
        mPizzaStoreList.add(Store("B피자가게", "2222-2222", "https://cdn1.iconfinder.com/data/icons/cartoon-snack/128/pizza-128.png"))
        mPizzaStoreList.add(Store("C피자가게", "3333-3333", "https://cdn3.iconfinder.com/data/icons/food-set-3/91/Food_C219-128.png"))
        mPizzaStoreList.add(Store("D피자가게", "4444-4444", "https://cdn0.iconfinder.com/data/icons/fastfood-31/64/pizza-italian-food-fast-fastfood-cheese-piece-128.png"))

        val mPizzaStoreAdapter = MyListViewAdapter(requireContext(), R.layout.listview_pizza_store, mPizzaStoreList)
        myListView.adapter = mPizzaStoreAdapter


        myListView.setOnItemClickListener { parent, view, position, id ->
            val selectStore = mPizzaStoreList[position]
            val myIntent = Intent(requireContext(), ViewStoreActivity ::class.java)
            myIntent.putExtra("store", selectStore)
            startActivity(myIntent)
        }
    }

}