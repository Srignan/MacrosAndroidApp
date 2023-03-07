package com.example.onlymacros

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var foodNameEditText: EditText
    private lateinit var caloriesEditText: EditText
    private lateinit var proteinEditText: EditText
    private lateinit var carbsEditText: EditText
    private lateinit var fatsEditText: EditText
    private lateinit var addFoodItemButton: Button
    private lateinit var dailyLogRecyclerView: RecyclerView

    private val foodItems = mutableListOf<FoodItem>()
    private lateinit var adapter: FoodItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fooditems)

        // Initialize views
        foodNameEditText = findViewById(R.id.foodNameTextView)
        caloriesEditText = findViewById(R.id.caloriesTextView)
        proteinEditText = findViewById(R.id.proteinTextView)
        carbsEditText = findViewById(R.id.carbsTextView)
        fatsEditText = findViewById(R.id.fatsTextView)
        addFoodItemButton = findViewById(R.id.addFoodItemButton)
        dailyLogRecyclerView = findViewById(R.id.foodItemView)

        // Initialize RecyclerView adapter and layout manager
        adapter = FoodItemAdapter(foodItems)
        dailyLogRecyclerView.adapter = adapter
        dailyLogRecyclerView.layoutManager = LinearLayoutManager(this)

        // Set click listener for addFoodItemButton
        addFoodItemButton.setOnClickListener {
            addFoodItem()
        }
    }

    private fun addFoodItem() {
        // Get values from EditText views
        val name = foodNameEditText.text.toString()
        val calories = caloriesEditText.text.toString().toInt()
        val protein = proteinEditText.text.toString().toInt()
        val carbs = carbsEditText.text.toString().toInt()
        val fats = fatsEditText.text.toString().toInt()
    }
}