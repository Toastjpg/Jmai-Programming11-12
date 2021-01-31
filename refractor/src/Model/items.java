package Model;

public abstract class Items {
    private String name;
    private double howMuch;

    public Items(String name, double howMuch) {
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

    public double getPrice(){
        return howMuch;
    }
}
