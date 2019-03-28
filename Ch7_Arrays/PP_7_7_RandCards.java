//********************************************************************************
//  RandCards.java      @author: Hyunryung Kim
//
//  Programming Projects 7.7, Chapter 7
//  The programming projects of Chapter 4 discussed a Card class that represents
//  a standard playing card. Create a class called DeckOfCards that stores 52
//  objects of the Card class. Include methods to shuffle the deck, deal a card,
//  and report the number of cards left in the dock. The shuffle method should 
//  assume a full deck. Create a driver class with a main method that deals each 
//  card from a shuffled deck, printing each card as it is dealt.
//********************************************************************************

public class PP_7_7_RandCards 
{
    //----------------------------------------------------------------------------
    // Creates 5 Card objects.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {           
        DeckOfCards cardDeck = new DeckOfCards();
        
        cardDeck.shuffle();

        Card card1 = cardDeck.deal();
        System.out.println(card1 + " was dealt.");
        System.out.println(cardDeck);
        cardDeck.rollDealt();
        cardDeck.rollDeck();
        
        System.out.println();
        Card card2 = cardDeck.deal();
        System.out.println(card2 + " was dealt.");
        System.out.println(cardDeck);
        cardDeck.rollDealt();
        cardDeck.rollDeck();
        
        System.out.println();
        Card card3 = cardDeck.deal();
        System.out.println(card3 + " was dealt.");
        System.out.println(cardDeck);
        cardDeck.rollDealt();
        cardDeck.rollDeck();
        
        System.out.println();
        cardDeck.shuffle();
        System.out.println("The deck was shuffled.");
        System.out.println(cardDeck);
        
        System.out.println();
        Card card4 = cardDeck.deal();
        System.out.println(card4 + " was dealt.");
        System.out.println(cardDeck);
        cardDeck.rollDealt();
        cardDeck.rollDeck();
        
    }
}
