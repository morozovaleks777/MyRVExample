package com.example.myrvexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.constraintlayout.widget.ConstraintSet
import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {

  private  lateinit var layout: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        layout=findViewById(R.id.mylist)
        getList()
myList(getList())
    }

fun getList():List<MyList>{
    val   list: MutableList<MyList> = mutableListOf()
    for (i in 0..15) {
        list.add(MyList("name${i+1}","count${i+1}"))}
    return list
}

    private fun myList(list:List<MyList>){

        for (i in list) {

            val view = LayoutInflater.from(this).inflate(R.layout.item, layout, false)
            val nameText = view.findViewById<TextView>(R.id.name)
            val countText =view.findViewById<TextView>(R.id.count)
            val name=i.name
            val count =i.count
            nameText.text =name
            countText.text = count
            layout.addView(view)
          
        }
       }
    }
