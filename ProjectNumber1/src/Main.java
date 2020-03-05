import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    static int problemOne(String s){
        int answer = 0;
        ArrayList characters = new ArrayList();
        for (int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            characters.add(x);
            if ( x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
                answer++;
            }
        }
        return answer;
    }

    static int problemTwo(String s){
        int answer = 0;
        ArrayList<String> characters = new ArrayList<>(Arrays.asList(s.split("")));
        for (int i = 0; i < s.length() - 2; i++){
            if (characters.get(i).equals("b") && characters.get(i + 1).equals("o") && characters.get(i + 2).equals("b")){
                answer++;
            }
        }
        return answer;
    }

    static String problemThree(String s){
        return s;
    }

    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        String s = "azcbobobegghakl";
        System.out.println("Problem #1: " + problemOne(s));
        System.out.println("Problem #2: " + problemTwo(s));
    }
}
