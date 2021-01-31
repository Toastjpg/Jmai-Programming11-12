import java.util.Scanner;

public class ControlFlow {
    private boolean stayInControl = true;
    private int userChoice;
    Scanner scanner = new Scanner(System.in);
    //Intro message
    private final String GREETMESSAGE = "Control Flow Options:\n1. If/Else If/Else Statements\n2. While Loop/For Loops\n3. Switch Statements\n0. Exit to Main Menu";
    //Info and examples
    private final String IFSTATEMENTS = "If statements are used in java to let the system make decisions.  It creates branching programs.  If statements are based on booleans.  If the condition is true then the block of code will execute.  If the statement is false the block of code will be skipped over and the program continues to run.";
    private final String IFSTATEMENTSEXAMPLE = "Example:\nif(condition){\n\tblock of code\n}\n";
    private final String ELSEIFSTATEMENTS = "Else If statements will run if the initial \"if statement\" is false and its own conditions are met. Multiple Else If statements can run in order until a condition is met or it reaches the end of the branch with no conditions met.";
    private final String ELSEIFSTATEMENTSEXAMPLE = "Example:\nif(condition){\n\tblock of code\n}\nelse if(condition){\n\tblock of code\n";
    private final String ELSESTATEMENTS = "Else statements run when the preceding If statements and Else If statements are all false. This will run regardless and does not require a condition.";
    private final String ELSESTATEMENTSEXAMPLE = "Example:\nelse{\n\tblock of code\n}\n";
    private final String WHILELOOPS = "While Loops are a used to continuously execute statements as long as initial condition are still true. The block of code within the loop will continue to run until the condition is false and the loop breaks.";
    private final String WHILELOOPSEXAMPLE = "Example:\nwhile(condition){\n\tstatement(s)\n}\n";
    private final String FORLOOPS = "For Loops are another form of loops. They are similar to While Loops but have three conditions. The first condition initializes the variable, the second condition sets the amount of iterations by limiting the variable value, and the third condition changes the increments at which the variable changes at. For Loops are useful because they have as set amount of iterations whereas While Loops can run forever.";
    private final String FORLOOPSEXAMPLE = "Example:\nfor(int i = 0; i <= 10; i++){\nstatement(s)\n}\n\\\\The statements will run until int i = 10 with each iteration increasing i by 1\n";
    private final String SWITCHSTATEMENT = "Switch Statements are similar to If and Else statements and can achieve the same goal. One of the main differences is that Switch Statements can immediately evaluate to the correct case without having check each condition in sequential order like If and Else statements. Switch Statements can use primitive data types as conditions compared to If and Else Statements that can use complex evaluations as conditions.";
    private final String SWITCHSTATEMENTEXAMPLE = "Example:\nint num = 3;\nString numString;\nswitch(num){\n\tcase 1: numString = 1;\n\t\tbreak;\n\tcase 2: numString = 2;\n\t\tbreak;\n\tcase 3: numString = 3;\n\t\tbreak;\n}\nSystem.out.println(numString);\n\\\\This Switch Statement will print out what ever int num is equal to. The break; statements after each case are required to prevent each statement in the case from falling into the next. Otherwise the statements will run in sequential order after a case is met.\n";

    public ControlFlow() {
        controlFlowStart();
    }

    private void controlFlowStart(){
        while(stayInControl){
            System.out.println(GREETMESSAGE);
            userChoice = scanner.nextInt();
            switch(userChoice){
                case 0:
                    stayInControl = false;
                    break;
                case 1:
                    printIfMessages();
                    break;
                case 2:
                    printLoopMessages();
                    break;
                case 3:
                    printSwitchMessages();
                    break;
            }
        }
    }
    private void printIfMessages(){
        System.out.println(IFSTATEMENTS);
        System.out.println(IFSTATEMENTSEXAMPLE);
        System.out.println(ELSEIFSTATEMENTS);
        System.out.println(ELSEIFSTATEMENTSEXAMPLE);
        System.out.println(ELSESTATEMENTS);
        System.out.println(ELSESTATEMENTSEXAMPLE);
    }
    private void printLoopMessages(){
        System.out.println(WHILELOOPS);
        System.out.println(WHILELOOPSEXAMPLE);
        System.out.println(FORLOOPS);
        System.out.println(FORLOOPSEXAMPLE);
    }
    private void printSwitchMessages(){
        System.out.println(SWITCHSTATEMENT);
        System.out.println(SWITCHSTATEMENTEXAMPLE);
    }
}
