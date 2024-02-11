package unidirectional_onetozerooneeasy_extpackage;

import unidirectional_onetozerooneeasy.Customer;
import unidirectional_onetozerooneeasy.Item;
import unidirectional_onetozerooneeasy.ShoppingCart;

public class Main {
    public static void main(String args[]){
        Customer cust = new Customer("Bob");
        // Create ShoppingCart
        cust.addCart();
        cust.getCart().addItem(new Item("Shirt"));
        cust.getCart().addItem(new Item("Ipad"));
        System.out.println(cust.getCart().getItems());

        //cannot create a ShoppingCart from here: compiler error
        ShoppingCart bobsCart = cust.getCart();
        bobsCart.addItem(new Item("Pants"));
        System.out.println(cust.getCart().getItems());
    }
}
