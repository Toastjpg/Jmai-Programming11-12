import java.util.Scanner;

public class ControlFlow {
    private boolean stayInControl = true;
    private int userChoice;
    Scanner scanner = new Scanner(System.in);
    //Intro message
    private final String GREETMESSAGE = "Control Flow Options:\n1. If/Else If/Else Statements\n2. While Loop/For Loops\n3. Switch Statements\n0. Exit to Main Menu";
    //Info and examples
    private final String IFSTATEMENTS = "If statements are used in java to let the system make decisions.  It creates branching programs.  If statements are based on booleans.  If the condition is true then the block of code will execute.  If the statement is false the block of code will be skipped over and the program continues to run.";
    private final String IFSTATEMENTSEXAMPLE = "Example:\nif(condition){\n\tblock of code\n}";
    private final String FORLOOPS = "FORLOOPSTATEMENTS";
    private final String FORLOOPSEXAMPLE = "FORLOOPEXAMPLE";
    private final String WHILELOOPS = "WHILELOOPS";
    private final String WHILELOOPSEXAMPLE = "WHILELOOPEXAMPLE";
    private final String SWITCHSTATEMENT = "SWITCHSTATEMENT";
    private final String SWITCHSTATEMENTEXAMPLE = "SWITCH EXAMPLE";

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
    }
    private void printLoopMessages(){
        System.out.println(FORLOOPS);
        System.out.println(FORLOOPSEXAMPLE);
        System.out.println(WHILELOOPS);
        System.out.println(WHILELOOPSEXAMPLE);
    }
    private void printSwitchMessages(){
        System.out.println(SWITCHSTATEMENT);
        System.out.println(SWITCHSTATEMENTEXAMPLE);
    }
}
