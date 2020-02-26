import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Card> deck = new LinkedList<>();

        for (int i = 1; i < 11; i++){
            deck.add(new NumberCard(i, Suits.SPADES));
            deck.add(new NumberCard(i, Suits.HEARTS));
            deck.add(new NumberCard(i, Suits.CLOVERS));
            deck.add(new NumberCard(i, Suits.DIAMONDS));
        }

        for (int i = 11; i < 14; i++){
            deck.add(new FaceCard(i, Suits.SPADES));
            deck.add(new FaceCard(i, Suits.HEARTS));
            deck.add(new FaceCard(i, Suits.CLOVERS));
            deck.add(new FaceCard(i, Suits.DIAMONDS));
        }

        for (Card i : deck){
            System.out.println(i.toString());
        }
    }
}
