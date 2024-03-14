package com.example.demoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.demoapp.adapter.HorizontalAdapter
import com.example.demoapp.adapter.VerticalAdapter
import com.example.demoapp.databinding.ActivityMainBinding
import com.example.demoapp.model.HorizontalData
import com.example.demoapp.model.verticalData

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myAdapter: HorizontalAdapter
    private lateinit var verticalAdapter: VerticalAdapter
    private lateinit var layoutManager: RecyclerView.LayoutManager




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // horizontal item list
        val arr = ArrayList<HorizontalData>()
        arr.add(HorizontalData("Burger", R.drawable.burger))
        arr.add(HorizontalData("Donut", R.drawable.donut))
        arr.add(HorizontalData("French-fries", R.drawable.frenchfries))
        arr.add(HorizontalData("Romen", R.drawable.ramen))
        arr.add(HorizontalData("Salad", R.drawable.salad))
        arr.add(HorizontalData("Fast-food", R.drawable.fastfood))
        arr.add(HorizontalData("Vegetable", R.drawable.vegetable))
        arr.add(HorizontalData("Chicken", R.drawable.roastedchicken))
        myAdapter = HorizontalAdapter(this, arr)
        binding.horizontalRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.horizontalRecyclerView.adapter = myAdapter


        //vertical item list
        val arrVer = ArrayList<verticalData>()
        arrVer.add(verticalData(R.drawable.food, "Domingo Pizza", "Pizza", "4.5/5", "10 $", "20 in"))
        arrVer.add(verticalData(R.drawable.food, "Domingo Pizza", "Pizza", "4.5/5", "10 $", "20 in"))
        arrVer.add(verticalData(R.drawable.food, "Domingo Pizza", "Pizza", "4.5/5", "10 $", "20 in"))
        arrVer.add(verticalData(R.drawable.food, "Domingo Pizza", "Pizza", "4.5/5", "10 $", "20 in"))
        arrVer.add(verticalData(R.drawable.food, "Domingo Pizza", "Pizza", "4.5/5", "10 $", "20 in"))
        arrVer.add(verticalData(R.drawable.food, "Domingo Pizza", "Pizza", "4.5/5", "10 $", "20 in"))
        arrVer.add(verticalData(R.drawable.food, "Domingo Pizza", "Pizza", "4.5/5", "10 $", "20 in"))
        arrVer.add(verticalData(R.drawable.food, "Domingo Pizza", "Pizza", "4.5/5", "10 $", "20 in"))
        arrVer.add(verticalData(R.drawable.food, "Domingo Pizza", "Pizza", "4.5/5", "10 $", "20 in"))
        arrVer.add(verticalData(R.drawable.food, "Domingo Pizza", "Pizza", "4.5/5", "10 $", "20 in"))
        arrVer.add(verticalData(R.drawable.food, "Domingo Pizza", "Pizza", "4.5/5", "10 $", "20 in"))

        verticalAdapter = VerticalAdapter(this, arrVer)
        binding.verticalRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.verticalRecyclerView.adapter = verticalAdapter

    }
}