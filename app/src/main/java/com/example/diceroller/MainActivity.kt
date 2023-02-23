package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.diceroller.databinding.ActivityMainBinding
import java.util.*


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val rollButton: Button = binding.rollButton

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val resultText: ImageView = binding.diceImage

        when(Random().nextInt(6) + 1) {
            1 -> resultText.setImageResource(R.drawable.dice_1)
            2 -> resultText.setImageResource(R.drawable.dice_2)
            3 -> resultText.setImageResource(R.drawable.dice_3)
            4 -> resultText.setImageResource(R.drawable.dice_4)
            5 -> resultText.setImageResource(R.drawable.dice_5)
            6 -> resultText.setImageResource(R.drawable.dice_6)
        }
    }
}