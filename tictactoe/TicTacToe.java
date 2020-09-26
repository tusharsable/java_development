//welcome to tictactoe
import java.util.*;

public class TicTacToe {

    public char[] board =new char[10];
    public char userChoice;
    public char compChoice;
    //creating board UC!
    TicTacToe() {
        for(int i=1;i<10;i++) {
            board[i]=' ';
        }
        System.out.println(board);
    }
    //UC 2
    public void UserChoice() {
        System.out.println("enter 'X' or 'O' as your key ");
        Scanner sc = new Scanner(System.in);
        this.userChoice = sc.next().charAt(0);
        System.out.println("User choice is :- "+userChoice);
        if (this.userChoice=='X') {
            this.compChoice='O';
        }
        else {
            this.compChoice='X';
        }
        sc.close();
    }

    //UC3 Show current board 
    public void showBoard() {
        System.out.println("");
        for (int i=1;i<10;i+=3) {
            for (int j=0;j<3;j++) {
                System.out.print(this.board[i+j]);
                if (j!=2) {
                    System.out.print(" | ");
                }
            }
            
            System.out.println("\n ________ \n");
        }
    }
    
    public static void main(String[] args) {
        TicTacToe newBoard = new TicTacToe();
        newBoard.UserChoice();
        newBoard.showBoard();

    }
}
