public enum Suits {
    SPADES("Spades", "Black"),
    HEARTS("Hearts", "Red"),
    CLOVERS("Clovers", "Black"),
    DIAMONDS("Diamonds", "Red");

    private final String suit;
    private final String color;

    Suits(String suit, String color){
        this.suit = suit;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getSuitValue(){
        if (suit.equals("Spades")){
            return 3;
        }
        else if (suit.equals("Hearts")){
            return 2;
        }
        else if (suit.equals("Clovers")){
            return 1;
        }
        else{
            return 0;
        }
    }
}
