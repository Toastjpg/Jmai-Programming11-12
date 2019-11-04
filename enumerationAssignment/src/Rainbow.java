public enum Rainbow {
    RED ("Red", 1),
    ORANGE ("Orange", 2),
    YELLOW ("Yellow", 3),
    GREEN ("Green", 4),
    BLUE ("Blue", 5),
    INDIGO ("Indigo", 6),
    PURPLE ("Purple", 7);

    private String name;
    private int rainbowColorNumber;

    Rainbow(String name, int rainbowColorNumber){
        this.name = name;
        this.rainbowColorNumber= rainbowColorNumber;
    }
    private final int numberOfColors = 7;

    public String getName(){
        return name;
    }
    public int getRainbowColorNumber(){
        return rainbowColorNumber;
    }
}
