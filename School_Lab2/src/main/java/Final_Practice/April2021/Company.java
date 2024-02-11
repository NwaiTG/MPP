package Final_Practice.April2021;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Company {
    private String companyName;
    private String companyCity;
    private String companyState;
    private double totalProfit;

    public Company(String companyName, String companyCity, String companyState, double totalProfit) {
        this.companyName = companyName;
        this.companyCity = companyCity;
        this.companyState = companyState;
        this.totalProfit = totalProfit;
    }
 // Getters
    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyCity() {
        return companyCity;
    }

    public String getCompanyState() {
        return companyState;
    }

    public double getTotalProfit() {
        return totalProfit;
    }

    // Setters
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCompanyCity(String companyCity) {
        this.companyCity = companyCity;
    }

    public void setCompanyState(String companyState) {
        this.companyState = companyState;
    }

    public void setTotalProfit(double totalProfit) {
        this.totalProfit = totalProfit;
    }

    // Optional: toString method for easy printing of Company objects
    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", companyCity='" + companyCity + '\'' +
                ", companyState='" + companyState + '\'' +
                ", totalProfit=" + totalProfit +
                '}';
    }

    public static void main(String[] args) {
        List<Company> companies = Arrays.asList(
            new Company("Tech Innovations", "Miami", "DFlorida", 500000.00),
            new Company("Green Energy Solutions", "Nebraska", "Nebraska", 750000.00),
            new Company("Bright Future Solar", "Countain View", "California", 1200000.00),
            new Company("Smart Home Tech", "Seattle", "Washington", 600000.00),
            new Company("Gadget Makers", "Manhattan", "New York", 800000.00),
            new Company("Eco Friendly Tech", "Miami", "Florida", 450000.00),
            new Company("Future Robotics", "Madison", "Wisconsin", 300000.00),
            new Company("Data Driven Labs", "Nebraska", "Nebraska", 9000000.00),
            new Company("Cloud Computing Services", "Hiami", "Florida", 700000.00),
            new Company("AI Innovations", "Mtunich", "Davaria", 1500000.00)
        );

        System.out.println("\nAnswer a");
        System.out.println("\nCompany city begin with 'M', No duplicate & order: \n");
        companies.stream()
                .filter(com -> com.getCompanyCity().startsWith("M"))
                .map(Company::getCompanyCity)
                .sorted()
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("\nAnswer b");
        System.out.printf("%nThe average of totalProfit for this year: %.2f\n",
                companies.stream()
                        .mapToDouble(Company::getTotalProfit)
			            .average()
                        .getAsDouble()
		);

        System.out.println("\nAnswer c");
        System.out.printf("%nSum of totalProfit with reduce: %.2f\n",
                companies.stream()
                        .mapToDouble(Company::getTotalProfit)
			            .reduce(0.00, (x,y) -> x + y)
		);

        System.out.println("\nAnswer d");
        System.out.println("Company and capitalize city 'T': \n");
        companies.stream()
                .forEach(com -> {
                    if(com.getCompanyCity().startsWith("T")){
                        System.out.println(new Company(
                                com.getCompanyName(),
                                com.getCompanyCity().toUpperCase(),
                                com.getCompanyState(),
                                com.getTotalProfit()
                        ));
                    }
                    else{
                        System.out.println(com);
                    }
                });

        System.out.println("\nAnswer e");
        System.out.println("\nList of Company whose state is 'Nebraska': \n");
        List<Company> comNebraska = companies.stream()
                .filter(com -> com.getCompanyState().equals("Nebraska") && com.getTotalProfit() > 4000000)
                .collect(Collectors.toList());

        comNebraska.forEach(System.out::println);

        System.out.println("\nAnswer f");
        System.out.println("\nAll company whose state begin wtih 'D' is above: \n");
        companies.stream()
                .sorted(Comparator.comparing((Company com) -> com.getCompanyState().startsWith("D")).reversed())
                .forEach(System.out::println);
//        companies.stream()
//                .sorted(Comparator.comparing((Company c) -> c.getCompanyState().startsWith(""+'D')).reversed())
//                .forEach(System.out::println);

        System.out.println("\nAll company whose state begin wtih 'D' is above(concat): \n");
        List<Company> dcompanies = companies.stream()
                .filter(com -> com.getCompanyState().startsWith("D"))
                .collect(Collectors.toList());

        List<Company> otherCom = companies.stream()
                .filter(com -> !com.getCompanyState().startsWith("D"))
                .collect(Collectors.toList());

        Stream.concat(dcompanies.stream(), otherCom.stream())
                .toList()
                .forEach(System.out::println);

        System.out.println("\nAnswer g");
        System.out.println("\nAll company whose state begin wtih 'Ma': \n");
        List<Company> comList = companies.stream()
                .map(com -> {if(com.getCompanyCity().startsWith("Ma")){
                    return new Company(
                        com.getCompanyName(),
                        com.getCompanyState(),
                        com.getCompanyCity().toUpperCase(),
                        com.getTotalProfit()
                    );
                    }else{
                        return com;
                    }})
				.toList();

        comList.forEach(System.out::println);

        System.out.println("\nAnswer h");
        System.out.println("\nAll company whose city begin wtih 'C', 'H' sort: \n");
        companies.stream()
                .sorted(Comparator.comparing(com -> ((Company)com).getCompanyCity().startsWith("C"))
                        .thenComparing(com -> ((Company)com).getCompanyCity().startsWith("H")).reversed())
                .forEach(System.out::println);





    }
}
