package com.example.hw_5_5_abai_suuuui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


val <ActivityMainBinding> ActivityMainBinding.root: Any
    get() {
        TODO("Not yet implemented")
    }

class MainActivity<ActivityMainBinding> : AppCompatActivity() {
    private var binding: ActivityMainBinding = TODO()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().replace(R.id.container, AbaiFragment()).commit()
    }

    private fun setContentView(root: Any) {
        TODO("Not yet implemented")
    }
}