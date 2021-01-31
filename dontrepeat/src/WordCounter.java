import java.util.List;

public class WordCounter {

    public static int countLongWords (List<String> words, int longWordLength){
        int n = 0;
        String longestWord = "";
        for (String word : words){
            if (word.length() > longWordLength) ++n;
            if (word.length() > longestWord.length()) longestWord = word;
        }
        return n;
    }
}
