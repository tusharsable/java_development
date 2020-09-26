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
        Scanner scan = new Scanner(System.in);
        this.userChoice = scan.next().charAt(0);
        System.out.println("User choice is :- "+userChoice);
        if (this.userChoice=='X') {
            this.compChoice='O';
        }
        else {
            this.compChoice='X';
        }
        
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

    //UC4 put user key at location given by computer
    public void userInputPosition() {

        System.out.println("Please Enter a position to fill between 1-9");
        Scanner scan = new Scanner(System.in);
        int position = scan.nextInt();
        
        System.out.println("User position is :- "+position);
        
        if ((position<1)||(position>9)) {
            System.out.println("Please enter a correct position");
            this.userInputPosition();
        }
        else if (this.board[position]==' ') {
            this.board[position]=this.userChoice;
            this.showBoard();
        }
        else {
            System.out.println("Please Enter a empty postion. ");
            this.userInputPosition();
        }
            

    }

    public static void main(String[] args) {
        TicTacToe newBoard = new TicTacToe();
        newBoard.UserChoice();
        newBoard.showBoard();
        newBoard.userInputPosition();
        newBoard.userInputPosition();
    }
}
