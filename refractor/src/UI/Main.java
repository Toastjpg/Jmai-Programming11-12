package UI;

import Model.Items;
import Model.Pasta;
import Model.Pizza;
import Model.Sandwich;
import Tools.Customer;
import Tools.Kitchen;
import Tools.Order;
import Tools.Time.Time;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Initializes the time
        Time time = new Time();

        //Creates the kitchen and creates inventory items
        Kitchen kitchen = new Kitchen("Restaurant");
        kitchen.startCooking();

        //Adds items to the customer's order
        ArrayList<Items> firstOrder = new ArrayList<>();
        firstOrder.add(new Pizza("Pepperoni Pizza", 10.0, false));
        firstOrder.add(new Pasta("Spaghetti", 15.0, true));
        firstOrder.add(new Sandwich("Sandwich", Sandwich.Size.MEDIUM));

        //Creates customer's order and gets his name, address, order, total price, and end time
        Order order = new Order(firstOrder, time, kitchen, new Customer("Jason Mai","1234 Main St."));
        System.out.println(order.getCustomer());
        System.out.println(order.getCustomerOrder());
        System.out.println(order.getTotalPrice());
        System.out.println(order.getEndTime());
        System.out.println(order.isDeliveryInProgress());
        order.isDelivered();

    }
}
