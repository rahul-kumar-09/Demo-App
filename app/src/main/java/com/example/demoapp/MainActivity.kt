package com.example.demoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.demoapp.databinding.ActivityMainBinding
import com.example.demoapp.fragment.FoodFragment
import com.example.demoapp.fragment.HomeFragment
import com.example.demoapp.fragment.SettingFragment
import com.example.demoapp.fragment.StoreFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(HomeFragment())

        binding.bottomNavigation.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> replaceFragment(HomeFragment())

                R.id.store -> replaceFragment(StoreFragment())

                R.id.setting -> replaceFragment(SettingFragment())

                R.id.food -> replaceFragment(FoodFragment())
            }
            return@setOnItemSelectedListener true
        }


    }

    private fun replaceFragment(fragment: Fragment){
        val fm = supportFragmentManager
        val ft = fm.beginTransaction()
        ft.replace(R.id.frameLayout, fragment)
        ft.commit()
    }
}