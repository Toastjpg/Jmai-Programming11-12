package Model;

public class Pizza extends Items {
    boolean isDelux;

    public Pizza(String name, double howMuch, boolean delux) {
        super(name, howMuch);
        isDelux = delux;
    }
//Adds $3 to price if it is delux
    @Override
    public double getHowMuch() {
        if (isDelux){
            return getPrice() + 3;
        }
        else{
            return getPrice();
        }
    }

    public String toString() {
        return "Name: " + super.getName() + " Price: " +  getPrice();
    }
}
