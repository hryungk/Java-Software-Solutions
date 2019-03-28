//********************************************************************************
//  DeckOfCards.java      @author: Hyunryung Kim
//
//  Programming Projects 7.7, Chapter 7
//  The programming projects of Chapter 4 discussed a Card class that represents
//  a standard playing card. Create a class called DeckOfCards that stores 52
//  objects of the Card class. Include methods to shuffle the deck, deal a card,
//  and report the number of cards left in the dock. The shuffle method should 
//  assume a full deck. Create a driver class with a main method that deals each 
//  card from a shuffled deck, printing each card as it is dealt.
//********************************************************************************

import java.util.Random;
import java.util.ArrayList;

public class DeckOfCards 
{
    private final int MAX = Card.MAX_FACE * Card.MAX_SUIT;
    private Card[] cardDeck = new Card[MAX];
    ArrayList<Card> cardDeckLeft = new ArrayList<Card>();
    ArrayList<Card> cardDeckDealt = new ArrayList<Card>();
    private final Random generator = new Random();
    
    //----------------------------------------------------------------------------
    //  Sets up the card deck by stack al 52 cards in order.
    //----------------------------------------------------------------------------
    public DeckOfCards()
    {
        cardDeck = newDeck();
        
        // Set up another card deck to keep track of dealt cards.
        for (Card cardObj : cardDeck) 
            cardDeckLeft.add(cardObj);
    }
    
    //----------------------------------------------------------------------------
    //  Shuffles the deck.
    //----------------------------------------------------------------------------
    public void shuffle()
    {
        int[] order = new int[MAX];
        // instantiate the order array with -1.
        for (int i = 0; i < order.length; i++)
            order[i] = -1;
                
        int num;
        // Fill up with random order from 0 to 51
        for (int idx = 0; idx < MAX; idx++)
        {
            do 
            {
                num = generator.nextInt(MAX);
            } while (order[num] != -1);
            order[num] = idx;
        }
                
        // Shuffle the card deck with new order.
        Card[] temp = newDeck();
        
        for (int i = 0; i < MAX; i++)
        {
            int idx = order[i];
            cardDeck[i] = temp[idx];
        }
        
        // Set up another card deck to keep track of dealt cards.
        cardDeckLeft = new ArrayList<Card>();   // Initialize the ArrayList
        for (Card cardObj : cardDeck) 
            cardDeckLeft.add(cardObj);
        // Initialize the dealt card list.
        cardDeckDealt = new ArrayList<Card>();
    }

    //----------------------------------------------------------------------------
    //  Deals a card from the deck.
    //----------------------------------------------------------------------------
    public Card deal()
    {
        int num = generator.nextInt(MAX);
        
        cardDeckLeft.remove(cardDeck[num]);
        cardDeckDealt.add(cardDeck[num]);
        
        return cardDeck[num];
    }
    
    //----------------------------------------------------------------------------
    //  Number of cards left in the deck.
    //----------------------------------------------------------------------------
    public int numCards()
    {
        return cardDeckLeft.size();
    }

    //----------------------------------------------------------------------------
    //  Returns the number of cards left in the deck.
    //----------------------------------------------------------------------------
    public String toString()
    {
        return ("Number of cards left in the deck: " + numCards());
    }

    //----------------------------------------------------------------------------
    //  Returns the number of cards left in the deck.
    //----------------------------------------------------------------------------
    public void rollDeck()
    {
        String result = "Cards left in the deck:\n";
        
        int count = 0;
        for (int i = 0; i < cardDeckLeft.size(); i++)
        {
            result += cardDeckLeft.get(i).toString() + "  ";
            count++;
            if (count % 5 == 0)
                result += "\n";
        }
        System.out.println(result);
    }

    //----------------------------------------------------------------------------
    //  Returns the number of cards left in the deck.
    //----------------------------------------------------------------------------
    public void rollDealt()
    {
        String result = "Cards dealt from the deck:\n";
        
        for (int i = 0; i < cardDeckDealt.size(); i++)
            result += cardDeckDealt.get(i).toString() + "\t";
        
        System.out.println(result);
    }  
    
    //----------------------------------------------------------------------------
    //  Opens a new deck, cards are in order.
    //----------------------------------------------------------------------------
    private Card[] newDeck()
    {
        Card[] Deck = new Card[MAX];
        
        // Initialize the cardDeck
        for (int i = 0; i < MAX; i++)
        {
            Deck[i] = new Card();
        }
        
        // Make cards in order
        for (int i = 0; i < Card.MAX_SUIT; i++)
            for (int j = 0; j < Card.MAX_FACE; j++)
            {
                Deck[Card.MAX_FACE*i+j].setSuitValue(i);
                Deck[Card.MAX_FACE*i+j].setFaceValue(j+1);
            }
        return Deck;
    }

}
