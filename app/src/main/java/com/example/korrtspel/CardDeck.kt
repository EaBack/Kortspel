package com.example.korrtspel

class CardDeck {

    var deck = mutableListOf<Card>()
    var discardpile = mutableListOf<Card>()
    lateinit var nextCard: Card
    lateinit var currentCard: Card

    init {
        createCards()

        deck.shuffle()
    }

    fun createCards() {//needed a list wich could be altered/mutated during the game.problem i encountered
        // I used an Array at first, but it looked harder to add and discard cards. So I used an mutable list instead.

       // deck.add(Card(14, "Spades", R.drawable.spadesa))
       // deck.add(Card(13, "Spades", R.drawable.spadesk))
       // deck.add(Card(12, "Spades", R.drawable.spadesq))
        // deck.add(Card(11, "Spades", R.drawable.spadesj))
        // deck.add(Card(10, "Spades", R.drawable.spades10))
        // deck.add(Card(9, "Spades", R.drawable.spades9))
        //  deck.add(Card(8, "Spades", R.drawable.spades8))
        //  deck.add(Card(7, "Spades", R.drawable.spades7))
        //  deck.add(Card(6, "Spades", R.drawable.spades6))
        //  deck.add(Card(5, "Spades", R.drawable.spades5))
        //  deck.add(Card(4, "Spades", R.drawable.spades4))
        //   deck.add(Card(3, "Spades", R.drawable.spades3))
        //   deck.add(Card(2, "Spades", R.drawable.spades2))
        deck.add(Card(14, "Hearts", R.drawable.hearta))
        //  deck.add(Card(13, "Hearts", R.drawable.heartk))
        //  deck.add(Card(12, "Hearts", R.drawable.heartq))
        //   deck.add(Card(11, "Hearts", R.drawable.heartj))
        //   deck.add(Card(10, "Hearts", R.drawable.heart10))
        //   deck.add(Card(9, "Hearts", R.drawable.heart9))
        //   deck.add(Card(8, "Hearts", R.drawable.heart8))
        deck.add(Card(7, "Hearts", R.drawable.heart7))
        deck.add(Card(6, "Hearts", R.drawable.heart6))
        deck.add(Card(5, "Hearts", R.drawable.heart5))
        deck.add(Card(4, "Hearts", R.drawable.heart4))
        deck.add(Card(3, "Hearts", R.drawable.heart3))
        deck.add(Card(2, "Hearts", R.drawable.heart2))
        deck.add(Card(14, "Diamonds", R.drawable.diamonda))
        //   deck.add(Card(13, "Diamonds", R.drawable.diamondk))
        //   deck.add(Card(12, "Diamonds", R.drawable.diamondq))
        //   deck.add(Card(11, "Diamonds", R.drawable.diamondj))
        //   deck.add(Card(10, "Diamonds", R.drawable.diamond10))
        deck.add(Card(9, "Diamonds", R.drawable.diamond9))
        deck.add(Card(8, "Diamonds", R.drawable.diamond8))
        deck.add(Card(7, "Diamonds", R.drawable.diamond7))
        deck.add(Card(6, "Diamonds", R.drawable.diamond6))
        deck.add(Card(5, "Diamonds", R.drawable.diamond5))
        deck.add(Card(4, "Diamonds", R.drawable.diamond4))
        deck.add(Card(3, "Diamonds", R.drawable.diamond3))
        deck.add(Card(2, "Diamonds", R.drawable.diamond2))
        //   deck.add(Card(14, "Clubs", R.drawable.clubsa))
        //   deck.add(Card(13, "Clubs", R.drawable.clubsk))
        //   deck.add(Card(12, "Clubs", R.drawable.clubsq))
        //   deck.add(Card(11, "Clubs", R.drawable.clubsj))
        //   deck.add(Card(10, "Clubs", R.drawable.clubs10))
        //   deck.add(Card(9, "Clubs", R.drawable.clubs9))
        //   deck.add(Card(8, "Clubs", R.drawable.clubs8))
        //   deck.add(Card(7, "Clubs", R.drawable.clubs7))
        //   deck.add(Card(6, "Clubs", R.drawable.clubs6))
        //   deck.add(Card(5, "Clubs", R.drawable.clubs5))
        deck.add(Card(4, "Clubs", R.drawable.clubs4))
        deck.add(Card(3, "Clubs", R.drawable.clubs3))
        deck.add(Card(2, "Clubs", R.drawable.clubs2))

    }


    fun draw(): Card {// needed a way to draw cards,

        nextCard = deck.removeAt(0)
        currentCard = deck[0]

        discardpile.add(0, currentCard)

        return nextCard
    }


    fun nextRound() {
        discardpile.shuffle()

        deck.addAll(discardpile)
        discardpile.clear()

        deck.shuffle()
    }
}