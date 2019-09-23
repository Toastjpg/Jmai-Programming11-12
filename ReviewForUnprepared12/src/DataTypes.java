import java.util.Scanner;

public class DataTypes {
    private boolean stayInData = true;
    private int userChoice;
    Scanner scanner = new Scanner(System.in);
    private String GREETMESSAGE = "Data Types Options:\n1. Main Primitive Types\n2. Primitive Operators\n3. Comparable Operators\n0. Exit to Main Menu";

    public DataTypes(){
        dataTypesStart();
    }

    private void dataTypesStart(){
        while (stayInData){
            System.out.println(GREETMESSAGE);
            userChoice = scanner.nextInt();
            switch(userChoice){
                case 0:
                    stayInData = false;
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;

            }
        }

    }
}

