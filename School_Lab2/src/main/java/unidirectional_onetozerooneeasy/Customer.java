package unidirectional_onetozerooneeasy;

public class Customer {
    private String name;
    private ShoppingCart cart;

    public ShoppingCart getCart() {
        return cart;
    }

    public Customer(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void addCart(){
        if(cart == null) cart = new ShoppingCart();
    }
}
