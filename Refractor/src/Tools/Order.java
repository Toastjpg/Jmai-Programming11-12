package Tools;

import Model.Items;
import Tools.Time.Time;

import java.util.ArrayList;

public class Order {
    ArrayList<Items> customerOrder;
    Time start;
    Time end;

    Order(ArrayList<Items> customerOrder, Time start, Kitchen kitchen){
        this.start = start;
        end = new Time(start);
        //if not in inventory add 10 minutes to order
        for (int i = 0; i < customerOrder.size(); i++){
            if (!(kitchen.getInventory().contains(customerOrder.get(i)))){
                for(int j = 0; j < 600; j++){
                    end.tick();
                }
            }
        }
    }

    public double getTotalPrice(){
        double total = 0;
        for (Items i : customerOrder){
            total += i.getPrice();
        }
        return total;
    }

    public String toString(){
        return customerOrder.toString() + "Start Time: " + start + "End Time: " + end + "Total Price: $" + getTotalPrice();
    }

}
