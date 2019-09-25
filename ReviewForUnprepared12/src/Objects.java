import java.util.Scanner;

public class Objects {
    private boolean stayInObjects = true;
    private int userChoice;
    Scanner scanner = new Scanner(System.in);

    private void objectsStart(){
        while (stayInObjects){
            System.out.println("Hello");
            userChoice = scanner.nextInt();
            switch (userChoice){
                case 0:
                    stayInObjects = false;
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
