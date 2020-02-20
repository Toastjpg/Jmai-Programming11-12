public enum Suits {
    SPADES("Spades", "Black"),
    HEARTS("Hearts", "Red"),
    CLOVERS("Clover", "Black"),
    DIAMONDS("Diamonds", "Red");

    private final String suit;
    private final String color;

    Suits(String suit, String color){
        this.suit = suit;
        this.color = color;
    }
}
