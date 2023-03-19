package com.example.gitbranches

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    val a = 2
    var second = 3456
    val b = 4
    var res = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ahk = 9605
        setContentView(R.layout.activity_main)
        res = a + b
    }
}