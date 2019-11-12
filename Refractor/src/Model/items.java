package Model;

public abstract class items{
    private String name;
    private double howMuch;

    public items(String name, double howMuch) {
        this.name = name;
        this.howMuch = howMuch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getHowMuch();

}
