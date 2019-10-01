import java.util.Scanner;

public class Objects {
    private boolean stayInObjects = true;
    private int userChoice;
    Scanner scanner = new Scanner(System.in);
    private final String GREETMESSAGE = "Objects Options:\n1. How to Create a Class\n2. What is a Constructor\n3. Setters/Getters\n4. toString Method\n 5. How to Access Data Inside an Object\n0. Exit to Main Menu";
    private final String CLASS = "";
    private final String CLASSEXAMPLE = "";
    private final String CONSTRUCTOR = "";
    private final String CONSTRUCTOREXAMPLE = "";
    private final String SETTERSGETTERS = "";
    private final String SETTERSGETTERSEXAMPLE = "";
    private final String TOSTRINGMETHOD = "";
    private final String TOSTRINGMETHODEXAMPLE = "";
    private final String ACCESSDATA = "";

    private void objectsStart(){
        while (stayInObjects){
            System.out.println(GREETMESSAGE);
            userChoice = scanner.nextInt();
            switch (userChoice){
                case 0:
                    stayInObjects = false;
                    break;
                case 1:
                    printClassMessages();
                    break;
                case 2:
                    printConstructorMessages();
                    break;
                case 3:
                    printSetterGetterMessages();
                    break;
                case 4:
                    printStringMethodMessages();
                    break;
                case 5:
                    printAccessDataMessages();
                    break;
            }
        }
    }
    private void printClassMessages(){
        System.out.println(CLASS);
        System.out.println(CLASSEXAMPLE);
    }
    private void printConstructorMessages(){
        System.out.println(CONSTRUCTOR);
        System.out.println(CONSTRUCTOREXAMPLE);
    }
    private void printSetterGetterMessages(){
        System.out.println(SETTERSGETTERS);
        System.out.println(SETTERSGETTERSEXAMPLE);
    }
    private void printStringMethodMessages(){
        System.out.println(TOSTRINGMETHOD);
        System.out.println(TOSTRINGMETHODEXAMPLE);
    }
    private void printAccessDataMessages(){
        System.out.println(ACCESSDATA);
    }
}
