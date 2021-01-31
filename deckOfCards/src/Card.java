public abstract class Card implements Comparable<Card>{

    public abstract String getValue();

    public abstract Suits getSuit();

    public abstract int compareTo(Card c);

    public abstract int getNumberValue();
}
