package com.example.mapsfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val mainFragment = mainFragment()
        val fm: FragmentManager = supportFragmentManager
        fm.beginTransaction().add(R.id.main_activity,mainFragment).commit()
    }
}