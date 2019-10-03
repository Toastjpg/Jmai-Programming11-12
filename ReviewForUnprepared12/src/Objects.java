import java.util.Scanner;

public class Objects {
    private boolean stayInObjects = true;
    private int userChoice;
    Scanner scanner = new Scanner(System.in);
    //Intro message
    private final String GREETMESSAGE = "Objects Options:\n1. How to Create a Class\n2. What is a Constructor\n3. Setters/Getters\n4. toString Method\n5. How to Access Data Inside an Object\n0. Exit to Main Menu";
    //Info and examples
    private final String CLASS = "To create a class, right click the src folder and hover over \"new\". Then select java class and give it a name.\n";
    private final String CONSTRUCTOR = "A Constructor is a special type of method that does not have a return type. It is used to initialize a newly created object and has the same name as the class that it's in. The new operator can be used to call the constructor to create a new object. In the example, a car named myCar is created with a type of 1 and speed of 10.";
    private final String CONSTRUCTOREXAMPLE = "Example:\npublic class Car{\n\n\tpublic Car(int carType, int carSpeed){\n\t\ttype = carType;\n\t\tspeed = carSpeed;\n\t}\n\tcar myCar = new Car(1,10);\n}";
    private final String SETTERSGETTERS = "Setters and Getters are ways in Java to access and change the value in a variable. Private variables in a class cannot be accessed outside of the class that it's in, therefore setters and getters need to be used instead of changing the variable to be public. The example shown is a class with a private int and some getter/setter methods.";
    private final String SETTERSGETTERSEXAMPLE = "Example:\npublic class Main{\n\tprivate int number;\n\tpublic int getNumber()[\n\t\treturn this.number;\n\t}\n\tpublic int setNumber(int num){\n\t\tthis.num = number;\n\t}\n";
    private final String TOSTRINGMETHOD = " ";
    private final String TOSTRINGMETHODEXAMPLE = "";
    private final String ACCESSDATA = "";

    public Objects(){
        objectsStart();
    }

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
