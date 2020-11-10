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
    // Displaying Board
    public static void displayBoard(){
        char[] board = initializeBoard();
        System.out.println("-----------");
        System.out.println(board[1] + " | " + board[2] + " | " + board[3] );
        System.out.println("-----------");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6] );
        System.out.println("-----------");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9] );
        System.out.println("-----------");
    }

    //Checking Desired Location is available or not
    public static char desiredLocation(){
        //Value of Board taking from initializeBoard Method
        char board[] = initializeBoard();

        //loop will continue till right input
        while (true) {
            System.out.println("Select Number from 1 to 9 to check Availability");
            Scanner scanner = new Scanner(System.in);

            //User Input for location availability
            int location = scanner.nextInt();

            //Checking Desired Location is Valid or Not
            if (location <= 9 && location >= 1) {
                //Checking Location is Occupied or Not
                if (board[location] == ' ') {
                    System.out.println("Your Desired Location "+ location + " is Available");
                    return board[location];
                } else {
                    System.out.println("Your Desired Location "+ location + " is Not Available");
                    return board[location];
                }
            } else System.out.println("Wrong Input !!!  Try Again");
        }
    }

    // Main method
    public static void main(String args[]){
        //Calling Methods
        char[] board = initializeBoard();
        char[] symbol = userSymbol();
        displayBoard();
        desiredLocation();

    }
}
