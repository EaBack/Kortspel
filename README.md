# Kortspel

I en enkel form av kortspel dras ett kort från kortleken och sedan ska användaren gissa om nästa dragna kort är större eller mindre än föregående kort. Poäng räknas utifrån hur många kort som gissades rätt på. 


I en PDF fil som jag ladas upp på GitHub står skissen.


During the process of making this app I came across two problems. One was the list with cards. I first used an array to create a list of cards, but came into trouble with getting a random card and reshuffling the deck. I solved this by creating a mutable list and later on added shuffle(). Furthermore I noticed the app crashed when I played the game. It took a while, but I noticed it was little random, not the first, second or third card, but spades and certain hearts cards. So I took a look at the cards and noticed the file size difference. most were between 9 and 25 KB and some were over 50 or 100 kb. These I altered so they would fit, using compression and size tools. Some were over 3000 pixels big.After this the app worked and I could start altering details. 
