package Final_Practice.April2021.Mohar;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Product {

    private String productID;
    private String description;
    private String manufacturer;
    private double price;

    public Product(String productID, String description, String manufacturer, double price) {
        this.productID = productID;
        this.description = description;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getProductID() {
        return productID;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", description='" + description + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                '}';
    }


   public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("P001", "Laptop", "TechCorp", 1500.00),
            new Product("P002", "Smartphone", "GadgetWorks", 800.00),
            new Product("P003", "Smartwatch", "TimeKeepers", 300.00),
            new Product("P004", "Headphones", "MusicMania", 150.00),
            new Product("P005", "Refrigerator", "TechCorp", 1200.00),
            new Product("P006", "Microwave", "HomeGoods", 200.00),
            new Product("P007", "Television", "ViewTech", 1000.00),
            new Product("P007", "Television", "Dell", 10000.00),
            new Product("P008", "Tablet", "GadgetWorks", 600.00),
            new Product("P009", "Camera", "StSnapShot", 500.00),
            new Product("P010", "Speaker", "MusicMania", 350.00)
        );

        System.out.println("\nAnswer a\n");
        System.out.printf("The average price is %.2f %n",
            products.stream()
                .mapToDouble(Product::getPrice)
                .average()
                .getAsDouble()
        );

        System.out.println("\nAnswer b\n");
        products.stream()
            .map(Product::getManufacturer)
            .filter(p -> p.startsWith("M"))
            .distinct()
            .collect(Collectors.toList())
            .forEach(System.out::println);


        System.out.println("\nAnswer c\n");
        System.out.printf("The total price is %.2f",
        products.stream()
            .mapToDouble(Product::getPrice)
            .reduce(0, (a, b) -> a + b)
        );
        
        System.out.println("\nAnswer d\n");
        products.stream()
            .filter((Product p) -> p.getManufacturer().equals("Dell"))
            .filter((Product p) -> p.getPrice()>40)
            .collect(Collectors.toList())
            .forEach(System.out::println);


        System.out.println("\nAnswer e\n");
        products.stream()
            .map((Product p) -> new Product(
                p.getProductID(), 
                p.getDescription(),
                (p.getManufacturer().startsWith("D") ? (p.getManufacturer().toUpperCase()):(p.getManufacturer())), 
                p.getPrice()
            ))
            .collect(Collectors.toList())
            .forEach(System.out::println);


        System.out.println("\nAnswer f solution 2\n");
        products.stream()
            .sorted(Comparator.comparing((Product p) -> p.getManufacturer().startsWith("T")).reversed())
            .collect(Collectors.toList())
            .forEach(System.out::println);


        System.out.println("\nAnswer g\n");
        products.stream()
            .sorted(Comparator
                .comparing((Product p) -> p.getManufacturer().startsWith("H"))
                .thenComparing((Product p) -> p.getManufacturer().startsWith("D")).reversed()
            )
            .collect(Collectors.toList())
            .forEach(System.out::println);


        System.out.println("\nAnswer h\n");
        products.stream()
            .map((Product p) -> new Product(
                p.getProductID(), 
                p.getDescription(),
                (p.getManufacturer().startsWith("St") ? (p.getManufacturer().toUpperCase()):(p.getManufacturer())), 
                p.getPrice()
            ))
            .collect(Collectors.toList())
            .forEach(System.out::println);

        System.out.println("\nAnswer i\n");
        String s2 = products.stream()
            .map(Product::toString)
            .collect(Collectors.joining("*****"));
        System.out.println(s2);

        System.out.println("\nAnswer j\n");
        products.stream()
            .forEach(p -> {
                String description = p.getDescription();
                if (description.length() >= 3) {
                    description = description.substring(0, 2)
                                + Character.toUpperCase(description.charAt(2))
                                + description.substring(3);
                    p.setDescription(description);
                }
            });
        products.forEach(System.out::println);
    }


}
