package Tools;

import Model.items;
import Model.Pasta;
import Model.Pizza;
import Model.Sandwich;

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
            makeSandwich();
        }
    }

    private void makePizza() {
        inventory.add(new Pizza("Pizza", 10.0, false));
    }
    private void makePasta(){
        inventory.add(new Pasta("Pasta", 15.0, false));
    }
    private void makeSandwich(){
        inventory.add(new Sandwich("Sandwich", Sandwich.Size.SMALL));
    }
}
