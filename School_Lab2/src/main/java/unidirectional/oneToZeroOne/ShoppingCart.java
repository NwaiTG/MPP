package unidirectional.oneToZeroOne;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;
    public void addItem(Item item){
        items.add(item);
    }

    /**
     * Use a factory method for construction
     */
    private ShoppingCart(Customer cust){
        items = new ArrayList<Item>();
        cust.setCart(this);
    }

    /**
     * If the constructor is private,
     * to get the object of that class make use of static factory
     */
    public static ShoppingCart newShoppingCart(Customer cust){
        // Without customer you cannot assign shopping cart
        if(cust == null)
            throw new NullPointerException("Null Customer");
        return new ShoppingCart(cust);
    }
    public List<Item> getItems() {
        return items;
    }
}
