/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tictactoe;

/**
 *
 * @author jiebi
 */
public class TicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 char board[][]=new char[17][17];
    int row,col;
    for(row=0;row<17;row++){
        for(col=0;col<17;col++){
         board[row][col]=' ';
            }
    }
   board[2][2]='1';
         board[2][8]='2';
         board[2][14]='3';
         board[8][2]='4';
         board[8][8]='5';
         board[8][14]='6';
            board[14][2]='7';
         board[14][8]='8';
         board[14][14]='9';
          for(col=0;col<17;col++){
             board[5][col]='.';
             board[11][col]='.';
         }
         for(row=0;row<17;row++){
             board[row][5]='|';
             board[row][11]='|';
         }
        for(row=0;row<17;row++){
            for(col=0;col<17;col++){
               System.out.print(board[row][col]);
                }
        System.out.println();
        }
      
    }
    }
    

