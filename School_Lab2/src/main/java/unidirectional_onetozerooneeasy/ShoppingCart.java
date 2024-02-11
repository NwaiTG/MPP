package unidirectional_onetozerooneeasy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;
    public void addItem(Item item){
        items.add(item);
    }

    //package level (one way navigation).
    //That's why main class should be outside of this package
    ShoppingCart(){
        items = new ArrayList<Item>();
    }

    public List<Item> getItems() {
        return items;
    }
}
