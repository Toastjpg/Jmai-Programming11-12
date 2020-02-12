package game;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private String computerInput;
    private String userInput;
    private static final String ROCK = "rock";
    private static final String PAPER = "paper";
    private static final String SCISSORS = "scissors";
    private static final String INVALID_INPUT = "Invalid Input";

    /**
     * Gets user input
     * Generates random computer input
     * @return method that compares user input and computer input values
     */
    public String start(){
        getComputerInput();
        getUserInput();
        compareInput();
        return compareInput();
    }

    /**
     * Generates computer input based on random number 0, 1, or 2
     * If 0, sets computerInput to ROCK
     * If 1, sets computerInput to PAPER
     * If 2, sets computerInput to SCISSORS
     */
    private void getComputerInput() {
        Random random = new Random();
        int randomComputerNumber = random.nextInt(3);
        switch (randomComputerNumber){
            case 0:
                computerInput = ROCK;
                break;
            case 1:
                computerInput = PAPER;
                break;
            case 2:
                computerInput = SCISSORS;
                break;
        }
    }

    /**
     * Takes user input from scanner and sets it to lower case
     */
    private void getUserInput() {
        userInput = new Scanner(System.in).nextLine().toLowerCase();
    }

    /**
     * Compares userInput value to computerInput value
     * @return -1 if user loses, 0 if user ties, 1 if user wins
     */
    private String compareInput(){
        if (userInput.equals(ROCK) || userInput.equals(PAPER) || userInput.equals(SCISSORS)){
            if (userInput.equals(computerInput)){
                return Integer.toString(0);
            }
            else if (userInput.equals(ROCK) && computerInput.equals(PAPER)){
                return Integer.toString(-1);
            }
            else if (userInput.equals(ROCK) && computerInput.equals(SCISSORS)){
                return Integer.toString(1);
            }
            else if (userInput.equals(PAPER) && computerInput.equals(SCISSORS)){
                return Integer.toString(-1);
            }
            else if (userInput.equals(PAPER) && computerInput.equals(ROCK)){
                return Integer.toString(1);
            }
            else if (userInput.equals(SCISSORS) && computerInput.equals(ROCK)){
                return Integer.toString(-1);
            }
            else if (userInput.equals(SCISSORS) && computerInput.equals(PAPER)){
                return Integer.toString(1);
            }
        }
        return INVALID_INPUT;
    }

}
