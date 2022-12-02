package com.example.korrtspel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class HiLoCardGame : AppCompatActivity() {

    private var lives = 10
    private var score = 0
    private var round = 1
    private val deck = CardDeck()
    private lateinit var showScore: TextView
    private lateinit var showlives: TextView
    private lateinit var showRound: TextView

    private lateinit var viewCard : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hi_lo_card_game)

        Log.d("!!!", "startGame() works")

        viewCard = findViewById(R.id.cardDeck)
        viewCard.setImageResource(deck.deck[0].theme)
        showScore = findViewById(R.id.score)
        showScore.text = "Score: $score"
        showlives = findViewById(R.id.lives)
        showlives.text = "Lives: $lives"
        showRound = findViewById(R.id.round)

        val higher = findViewById<Button>(R.id.Higher)
        higher.text = "Higher"
        val lower = findViewById<Button>(R.id.Lower)
        lower.text = "Lower"

        higher.setOnClickListener{
            win()
            deck.draw()
            viewCard.setImageResource(deck.currentCard.theme)

            if(deck.currentCard.value > deck.nextCard.value ){
                score++
                showScore.text = "Score: $score"
            }else{
                isntThatCuteButItsWrong()
            }
        }

        lower.setOnClickListener{
            win()
            deck.draw()
            viewCard.setImageResource(deck.currentCard.theme)

            if(deck.currentCard.value < deck.nextCard.value ){
                score++
                showScore.text = "Score: $score"
            }else{
                isntThatCuteButItsWrong()
            }
        }
    }

    private fun win(){
        if(deck.deck.size.equals(1)){
            val toast = Toast.makeText(this,"Woohoo, you won and can play another round and got 3 extra lives",
            Toast.LENGTH_SHORT)
            toast.show()
            lives+=2
            round++
            showRound.text = "Round $round"
            deck.nextRound()
        }
    }
    private fun isntThatCuteButItsWrong(){
        lives--
        showlives.text = "$lives left"
        viewCard.setImageResource(deck.currentCard.theme)

        if(lives == 0){
            val toast = Toast.makeText(this, "Too bad, you lost, but you can start over en try again, let me help you.",
                Toast.LENGTH_SHORT
                )
            toast.show()
            lose()
        }
    }

     private fun lose(){
         val intent = Intent(this, MainActivity::class.java )
         startActivity(intent)
    }
}