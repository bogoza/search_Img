package com.example.searchimg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.searchimg.adapter.AnimalAdapter
import com.example.searchimg.databinding.ActivityMainBinding
import com.example.searchimg.model.Animal

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var animalAdapter:AnimalAdapter

    private val allAnimals = listOf(
        Animal("Lion", "https://upload.wikimedia.org/wikipedia/commons/7/73/Lion_waiting_in_Namibia.jpg"),
        Animal("Elephant", "https://upload.wikimedia.org/wikipedia/commons/3/37/African_Bush_Elephant.jpg"),
        Animal("Monkey", "https://upload.wikimedia.org/wikipedia/commons/4/43/Bonnet_macaque_%28Macaca_radiata%29_Photograph_By_Shantanu_Kuveskar.jpg"),
        Animal("Racoon", "https://upload.wikimedia.org/wikipedia/commons/3/3e/Raccoon_in_Central_Park_%2835264%29.jpg"),
        Animal("Deer", "https://upload.wikimedia.org/wikipedia/commons/thumb/6/62/Chital_%288458215435%29.jpg/1920px-Chital_%288458215435%29.jpg"),
        Animal("Wild Dog", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/ba/African_wild_dog_%28Lycaon_pictus_pictus%29.jpg/1920px-African_wild_dog_%28Lycaon_pictus_pictus%29.jpg"),
        Animal("Cat", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c8/European_Wildcat_Nationalpark_Bayerischer_Wald_03.jpg/1920px-European_Wildcat_Nationalpark_Bayerischer_Wald_03.jpg"),
        Animal("Bear", "https://upload.wikimedia.org/wikipedia/commons/9/9e/Ours_brun_parcanimalierpyrenees_1.jpg"),
        Animal("Moose","https://upload.wikimedia.org/wikipedia/commons/thumb/e/e0/Alaska_moose.jpg/1920px-Alaska_moose.jpg"),
        Animal("Wolf","https://upload.wikimedia.org/wikipedia/commons/thumb/6/68/Eurasian_wolf_2.jpg/1280px-Eurasian_wolf_2.jpg")

    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        animalAdapter = AnimalAdapter(allAnimals)
        recycler()

    }
    private fun recycler(){
        recyclerView = binding.rvImages
        recyclerView.layoutManager = GridLayoutManager(this,2)
        recyclerView.adapter = animalAdapter
    }
}