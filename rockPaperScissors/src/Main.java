import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        //Scanner for user input
        String userChoice = "";
        String userChoiceFull = "";
        //Stores user input as string
        int computerScore = 0;
        int userScore = 0;
        //sets both players score

        while ((userScore < 3) && (computerScore < 3) && (!userChoice.equals("e"))){
            System.out.println("Choose one of the following: \"r\" for Rock \"p\" for Paper \"s\" for Scissors or \"e\" to exit the game.");
            System.out.println("______________________________________________________________________________");
            //Title and text
            userChoice = userInput.nextLine().toLowerCase();
            //Gets user input and makes lowercase
            if (userChoice.equals("r")){
                userChoiceFull = "rock";
            }
            else if (userChoice.equals("p")){
                userChoiceFull = "paper";
            }
            else {
                userChoiceFull = "scissors";
            }
            //Converts user input to full names

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
            if (!userChoice.equals("r") && !userChoice.equals("p") && !userChoice.equals("s") && !userChoice.equals("e")){
                System.out.println("Invalid input.");
            }
            //Detects invalid inputs
            if (userChoice.equals(computerChoice)) {
                System.out.println("Tie! You both chose " + userChoiceFull);
                System.out.println("Your Score: " + userScore + "\t Computer Score: " + computerScore + "\n");
            } else if (userChoice.equals("r") && computerChoice.equals("s")) {
                System.out.println("You win! Your opponent chose paper.");
                userScore++;
                System.out.println("Your Score: " + userScore + "\t Computer Score: " + computerScore + "\n");
            } else if (userChoice.equals("p") && computerChoice.equals("r")) {
                System.out.println("You win! Your opponent chose rock.");
                userScore++;
                System.out.println("Your Score: " + userScore + "\t Computer Score: " + computerScore + "\n");
            } else if (userChoice.equals("s") && computerChoice.equals("p")) {
                System.out.println("You win! Your opponent chose paper.");
                userScore++;
                System.out.println("Your Score: " + userScore + "\t Computer Score: " + computerScore + "\n");
            } else if (userChoice.equals("r") && computerChoice.equals("p")) {
                System.out.println("You lose! Your opponent chose paper.");
                computerScore++;
                System.out.println("Your Score: " + userScore + "\t Computer Score: " + computerScore + "\n");
            } else if (userChoice.equals("p") && computerChoice.equals("s")) {
                System.out.println("You lose! Your opponent chose scissors.");
                computerScore++;
                System.out.println("Your Score: " + userScore + "\t Computer Score: " + computerScore + "\n");
            } else if (userChoice.equals("s") && computerChoice.equals("r")) {
                System.out.println("You lose! Your opponent chose rock.");
                computerScore++;
                System.out.println("Your Score: " + userScore + "\t Computer Score: " + computerScore + "\n");
            }
        }
        if (userChoice.equals("e")){
            System.out.println("Thank you for playing! Goodbye.");
        }
        else if (userScore > computerScore){
            System.out.println("Victory! You have beat the computer!");
            System.out.println("Your Score: " + userScore + "\t Computer Score: " + computerScore + "\n");
        }
        else {
            System.out.println("Defeat! You have been beaten by the computer!");
            System.out.println("Your Score: " + userScore + "\t Computer Score: " + computerScore + "\n");
        }
        //Detects if player won or lost the game. Also detects if they exited
    }
}
