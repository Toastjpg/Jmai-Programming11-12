package Tools;

import Model.items;
import Model.pasta;
import Model.pizza;
import Model.sand;

import java.util.ArrayList;

public class mainthing {
    private String name;
    private ArrayList<Customer> ppl = new ArrayList<>();
    private ArrayList<Order> ordds = new ArrayList<>();
    private ArrayList<items> invent = new ArrayList<>();

    public mainthing(String name){
        this.name = name;
        startStuff();
    }

    public void startStuff(){
        for(int i = 0 ; i< 5;i++){
            makePizza();
            makePasta();
            makesand();
        }
    }

    private void makePizza() {
        invent.add(new pizza());
    }
    private void makePasta(){
        invent.add(new pasta());
    }
    private void makesand(){
        invent.add(new sand());
    }
}
