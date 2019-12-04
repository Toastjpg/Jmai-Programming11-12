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

    //Requires: ArrayList, Time, Kitchen, Customer
    //Modifies: this
    /*Effects:
    adds items from items ArrayList to customerOrder ArrayList
    starts the time
    adds 20 seconds to time
    if the item in the customerOrder is not in the inventory, 10 minutes is added to time
    */
    public Order(ArrayList<Items> items, Time start, Kitchen kitchen, Customer customer){
        this.customer = customer;
        customerOrder = items;
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

    //Requires:
    //Modifies:
    //Effects: sets the delivered boolean to true
    public void isDelivered(){
        delivered = true;
    }

    public Customer getCustomer(){
        return customer;
    }

    public ArrayList<Items> getCustomerOrder() {
        return customerOrder;
    }

    public Time getEndTime(){
        return end;
    }

    //Requires:
    //Modifies:
    //Effects: adds the price of each item in the customerOrder ArrayList to a total
    public double getTotalPrice(){
        double total = 0;
        for (Items i : customerOrder){
            total += i.getPrice();
        }
        return total;
    }
}
