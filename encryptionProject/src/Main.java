import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creates scanner for user input
        Scanner userInput = new Scanner(System.in);
        //Sets userChoice as a string
        String userChoice;
        //Gets user input from the next line
        userChoice = userInput.nextLine();
        int lastValue = 0;

        //Checks length of user input and stores as one less than total
        lastValue = userChoice.length() - 1;
        //Takes the last character of user input
        char x = userChoice.charAt(lastValue);
        //Reorders the letters
        System.out.print(x);
        for (int i=0; i < userChoice.length() -1; i++ ){
            char y = userChoice.charAt(i);
            System.out.print(y);
        }
        System.out.println("ay");

        //Organizes the letters back
        for (int i=0; i < userChoice.length() -1; i++ ){
            char y = userChoice.charAt(i);
            System.out.print(y);
        }
        System.out.println(x);

    }
}
