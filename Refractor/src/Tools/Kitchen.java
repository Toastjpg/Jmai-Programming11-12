package Tools;

import Model.items;
import Model.pasta;
import Model.pizza;
import Model.sandwich;

import java.util.ArrayList;

public class Kitchen {
    private String name;
    private ArrayList<Customer> customer = new ArrayList<>();
    private ArrayList<Order> order = new ArrayList<>();
    private ArrayList<items> inventory = new ArrayList<>();

    public Kitchen(String name){
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
        inventory.add(new pizza());
    }
    private void makePasta(){
        inventory.add(new pasta());
    }
    private void makesand(){
        inventory.add(new sandwich());
    }
}
