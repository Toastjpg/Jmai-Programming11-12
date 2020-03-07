import java.util.Comparator;

public class WordsComparator implements Comparator<Words> {

    @Override
    public int compare(Words words, Words t1) {
        if (words.getWord().equals(t1.getWord())){
            return 0;
        }
        return 1;
    }
}
