package Final_Practice.April2021;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main{
	public static void main(String[] args){
		try {
			List<Product> list = Arrays.asList(
					new Product("P001", "Laptop", "TechCorp", 1500),
					new Product("P002", "Smartphone", "GadgetWorks", 800),
					new Product("P003", "Smartwatch", "TimeKeepers", 300),
					new Product("P004", "Headphones", "MusicMania", 150)
//					new Product("P005", "Refrigerator", "TechCorp", 1200.00),
//					new Product("P006", "Microwave", "HomeGoods", 200.00),
//					new Product("P007", "Television", "ViewTech", 1000.00),
//					new Product("P007", "Television", "Dell", 10000.00),
//					new Product("P008", "Tablet", "GadgetWorks", 600.00),
//					new Product("P009", "Camera", "StSnapShot", 500.00),
//					new Product("P010", "Speaker", "MusicMania", 350.00)
			);

			Product prod1 = new Product("P001", "Smartphone", "Samsung", 799);
			Product prod2 = new Product("P001", "Smartphone", "Samsung", 799);
			Product prod3 = (Product)prod2.clone();
			System.out.println(prod1.equals(prod2));
			System.out.println(prod2.equals(prod3));
			System.out.println(prod1.equals(prod3));

//			List<Product> list = Arrays.asList(products);

			// a.
			System.out.printf("%nNo.a Average of all prices: %.2f%n",
					list.stream().mapToDouble(Product::getPrice).average().getAsDouble());

			// b.
			System.out.println("\nNo.b All product manufacturers which with 'P'");
			list.stream()
					.filter(prod -> prod.getManufacturer().startsWith("P"))
					.map(Product::getManufacturer)
					.distinct()
					.sorted()
					.forEach(System.out::println);

			// c.
			System.out.printf("%nNo.c Sum of all prices: %.2f%n",
					list.stream().mapToDouble(Product::getPrice).sum());

			// d.
			System.out.println("\nNo.d Dell product which price is more than 40$ 'P'");
			list.stream()
					.filter(prod -> prod.getManufacturer().equals("Dell") && prod.getPrice() > 40)
					.toList()
					.forEach(System.out::println);

			// e.
			System.out.println("\nNo.e(Using forEach) All product with capital letter if manufacturers is start with 'D'");
			list.stream()
					.forEach(prod -> {
						if (prod.getManufacturer().startsWith("D"))
							System.out.println(new Product(
									prod.getProductID(),
									prod.getDescription(),
									prod.getManufacturer().toUpperCase(),
									prod.getPrice()));
						else
							System.out.println(prod);
					});

			System.out.println("\nNo.e(Using Map) All product with capital letter if manufacturers is start with 'D'");
			list.stream()
					.map(prod -> {
						if (prod.getManufacturer().startsWith("D"))
							return new Product(
									prod.getProductID(),
									prod.getDescription(),
									prod.getManufacturer().toUpperCase(),
									prod.getPrice());
						else
							return prod;
					})
					.forEach(System.out::println);

			// f.
			System.out.println("\nNo.f All product are sorted if manufacturers is start with 'L'");
			List<Product> lProducts = list.stream()
					.filter(prod -> prod.getManufacturer().startsWith("T"))
					.sorted(Comparator.comparing(Product::getManufacturer))
					.toList();

			List<Product> otherProds = list.stream()
					.filter(prod -> !prod.getManufacturer().startsWith("T"))
					.toList();

			Stream.concat(lProducts.stream(), otherProds.stream())
					.forEach(System.out::println);

			// g.
			System.out.println("\nNo.g Product start with 'D', 'H' then all:");
			List<Product> dProd = list.stream()
									.filter(prod -> prod.getManufacturer().startsWith("D"))
									.toList();

			List<Product> hProd = list.stream()
										.filter(prod -> prod.getManufacturer().startsWith("H"))
										.toList();
			List<Product> otherProd = list.stream().filter(prod -> !prod.getManufacturer().startsWith("D") && !prod.getManufacturer().startsWith("H")).toList();

			Stream<Product> dhProds = Stream.concat(dProd.stream(), hProd.stream());
			Stream.concat(dhProds, otherProd.stream())
					.forEach(System.out::println);

			// h.
			System.out.println("\nNo.h Product start with 'St', Capitalize name:");
			List<Product> prods = list.stream()
					.map(prod -> {
						if (prod.getManufacturer().contains("St"))
							return new Product(
									prod.getProductID(),
									prod.getDescription(),
									prod.getManufacturer().toUpperCase(),
									prod.getPrice());
						else
							return prod;
					})
					.toList();

			prods.forEach(System.out::println);

			// i.
			System.out.println("\nNo.i Product with 1 string:");
			String str = list.stream()
					.map(Product::toString)
					.collect(Collectors.joining("*****"));

			String s2 = str;
			System.out.println(s2);

			// j.
			System.out.println("\nNo.J All Product with capitalization of 3rd character:");
			list.stream()
					.map(prod -> {
						if(prod.getDescription().length() > 3){
							char[] charArr = prod.getDescription().toCharArray();
							charArr[2] = Character.toUpperCase(charArr[2]);
							prod.setDescription(String.valueOf(charArr));
						}
						return prod;
					})
					.forEach(System.out::println);

			list.stream()
					.map(prod -> {
						if(prod.getDescription().length() > 3){
							char[] charArr = prod.getDescription().toCharArray();
							charArr[2] = Character.toUpperCase(charArr[2]);
							prod.setDescription(String.valueOf(charArr));
						}
						return prod;
					})
					.forEach(System.out::println);


		}
		catch (CloneNotSupportedException e){
			e.getMessage();
		}
	}
}