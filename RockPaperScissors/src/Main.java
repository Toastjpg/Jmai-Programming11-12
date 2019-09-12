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
        //sets computer choice as string

        if (randomNum == 0) {
            computerChoice = "r";
        } else if (randomNum == 1) {
            computerChoice = "p";
        } else {
            computerChoice = "s";
        }
        //randomly generates computer choice

        if (!userChoice.equals("r") && !userChoice.equals("p") && !userChoice.equals("s")){
            System.out.println("Invalid input.");
        }
        if (userChoice.equals(computerChoice)){
            System.out.println("Tie! You both chose " + userChoice);
        }
        else if (userChoice.equals("r") && computerChoice.equals("s")){
            System.out.println("You win! Your opponent chose paper.");
        }
        else if (userChoice.equals("p") && computerChoice.equals("r")){
            System.out.println("You win! Your opponent chose rock.");
        }
        else if (userChoice.equals("s") && computerChoice.equals("p")){
            System.out.println("You win! Your opponent chose paper.");
        }
        else if (userChoice.equals("r") && computerChoice.equals("p")){
            System.out.println("You lose! Your opponent chose paper.");
        }
        else if (userChoice.equals("p") && computerChoice.equals("s")){
            System.out.println("You lose! Your opponent chose scissors.");
        }
        else if (userChoice.equals("s") && computerChoice.equals("r")){
            System.out.println("You lose! Your opponent chose rock.");
        }
    }
}
