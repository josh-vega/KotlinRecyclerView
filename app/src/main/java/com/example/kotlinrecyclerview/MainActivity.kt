package com.example.kotlinrecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.rvCarList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvCarList.layoutManager = LinearLayoutManager(this)
        rvCarList.adapter = RecyclerViewAdapter(generateCarList())
    }

    fun generateCarList() : ArrayList<Car>{
        var carList : ArrayList<Car> = ArrayList()
        carList.add(Car("Toyota", "Camry"))
        carList.add(Car("Toyota", "Corrola"))
        carList.add(Car("Toyota", "Avalon"))
        carList.add(Car("Honda", "Accord"))
        carList.add(Car("Honda", "Civic"))
        carList.add(Car("BMW", "528i"))
        carList.add(Car("BMW", "328i"))
        return carList
    }
}
