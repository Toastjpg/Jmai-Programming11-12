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

    public static String problemThree(String s){
        ArrayList tempString = new ArrayList();
        ArrayList returnString = new ArrayList();
        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i) >= s.charAt(i - 1)){
                tempString.add(s.charAt(i - 1));
            }
            else if (s.charAt(i) < s.charAt(i - 1)){
                tempString.add(s.charAt(i - 1));
                if (tempString.size() > returnString.size()){
                    returnString.clear();
                    returnString.addAll(tempString);
                }
                tempString.clear();
            }
            if (i == s.length() - 1){
                tempString.add(s.charAt(i));
                if (tempString.size() > returnString.size()){
                    returnString.clear();
                    returnString.addAll(tempString);
                }
                tempString.clear();
            }
        }
        StringBuilder string = new StringBuilder();
        for (int k = 0; k < returnString.size(); k++){
            string.append(returnString.get(k));
        }
        return string.toString();
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
        System.out.println("Problem #3: " + problemThree(s));
    }
}
