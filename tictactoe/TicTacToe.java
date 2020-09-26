//welcome to tictactoe
import java.util.*;

public class TicTacToe {

    public char[] board =new char[10];
    public Set<Integer> availablePositions = new HashSet<Integer>();
    public char userChoice;
    public char compChoice;
    public String currentPlayer;
    //creating board UC!
    TicTacToe() {
        for(int i=1;i<10;i++) {
            board[i]=' ';
            availablePositions.add(i);
        }
        System.out.println(board);
    }

    //UC 2
    public void UserChoice() {
        //Get user input
        System.out.println("enter 'X' or 'O' as your key ");
        Scanner scan = new Scanner(System.in);
        this.userChoice = scan.next().charAt(0);

        if (this.userChoice=='X') {
            this.compChoice='O';
        }
        else {
            this.compChoice='X';
        }
        //Show chosen user choice
        System.out.println("User choice is :- "+this.userChoice);
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

    //UC4 check user key if valid
    public boolean isValidPosition(int position) {
        return availablePositions.contains(position);
    }

    //UC5 make the move
    public void makeUserMove(int position) {
        this.board[position]=this.userChoice;
        this.showBoard();
        this.availablePositions.remove(position);
    }

    //UC4 Get user input
    public void userInputPosition() {

        //get user input position
        System.out.println("Please Enter a position to fill between 1-9");
        Scanner scan = new Scanner(System.in);
        int position = scan.nextInt();
        System.out.println("User position is :- "+position);
        
        //Check user position out of range
        if (this.isValidPosition(position)) {
            //make move
           this.makeUserMove(position);
        }
        //if not empty then reask for new position
        else {
            System.out.println("Please Enter a correct postion. ");
            //get user input again
            this.userInputPosition();
        }
            

    }

    //UC6 Todd a coin and assign who plays first
    public void toss() {

        //let user select heads or tails
        System.out.println("Please enter 1 for heads and 0 for tails for toss");
        Scanner scan = new Scanner(System.in);
        int userChoice= scan.nextInt();

        // create instance of Random class 
        Random rand = new Random(); 

        // Assign first player
        if (userChoice == 0 || userChoice ==1 ) {
            if(userChoice == rand.nextInt(1)) {
                this.currentPlayer ="User";
            }
            else {
                this.currentPlayer ="Computer";
            }

        }

    }
    public static void main(String[] args) {
        TicTacToe newBoard = new TicTacToe();
        newBoard.UserChoice();
        newBoard.showBoard();
        newBoard.toss();
        newBoard.userInputPosition();
        newBoard.userInputPosition();
        
    }
}
