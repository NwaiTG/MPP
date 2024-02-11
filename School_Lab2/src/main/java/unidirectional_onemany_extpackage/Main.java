package unidirectional_onemany_extpackage;

import unidirectional_onemany.Customer;
import unidirectional_onemany.Order;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Customer cust = new Customer("Bob");
        // Order1
        Order order = cust.addOrder(LocalDate.now());
        order.addItem("Shirt");
        order.addItem("Laptop");
        // Order2
        order = cust.addOrder(LocalDate.now().plusDays(1));
        order.addItem("Pants");
        order.addItem("Knife set");
        System.out.println(cust.getOrders());
        // cannot directly create an Order here
    }
}
