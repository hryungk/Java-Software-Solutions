//********************************************************************************
//  BeerSong.java      @author: Hyunryung Kim
//
//  Programming Projects 5.17, Chapter 5
//  Design and implement an application that prints the verses of the song "The
//  Twelve Days of Christmas," in which each verse adds one line. Use a switch 
//  statement in a loop to control which lines get printed. Hint: Order the cases
//  carefully and avoid the break statement. Use a separate switch statement to 
//  put the appropriate suffix on the day number (1st, 2nd, 3rd, etc.). The final
//  verse of the song involves all 12 days.
//********************************************************************************

public class PP_5_17_XmasSong 
{
    //----------------------------------------------------------------------------
    // Prints the verses of the Christmas song.
    //----------------------------------------------------------------------------
    public static void main(String[] arg)
    {
        final int MAX = 12;
        for (int i = 1; i <= MAX; i++)
        {
            System.out.print("On the " + i);
            if (i <= 3)
            {
                switch (i)
                {
                    case 1:
                        System.out.print("st");
                        break;
                    case 2: 
                        System.out.print("nd");
                        break;
                    case 3: 
                        System.out.print("rd");
                        break;
                }    
            }
            else
                System.out.print("th");
            
            System.out.println(" day of Christmas my true love gave to me");
            
            switch (i)
            {
                case 12:
                    System.out.println("Twelve drummers drumming,");
                case 11:
                    System.out.println("Eleven pipers piping,");
                case 10:
                    System.out.println("Ten lords a leaping,");
                case 9:
                    System.out.println("Nine ladies dancing,");
                case 8:
                    System.out.println("Eight maids a milking,");
                case 7:
                    System.out.println("Seven swans a swimming,");
                case 6:
                    System.out.println("Six geese a laying,");
                case 5:
                    System.out.println("Five golden rings,");
                case 4:
                    System.out.println("Four calling birds,");
                case 3:
                    System.out.println("Three French hens,");
                case 2:
                    System.out.println("Two turtle doves, and");
                case 1:
                    System.out.println("A partridge in a pear tree.");
            
            }
        }
        
    }
}
