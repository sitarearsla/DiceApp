package com.sitare.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val diceNumber : TextView = findViewById(R.id.numberView)
        val diceImage : ImageView = findViewById(R.id.imageView)
        val button : Button = findViewById(R.id.button)

        button.setOnClickListener {
            val random = rollDice()
            diceNumber.text = random.toString()
            when(random){
                1 -> diceImage.setImageResource(R.drawable.dice_1)
                2 -> diceImage.setImageResource(R.drawable.dice_2)
                3 -> diceImage.setImageResource(R.drawable.dice_3)
                4 -> diceImage.setImageResource(R.drawable.dice_4)
                5 -> diceImage.setImageResource(R.drawable.dice_5)
                else -> diceImage.setImageResource(R.drawable.dice_6)
            }
        }
    }

    fun rollDice() : Int {
        //1 and 6 included
        return (1..6).random()
    }
}