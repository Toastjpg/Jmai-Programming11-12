public enum Month {
    JANUARY("January", 31),
    FEB

    private final String name;
    private final int dayOfMonth;

    Month(String name, int dayOfMonth){
        this.name = name;
        this.dayOfMonth = dayOfMonth;
    }
}
