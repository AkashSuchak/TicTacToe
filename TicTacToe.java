//main Class
public class TicTacToe {
    //Initializing Board
    public static void initializeBoard() {

        char[] charArray = new char[10];
        //Assigning Space : Index 1 to 9
        for (int i=1; i<charArray.length; i++){
            charArray[i]=' ';
        }
    }
    // Main method
    public static void main(String args[]){
        //Calling Method
        initializeBoard();
    }
}
