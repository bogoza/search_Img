package com.example.searchimg.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.searchimg.R
import com.example.searchimg.databinding.ItemRvBinding
import com.example.searchimg.model.Animal
import com.squareup.picasso.Picasso


class AnimalAdapter(private var animals: List<Animal>) :
    RecyclerView.Adapter<AnimalAdapter.ViewHolder>() {
    inner class ViewHolder(private val binding: ItemRvBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(animal:Animal){
            Picasso.get()
                .load(animal.imageUrl)
                .placeholder(R.drawable.ic_loading)
                .into(binding.imgItem)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalAdapter.ViewHolder {
        val binding = ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentPosition = animals[position]
        holder.bind(currentPosition)
    }

    override fun getItemCount(): Int = animals.size

    fun filterList(filteredList: List<Animal>) {
        animals = filteredList
        notifyDataSetChanged()
    }

}