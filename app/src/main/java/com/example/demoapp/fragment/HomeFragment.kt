package com.example.demoapp.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demoapp.R
import com.example.demoapp.adapter.HorizontalAdapter
import com.example.demoapp.adapter.VerticalAdapter
import com.example.demoapp.model.HorizontalData
import com.example.demoapp.model.verticalData

class HomeFragment : Fragment() {
    private lateinit var myAdapter: HorizontalAdapter
    private lateinit var verticalAdapter: VerticalAdapter
    private lateinit var layoutManager: RecyclerView.LayoutManager



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val horizontalRecyclerView: RecyclerView = view.findViewById(R.id.horizontalRecyclerView)
        val verticalRecyclerView: RecyclerView = view.findViewById(R.id.verticalRecyclerView)

        val arr = ArrayList<HorizontalData>()
        arr.add(HorizontalData("Burger", R.drawable.burger))
        arr.add(HorizontalData("Donut", R.drawable.donut))
        arr.add(HorizontalData("French-fries", R.drawable.frenchfries))
        arr.add(HorizontalData("Romen", R.drawable.ramen))
        arr.add(HorizontalData("Salad", R.drawable.salad))
        arr.add(HorizontalData("Fast-food", R.drawable.fastfood))
        arr.add(HorizontalData("Vegetable", R.drawable.vegetable))
        arr.add(HorizontalData("Chicken", R.drawable.roastedchicken))
        myAdapter = HorizontalAdapter(activity as Context, arr)
        horizontalRecyclerView.layoutManager =
            LinearLayoutManager(activity as Context, LinearLayoutManager.HORIZONTAL, false)
        horizontalRecyclerView.adapter = myAdapter


        //vertical item list
        val arrVer = ArrayList<verticalData>()
        arrVer.add(
            verticalData(
                R.drawable.food,
                "Domingo Pizza",
                "Pizza",
                "4.5/5",
                "10 $",
                "20 in"
            )
        )
        arrVer.add(
            verticalData(
                R.drawable.food,
                "Domingo Pizza",
                "Pizza",
                "4.5/5",
                "10 $",
                "20 in"
            )
        )
        arrVer.add(
            verticalData(
                R.drawable.food,
                "Domingo Pizza",
                "Pizza",
                "4.5/5",
                "10 $",
                "20 in"
            )
        )
        arrVer.add(
            verticalData(
                R.drawable.food,
                "Domingo Pizza",
                "Pizza",
                "4.5/5",
                "10 $",
                "20 in"
            )
        )
        arrVer.add(
            verticalData(
                R.drawable.food,
                "Domingo Pizza",
                "Pizza",
                "4.5/5",
                "10 $",
                "20 in"
            )
        )
        arrVer.add(
            verticalData(
                R.drawable.food,
                "Domingo Pizza",
                "Pizza",
                "4.5/5",
                "10 $",
                "20 in"
            )
        )
        arrVer.add(
            verticalData(
                R.drawable.food,
                "Domingo Pizza",
                "Pizza",
                "4.5/5",
                "10 $",
                "20 in"
            )
        )
        arrVer.add(
            verticalData(
                R.drawable.food,
                "Domingo Pizza",
                "Pizza",
                "4.5/5",
                "10 $",
                "20 in"
            )
        )
        arrVer.add(
            verticalData(
                R.drawable.food,
                "Domingo Pizza",
                "Pizza",
                "4.5/5",
                "10 $",
                "20 in"
            )
        )
        arrVer.add(
            verticalData(
                R.drawable.food,
                "Domingo Pizza",
                "Pizza",
                "4.5/5",
                "10 $",
                "20 in"
            )
        )
        arrVer.add(
            verticalData(
                R.drawable.food,
                "Domingo Pizza",
                "Pizza",
                "4.5/5",
                "10 $",
                "20 in"
            )
        )

        verticalAdapter = VerticalAdapter(activity as Context, arrVer)
        verticalRecyclerView.layoutManager = LinearLayoutManager(activity as Context)
        verticalRecyclerView.adapter = verticalAdapter


        return view
    }

}