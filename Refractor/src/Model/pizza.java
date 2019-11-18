package Model;

public class pizza extends items {
    boolean isDelux;

    public pizza(String name, double howMuch) {
        super(name, howMuch);
    }

    @Override
    public double getHowMuch() {
        if (isDelux){
            return getPrice() + 3;
        }
        else{
            return getPrice();
        }
    }
}
