import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new File("illiad.txt"));
        HashSet<Words> wordsHashSet = new HashSet<>();

        while (fileScanner.hasNext()) {
            wordsHashSet.add(new Words(fileScanner.next()));
        }

        Iterator<Words> wordsIterator = wordsHashSet.iterator();
        while (wordsIterator.hasNext()){
            System.out.println(wordsIterator.next());
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("Number of Unique Words: " + wordsHashSet.size());
    }
}
