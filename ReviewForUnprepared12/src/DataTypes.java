import java.util.Scanner;

public class DataTypes {
    private boolean stayInData = true;
    private int userChoice;
    Scanner scanner = new Scanner(System.in);
    //Intro message
    private final String GREETMESSAGE = "Data Types Options:\n1. Main Primitive Types\n2. Primitive Operators\n3. Comparable Operators\n0. Exit to Main Menu";
    //Info and examples
    private final String PRIMITIVETYPES = "";
    private final String PRIMITIVETYPESEXAMPLE = "";
    private final String PRIMITIVEOPERATORS = "";
    private final String PRIMITIVEOPERATORSEXAMPLE = "";
    private final String COMPARABLEOPERATORS = "";
    private final String COMPARABLEOPERATORSEXAMPLE = "";

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
                    printPrimitiveTypes();
                    break;
                case 2:
                    printPrimitiveOperators();
                    break;
                case 3:
                    printComparableOperators();
                    break;
            }
        }
    }

    private void printPrimitiveTypes(){
        System.out.println(PRIMITIVETYPES);
        System.out.println(PRIMITIVETYPESEXAMPLE);
    }
    private void printPrimitiveOperators(){
        System.out.println(PRIMITIVEOPERATORS);
        System.out.println(PRIMITIVEOPERATORSEXAMPLE);
    }
    private void printComparableOperators(){
        System.out.println(COMPARABLEOPERATORS);
        System.out.println(COMPARABLEOPERATORSEXAMPLE);
    }
}

