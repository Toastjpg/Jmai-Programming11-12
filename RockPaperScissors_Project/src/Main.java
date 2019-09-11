import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        //Scanner for user input
        String userChoice = null;
        //Stores user input as string

        System.out.println("Choose one of the following: \"r\" for Rock \"p\" for Paper \"s\" for Scissors");
        System.out.println("______________________________________________________________________________");
        //Title and text
        userChoice = userInput.nextLine().toLowerCase();
        //Gets user input and makes lowercase
        Random random = new Random();
        //Random number generator
        int randomNum = random.nextInt(3);
        //Gets random int 0,1,or 2
        String computerChoice;

        if (randomNum == 0){
            computerChoice = "rock";
        }
        else if (randomNum == 1){
            computerChoice = "paper";
        }
        else {
            computerChoice = "scissors";
        }







    }


}
