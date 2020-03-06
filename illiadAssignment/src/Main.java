import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File("illiad.txt"));
        HashSet<Words> set = new HashSet<>();

        while (fileScanner.hasNext()) {
            set.add(new Words(fileScanner.next()));
        }
        Words word = new Words("hello");
        System.out.println(word.getWord());


        //prints all words
       /* Iterator<Words> wordsIterator = set.iterator();
        while (wordsIterator.hasNext()){
            System.out.println(wordsIterator.next().getWord());
        }*/
    }
}
