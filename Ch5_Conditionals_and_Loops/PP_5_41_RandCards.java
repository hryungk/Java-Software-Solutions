//********************************************************************************
//  RandCards.java      @author: Hyunryung Kim
//
//  Programming Projects 5.41, Chapter 5
//  Design and implement a class called Card that represents a standard playing
//  card. Each card has a suit and a face value. Create a program that deals 5
//  random cards.
//********************************************************************************

public class PP_5_41_RandCards 
{
    //----------------------------------------------------------------------------
    // Creates 5 Card objects.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
     Card card1, card2, card3, card4, card5;
     
     card1 = new Card();
     card2 = new Card();
     card3 = new Card();
     card4 = new Card();
     card5 = new Card();
     
     System.out.println(card1);
     System.out.println(card2);
     System.out.println(card3);
     System.out.println(card4);
     System.out.println(card5);
        
    }
}
