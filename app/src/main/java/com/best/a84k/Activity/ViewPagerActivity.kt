package com.best.a84k.Activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.best.a84k.Adapter.ViewPagerAdapter
import com.best.a84k.Fragments.Pager1
import com.best.a84k.Fragments.Pager2
import com.best.a84k.R
import com.google.android.material.tabs.TabLayout

class ViewPagerActivity : AppCompatActivity() {

    private  var viewPagerAdapter: ViewPagerAdapter?=null
    private  var viewPager: ViewPager?=null
    private  var tableLayout: TabLayout?=null
    private var TAG = ViewPagerActivity::class.java.toString()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)
        initviews()
    }

    private fun initviews() {
        viewPager = findViewById(R.id.viewpagerID)
        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        viewPagerAdapter?.addLists(Pager1(), "Asosiy yangiliklar")
        viewPagerAdapter?.addLists(Pager2(), "So'ngi yangiliklar")
        viewPager?.adapter = viewPagerAdapter
        tableLayout = findViewById(R.id.tableID)
        tableLayout?.setupWithViewPager(viewPager)

    }
}