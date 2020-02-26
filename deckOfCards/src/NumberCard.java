public class NumberCard extends Card {
    private int value;
    private Suits suit;
    private final String ACE = "Ace";

    public NumberCard(int value, Suits suit){
        this.value = value;
        this.suit = suit;
    }

    public String getColor(){
        return suit.getColor();
    }

    @Override
    public String getValue() {
        if (value == 1){
            return ACE;
        }
        else{
            return Integer.toString(value);
        }
    }

    @Override
    public Suits getSuit() {
        return suit;
    }

    @Override
    public String toString(){
        return "NumberCard: " + getValue() + " Suit: " + getSuit() + " Color: " + getColor() ;
    }
}
