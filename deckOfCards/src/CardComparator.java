import java.util.Comparator;

public class CardComparator implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        if(o1.getSuit().getSuitValue() > o2.getSuit().getSuitValue()){
            return -1;
        }
        else if (o1.getSuit().getSuitValue() < o2.getSuit().getSuitValue()){
            return 1;
        }
        else return 0;
    }
}
