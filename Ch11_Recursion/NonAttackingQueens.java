//********************************************************************************
//  NonAttackingQueens.java       Author: Hyunryung Kim
//
//  Solves the Non-Attacking Queens problem using recursion.
//********************************************************************************

public class NonAttackingQueens
{
    private final int TRIED = 1;
    private final int PATH = 7;
    private int[][] board;  // Chess board
    private int max;    // max: the size of the board
    private int Imax;   //Imax: maximum index of board
    private int numTried = 0;   // Number of tried spots.

    //----------------------------------------------------------------------------
    //  Sets up the chess board to default (all zero, no queen is placed yet). 
    //----------------------------------------------------------------------------    
    public NonAttackingQueens(int boardSize)
    {
        max = boardSize;
        Imax = max - 1;
        board = new int[max][max];
        for (int i = 0; i < max; i++)
            for (int j = 0; j < max; j++)
                board[i][j] = 0;
    }
    
    //----------------------------------------------------------------------------
    //  Attempts to recursively place queens on the chess board to prevent from 
    //  attacking each other.
    //----------------------------------------------------------------------------
    public boolean traverse(int row, int column)
    {
        boolean done = false;

        if (valid(row, column))
        {
            board[row][column] = TRIED;  // this cell has been tried.
            
            if (row == Imax)
                done = true;
            else
            {   
                int nextCol = 0;
                done = traverse(row+1, nextCol); // down
                while(!done && nextCol <= Imax)
                {
                    nextCol++;
                    done = traverse(row+1, nextCol); // right
                }
            }
            
            if (!done)
                board[row][column] = 0;  // Backtrack
        }
        return done;
    }
    
    //----------------------------------------------------------------------------
    //  Determines if a specific location is valid.
    //----------------------------------------------------------------------------    
    private boolean valid(int row, int column)
    {
        boolean result = false;
        
        // check if cell is in the bounds of the matrix
        if (row >= 0 && row < max && 
            column >= 0 && column < max)
            // Check if cell is not blocked and not previously tried
            result = elmCheck(row,column);
        
        return result;
    }
    
    //----------------------------------------------------------------------------
    //  Checkes if the queen is not attacking (no other queen in all directions).
    //----------------------------------------------------------------------------    
    private boolean elmCheck(int row, int column)
    {
        boolean result = true;
        
        // Check the column
        for (int i = 0; i < max; i++)
            result = (result && (board[i][column] != TRIED));
        
        // Check the row
        for (int j = 0; j < max; j++)
            result = (result && (board[row][j] != TRIED));
        
        // Check the 45 deg diagonal line up.
        if (row+column < Imax)
            for (int k = 0; k <= row+column; k++)
                result = (result && (board[row+column-k][k] != TRIED));
        else
            for (int k = 0; k <= Imax-(row+column-Imax); k++)
                result = (result && (board[Imax-k][row+column-Imax+k] != TRIED));
        
        // Check the -45 deg diagonal line up.
        if (row < column)
            for (int k = 0; k <= Imax-(column-row); k++)
                result = (result && (board[k][column-row+k] != TRIED));
        else
            for (int k = 0; k <= Imax-(row-column); k++)
                result = (result && (board[row-column+k][k] != TRIED));  
        
        return result;
    }
    
    //----------------------------------------------------------------------------
    //  Returns the chess board with Queens located.
    //----------------------------------------------------------------------------    
    public String toString()
    {
        String result = "\n";
        for (int row=0; row < max; row++)
        {
            for (int column = 0; column < max; column++)
                result += board[row][column] + " ";
            result += "\n";
        }
        
        return result;
    }
}
