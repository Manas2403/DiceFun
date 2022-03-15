package com.example.diceroller
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll)
        rollButton.text = "Let's Roll"
        rollButton.setOnClickListener {
            //   Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show()
            rollDice()

        }
    }

    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.num)
        val randomInt = Random.nextInt(6) + 1
        resultText.text = randomInt.toString()
        if(randomInt==6){
            Toast.makeText(this,"Congrats! You are a sixer 😂😂",Toast.LENGTH_LONG).show()
        }
        val setImg:ImageView=findViewById(R.id.changeImg)
        val drawableResource=when(randomInt){
            1 ->R.drawable.dice_1
            2 -> R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        setImg.setImageResource(drawableResource)
    }
}