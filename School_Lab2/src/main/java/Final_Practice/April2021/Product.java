package Final_Practice.April2021;

import java.util.Objects;

public class Product implements Cloneable {
    private String productID;
    private String description;
    private String manufacturer;
    private int price;

    // Constructor
    public Product(String productID, String description, String manufacturer, int price) {
        this.productID = productID;
        this.description = description;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    // Getter and setter methods for productID
    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    // Getter and setter methods for description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Getter and setter methods for manufacturer
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    // Getter and setter methods for price
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", description='" + description + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                '}';
//        return String.format("%-8s %-8s %-2s %8.2f",
//                getProductID(), getDescription(), getManufacturer(), getPrice());
    } // end method toString

    public boolean equals(Object obj){
        if(obj == null) return false;
        if(!(obj instanceof Product)) return false;
        Product prod = (Product)obj;
        return productID.equals(prod.productID) && description.equals(prod.description) && manufacturer.equals(prod.manufacturer) && price == prod.price;
    }

    public int hashCode(){
        return Objects.hash(productID, description, manufacturer, price);
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}