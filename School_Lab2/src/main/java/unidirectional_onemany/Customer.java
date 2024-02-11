package unidirectional_onemany;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Order> orders;
    public Customer(String name){
        this.name = name;
        orders = new ArrayList<Order>();
    }
    public Order addOrder(LocalDate orderDate){
        Order ord = new Order(orderDate);
        // adding item to the list
        orders.add(ord);
        return ord;
    }
    public String getName(){
        return name;
    }
    public List<Order> getOrders(){
        return orders;
    }
}
