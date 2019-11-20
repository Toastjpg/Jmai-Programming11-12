package Model;

public class Pasta extends items{
    boolean isDelux;

    public Pasta(String name, double price, boolean delux){
        super(name, price);
        isDelux = delux;
    }
//Adds $2 to price if it is delux
    @Override
    public double getHowMuch() {
        if (isDelux){
            return getPrice() + 2;
        }
        else{
            return getPrice();
        }
    }
}
