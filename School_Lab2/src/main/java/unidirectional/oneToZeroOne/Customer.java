package unidirectional.oneToZeroOne;

public class Customer {
    private String name;
    private ShoppingCart cart;

    public Customer(String name){
        this.name = name;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }

    public ShoppingCart getCart() {
        return cart;
    }
    public String getName(){
        return name;
    }
}
