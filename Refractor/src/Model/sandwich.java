package Model;

public class Sandwich extends items{

    public enum Size{
        SMALL(6.5), MEDIUM(8.0), LARGE(10.5);
        private double price;

        Size(double d){
            price = d;
        }
        double getPrice(){
            return price;
        }
    }
    Size size;

    public Sandwich(String name, Size size){
        super(name, size.getPrice());
        this.size = size;
    }

    @Override
    public double getHowMuch() {
        return getPrice();
    }
}
