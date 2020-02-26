import java.util.InvalidPropertiesFormatException;

public class FaceCard extends Card{
    private int value;
    private Suits suit;
    private final String KING = "King";
    private final String QUEEN = "Queen";
    private final String JACK = "Jack";
    private final String INVALID = "Invalid";

    public FaceCard(int value, Suits suit) {
        this.value = value;
        this.suit = suit;
    }

    public String getColor(){
        return suit.getColor();
    }

    @Override
    public String getValue() {
        if (value == 11){
            return JACK;
        }
        else if  (value == 12){
            return QUEEN;
        }
        else if (value == 13){
            return KING;
        }
        else{
            return INVALID;
        }
    }

    @Override
    public Suits getSuit() {
        return suit;
    }

    @Override
    public String toString(){
        return "FaceCard: " + getValue() + " Suit: " + getSuit() + " Color: " + getColor();
    }
}
