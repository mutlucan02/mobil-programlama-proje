package com.example.iphonesatiss

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.iphonesatiss.Landmark
import com.example.iphonesatiss.LandmarkAdapter
import com.example.iphonesatiss.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var landmarkList : ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        landmarkList = ArrayList<Landmark>()

        val telefon1 = Landmark("Iphone 14 Pro Max", "65.000TL", R.drawable.iphone14promax)
        val telefon2 = Landmark("Iphone 14", "42.000TL", R.drawable.iphone14)
        val telefon3 = Landmark("Iphone 13", "36.000", R.drawable.iphone13)
        val telefon4 = Landmark("Iphone 12", "28.000", R.drawable.iphone12)
        val telefon5 = Landmark("Iphone 11 Pro Max", "26.000", R.drawable.iphone11promax)
        val telefon6 = Landmark("Iphone X", "18.000", R.drawable.iphonex)

        landmarkList.add(telefon1)
        landmarkList.add(telefon2)
        landmarkList.add(telefon3)
        landmarkList.add(telefon4)
        landmarkList.add(telefon5)
        landmarkList.add(telefon6)


        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter
    }
}