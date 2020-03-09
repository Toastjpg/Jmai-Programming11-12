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
            wordsHashSet.add(new Words(fileScanner.nextLine()));
        }

        WordsComparator wordsComparator = new WordsComparator();

        Iterator<Words> wordsIterator = wordsHashSet.iterator();
        while (wordsIterator.hasNext()){
            System.out.println(wordsIterator.next());
        }
    }
}
