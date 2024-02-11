package unidirectional.oneToZeroOne_extpackage;

import unidirectional.oneToZeroOne.Customer;
import unidirectional.oneToZeroOne.ShoppingCart;
import unidirectional.oneToZeroOne.Item;

public class Main {
    public static void main(String args[]){
        Customer cust = new Customer("Bob");
        // Create ShoppingCart (one -> one unidirection)
        ShoppingCart cart = ShoppingCart.newShoppingCart(cust);
        cart.addItem(new Item("Shirt"));
        cart.addItem(new Item("Ipad"));
        System.out.println(cart.getItems());

//        //cannot create a ShoppingCart from here: compiler error
//        ShoppingCart bobsCart = cust.getCart();
//        bobsCart.addItem(new Item("Pants"));
//        System.out.println(cust.getCart().getItems());
    }
}
