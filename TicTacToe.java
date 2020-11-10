import java.util.Scanner;

//main Class
public class TicTacToe {
    //Initializing Board
    public static char[] initializeBoard() {

        char[] board = new char[10];
        //Assigning Space : Index 1 to 9
        for (int i=1; i<board.length; i++){
            board[i]=' ';
        }
        return board;
    }

    //Input taking from user X or O
    public static char[] userSymbol(){
        char[] userSymbol = new char[2];
        Scanner scanner = new Scanner(System.in);

        //Taking Symbol 'x' or 'y'
        while (true){
            System.out.println("Choose a Letter X or O : ");
            //Inut User
            char userInput = scanner.next().toUpperCase().charAt(0);

            //Assigning character to User and Computer as per input
            if(userInput == 'X'){
                userSymbol[0]='X';
                userSymbol[1]='O';
                return userSymbol;
            } else if(userInput == 'O'){
                userSymbol[0]='O';
                userSymbol[1]='X';
                return userSymbol;
            } else System.out.println("Wrong Input!!! Try Again");
        }
    }
    
    // Main method
    public static void main(String args[]){
        //Calling Method
        char[] board = initializeBoard();
        char[] symbol = userSymbol();
    }
}
