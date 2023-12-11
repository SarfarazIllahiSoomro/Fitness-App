package com.example.fitnessapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

public class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workoutinfo_screen)

        // getting the recyclerview by its id
        //val recyclerview = findViewById<RecyclerView>(R.id.workoutlist)

        // this creates a vertical layout Manager
        //recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
           // val data = ArrayList<workoutsViewModel>()

        // This loop will create 20 Views containing
        // the image with the count of view
            //for (i in 1..11) {
            //data.add(workoutsViewModel(R.drawable.jumping_jacks, "jumping jacks","0:30s"))
            //}

        // This will pass the ArrayList to our Adapter
         // val adapter = CustomAdaptor(data)

        // Setting the Adapter with the recyclerview
         //recyclerview.adapter = adapter

    }
}
