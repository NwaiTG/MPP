package oneone_unidirection_extpackage;

import oneone_unidirection.Customer;
import oneone_unidirection.Item;
import oneone_unidirection.ShoppingCart;

public class Main {
    public static void main(String args[]){
        Customer cust = new Customer("Bob");
        cust.getCart().addItem(new Item("Shirt"));
        cust.getCart().addItem(new Item("Ipad"));
        System.out.println(cust.getCart().getItems());

        //cannot create a ShoppingCart from here: compiler error
        //ShoppingCart newCart = new ShoppingCart();
        ShoppingCart bobsCart = cust.getCart();
        bobsCart.addItem(new Item("Pants"));
        System.out.println(cust.getCart().getItems());
    }
}
