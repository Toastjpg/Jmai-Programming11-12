package Tools;

import Model.Items;
import Tools.Time.Time;

import java.util.ArrayList;

public class Order {
    private ArrayList<Items> customerOrder = new ArrayList<>();
    private Customer customer;
    private Time start;
    private Time end;
    boolean deliveryInProgress;
    boolean delivered;

    Order (ArrayList<Items> customerOrder, Time start, Kitchen kitchen, Customer customer){
        this.customer = customer;
        this.start = start;
        end = new Time(start);
        for(int t = 0; t < 20;t++){
            end.tick();
        }
        //if not in inventory add 10 minutes to order
        for (int i = 0; i < customerOrder.size(); i++){
            if (!(kitchen.getInventory().contains(customerOrder.get(i)))){
                for(int j = 0; j < 600; j++){
                    end.tick();
                }
            }
        }
        deliveryInProgress = true;
        delivered = false;
    }

    public boolean isDeliveryInProgress(){
        return deliveryInProgress;
    }

    public void isDelivered(){
        delivered = true;
    }

    public Customer getCustomer(){
        return customer;
    }

    public double getTotalPrice(){
        double total = 0;
        for (Items i : customerOrder){
            total += i.getPrice();
        }
        return total;
    }

    public Time getEndTime(){
        return end;
    }

    public String toString(){
        return customerOrder.toString() + "Start Time: " + start + "End Time: " + end + "Total Price: $" + getTotalPrice();
    }

}
