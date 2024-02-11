package unidirectional_onemany;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDate orderDate;
    private List<Item> items;
    Order(LocalDate orderDate){
        this.orderDate = orderDate;
        items = new ArrayList<Item>();
    }
    public void addItem(String name){
        items.add(new Item(name));
    }
    public String toString(){
        return orderDate + ": " + items.toString();
    }
}
