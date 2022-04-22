package com.best.a84k

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.best.a84k.Activity.ViewPagerActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        open()
    }

    private fun open() {
        val intent = Intent(this, ViewPagerActivity::class.java)
        startActivity(intent)
    }
}