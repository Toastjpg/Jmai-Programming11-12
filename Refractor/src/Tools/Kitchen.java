package Tools;

import Model.Items;
import Model.Pasta;
import Model.Pizza;
import Model.Sandwich;

import java.util.ArrayList;

public class Kitchen {
    private String name;
    private ArrayList<Items> inventory = new ArrayList<>();

    //Requires: String name
    //Modifies:
    //Effects: Sets kitchen name and initializes cooking
    public Kitchen(String name){
        this.name = name;
        startCooking();
    }

    //Requires:
    //Modifies:
    //Effects: creates each item 5 times
    public void startCooking(){
        for(int i = 0 ; i< 5;i++){
            makePizza();
            makePasta();
            makeSandwich();
        }
    }

    //Requires:
    //Modifies:
    //Effects: adds a $10.0 non-deluxe pizza to inventory
    private void makePizza() {
        inventory.add(new Pizza("Pizza", 10.0, false));
    }
    //Requires:
    //Modifies:
    //Effects: adds a $15.0 non-deluxe pasta to inventory
    private void makePasta(){
        inventory.add(new Pasta("Pasta", 15.0, false));
    }
    //Requires:
    //Modifies:
    //Effects: adds a small sandwich to inventory
    private void makeSandwich(){
        inventory.add(new Sandwich("Sandwich", Sandwich.Size.SMALL));
    }

    public ArrayList<Items> getInventory(){
        return inventory;
    }
}
