package Model;

public class pasta extends items{
    boolean isDelux;

    pasta(String name, double price, boolean delux){
        super(name, price);
        isDelux = delux;
    }

    @Override
    public double getHowMuch() {
        //if delux add 2 bucks
        return 0;
    }
}
