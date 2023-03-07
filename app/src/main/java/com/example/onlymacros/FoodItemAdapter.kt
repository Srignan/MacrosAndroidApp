package com.example.onlymacros

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FoodItemAdapter(private val foodItems: List<FoodItem>) :
    RecyclerView.Adapter<FoodItemAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView: TextView = view.findViewById(R.id.foodNameTextView)
        val caloriesTextView: TextView = view.findViewById(R.id.caloriesTextView)
        val proteinTextView: TextView = view.findViewById(R.id.proteinTextView)
        val carbsTextView: TextView = view.findViewById(R.id.carbsTextView)
        val fatsTextView: TextView = view.findViewById(R.id.fatsTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fooditems, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val foodItem = foodItems[position]
        holder.nameTextView.text = foodItem.name
        holder.caloriesTextView.text = foodItem.calories.toString()
        holder.proteinTextView.text = foodItem.protein.toString()
        holder.carbsTextView.text = foodItem.carbs.toString()
        holder.fatsTextView.text = foodItem.fats.toString()
    }

    override fun getItemCount() = foodItems.size
}
