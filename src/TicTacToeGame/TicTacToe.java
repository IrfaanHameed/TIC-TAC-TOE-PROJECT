package TicTacToeGame;


import java.util.Scanner;

public class TicTacToe {
     public static char current_player = 'X';
     public static char[] board = {' ',' ',' ',' ', ' ',' ',' ',' ',' ',' '};
     public static Scanner input = new Scanner(System.in);
     public static boolean still_game_going = true;

     public static void displayBoard(){
          System.out.println(board[0] + "|" + board[1] + "|" + board[2]);
          System.out.println(board[3] + "|" + board[4] + "|" + board[5]);
          System.out.println(board[6] + "|" + board[7] + "|" + board[8]);
     }

     public static void handleturn(char player) {
          System.out.println(player + "'s turn");
          int position;
          System.out.println("Choose The Position From (1-9) : ");
          position = input.nextInt();
          switch (position){
               case 1:
                    if(board[0] == 'X' || board[0] == 'O'){
                         System.out.println("U Can't go there !!");
                         handleturn(player);
                    }else {
                         board[0] = player;
                    }
                    break;
               case 2:
                    if(board[1] == 'X' || board[1] == 'O'){
                         System.out.println("U Can't go there !!");
                         handleturn(player);
                    }else {
                         board[1] = player;
                    }
                    break;
               case 3:
                    if(board[2] == 'X' || board[2] == 'O'){
                         System.out.println("U Can't go there !!");
                         handleturn(player);
                    }else {
                         board[2] = player;
                    }
                    break;
               case 4:
                    if(board[3] == 'X' || board[3] == 'O'){
                         System.out.println("U Can't go there !!");
                         handleturn(player);
                    }else {
                         board[3] = player;
                    }
                    break;
               case 5:
                    if(board[4] == 'X' || board[4] == 'O'){
                         System.out.println("U Can't go there !!");
                         handleturn(player);
                    }else {
                         board[4] = player;
                    }
                    break;
               case 6:
                    if(board[5] == 'X' || board[5] == 'O'){
                         System.out.println("U Can't go there !!");
                         handleturn(player);
                    }else {
                         board[5] = player;
                    }
                    break;
               case 7:
                    if(board[6] == 'X' || board[6] == 'O'){
                         System.out.println("U Can't go there !!");
                         handleturn(player);
                    }else {
                         board[6] = player;
                    }
                    break;
               case 8:
                    if(board[7] == 'X' || board[7] == 'O'){
                         System.out.println("U Can't go there !!");
                         handleturn(player);
                    }else {
                         board[7] = player;
                    }
                    break;
               case 9:
                    if(board[8] == 'X' || board[8] == 'O'){
                         System.out.println("U Can't go there !!");
                         handleturn(player);
                    }else {
                         board[8] = player;
                    }
                    break;
               default:
                    handleturn(player);
                    break;
          }

          displayBoard();



     }

     public static void flipPlayer(){
          if(current_player == 'X'){
               current_player = 'O';
          } else if(current_player == 'O'){
               current_player = 'X';
          }
     }

     public static  void  playGame() {
          displayBoard();

          while (still_game_going){
               handleturn(current_player);
               isGameOver();
               flipPlayer();
          }


     }

     public static void isGameOver(){
          checkIfWin();
          checkIfTie();
     }

     public static void checkIfWin(){
          char diagnolWinner = checkAtDiagnol();
          char rowWinner = checkAtRow();
          char columnWinner = checkAtColumn();

          if(diagnolWinner == 'X' || diagnolWinner == 'O'){
               still_game_going = false;
               System.out.println(" ");
               System.out.println(diagnolWinner + " " + "Won");
          }else if(rowWinner == 'X' || rowWinner == 'O'){
               still_game_going = false;
               System.out.println(" ");
               System.out.println(rowWinner + " " + "Won");
          }else if(columnWinner == 'X' || columnWinner == 'O'){
               still_game_going = false;
               System.out.println(" ");
               System.out.println(columnWinner + " " + "Won");
          }
     }


     public static boolean checkIfTie(){

          boolean isDraw = false;
          char[] row1 = {board[0],board[1],board[2]};
          char[] row2 = {board[3],board[4],board[5]};
          char[] row3 = {board[6],board[7],board[8]};

          if((row1[0] != ' ' && row1[1] != ' ' && row1[2] != ' ')
                  && (row2[0] != ' ' && row2[1] != ' ' && row2[2] != ' ')
                  && (row3[0] != ' ' && row3[1] != ' ' && row3[2] != ' ') ){

               still_game_going = false;
               isDraw = true;
               System.out.println("Tie");
          }

          return isDraw;
     }

     public static char checkAtRow(){
          char winner = ' ';
          if(board[0] == 'X' && board[1] == 'X' && board[2] == 'X'){
               winner = 'X';
          }else if(board[3] == 'X' && board[4] == 'X' && board[5] == 'X'){
               winner = 'X';
          }else if(board[6] == 'X' && board[7] == 'X' && board[8] == 'X'){
               winner = 'X';
          }else if(board[0] == 'O' && board[1] == 'O' && board[2] == 'O'){
               winner = 'O';
          }else if(board[3] == 'O' && board[4] == 'O' && board[5] == 'O'){
               winner = 'O';
          }else if(board[6] == 'O' && board[7] == 'O' && board[8] == 'O'){
               winner = 'O';
          }else {
               winner = ' ';
          }

          return winner;
     }

     public static char checkAtColumn(){
          char winner = ' ';
          if(board[0] == 'X' && board[3] == 'X' && board[6] == 'X'){
               winner = 'X';

          }else if(board[1] == 'X' && board[4] == 'X' && board[7] == 'X'){
               winner = 'X';

          }else if(board[2] == 'X' && board[5] == 'X' && board[8] == 'X'){
               winner = 'X';

          }else if(board[0] == 'O' && board[3] == 'O' && board[6] == 'O'){
               winner = 'O';

          }else if(board[1] == 'O' && board[4] == 'O' && board[7] == 'O'){
               winner = 'O';

          }else if(board[2] == 'O' && board[5] == 'O' && board[8] == 'O'){
               winner = 'O';
          }else {
               winner = ' ';
          }
          return winner;
     }

     public static char checkAtDiagnol(){

          char winner = ' ';
          if(board[0] == 'X' && board[4] == 'X' && board[8] == 'X'){
               winner = 'X';

          }else if(board[2] == 'X' && board[4] == 'X' && board[6] == 'X'){
               winner = 'X';

          }else if(board[0] == 'O' && board[4] == 'O' && board[8] == 'O'){
               winner = 'O';

          }else if(board[2] == 'O' && board[4] == 'O' && board[6] == 'O'){
               winner = 'O';
          }else {
               winner = ' ';

          }
          return winner;
     }

     public static void main(String[] args){
          playGame();

     }
}




