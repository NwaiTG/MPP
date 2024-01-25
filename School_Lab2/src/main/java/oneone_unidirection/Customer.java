package oneone_unidirection;

public class Customer {
    private String name;
    private ShoppingCart cart;
    public Customer(String name){
        this.name = name;
        // Create ShoppingCart at the constructor
        cart = new ShoppingCart(); // one to one association
    }

    public String getName() {
        return name;
    }

    // there is no setter, because ShoppingCart is created only one
    public ShoppingCart getCart() {
        return cart;
    }
}
