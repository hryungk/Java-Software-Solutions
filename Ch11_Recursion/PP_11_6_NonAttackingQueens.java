//********************************************************************************
//  NonAttackingQueens.java      Author: Hyunryung Kim
//
//  Programming Projects 11.6, Chapter 11 Recursion
//  Design and implement a recursive program that solves the Non- Attacking Queens 
//  problem. That is, write a program to deter- mine all ways in which eight 
//  queens can be positioned on an eight-by-eight chessboard so that none of them 
//  are in the same row, column, or diagonal as any other queen. There are no 
//  other chess pieces on the board.
//********************************************************************************

public class PP_11_6_NonAttackingQueens 
{
    //----------------------------------------------------------------------------
    // Solves the Non-Attacking Queens problem using recursion.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        int boardSize = 8;
        int column;
        boolean success;
        
        NonAttackingQueens board = new NonAttackingQueens(boardSize);
        
        column = (int)(Math.random() * boardSize);
        success = board.traverse(0, column);
        
        System.out.println(board);
        
        if (success)
            System.out.println("The queens are all placed to be safe!");
        else
            System.out.println("The queens couldn't be saved.");
        
       
    }
}
