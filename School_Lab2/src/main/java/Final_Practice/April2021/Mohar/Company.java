package Final_Practice.April2021.Mohar;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
 
        System.out.println("\nAnswer a\n");       
        List<String> citiesStartingWithM = companies.stream()
            .map(Company::getCompanyCity) // Extract the city names
            .filter(city -> city.startsWith("M")) // Filter cities that start with 'M'
            .distinct() // Remove duplicates
            .sorted() // Sort the cities
            .collect(Collectors.toList()); // Collect into a list

        citiesStartingWithM.forEach(System.out::println); // Print the cities


        System.out.println("\nAnswer b\n"); 
        System.out.printf("The avreage profit is %.2f%n",
            companies.stream()
                .mapToDouble(Company::getTotalProfit) // Extracts the totalProfit from each Company
                .average()
                .getAsDouble()
        );


        System.out.println("\nAnswer c\n"); 
        System.out.printf("The total profit is %.2f%n",
            companies.stream()
                .mapToDouble(Company::getTotalProfit) // Converts each Company to its totalProfit
                .reduce(0.0, (a, b) -> a + b)
        ); 


        System.out.println("\nAnswer d\n"); 
        companies.stream()
            .map(company -> {
                if (company.getCompanyCity().startsWith("T")) {
                    return new Company(
                        company.getCompanyName(),
                        company.getCompanyCity().toUpperCase(),
                        company.getCompanyState(),
                        company.getTotalProfit()
                    );
                } else {
                    return company;
                }
            })
            .forEach(System.out::println);


        System.out.println("\nAnswer e\n");
        companies.stream()
            .filter(company -> company.getCompanyState().equals("Nebraska") && company.getTotalProfit() > 400000)
            .collect(Collectors.toList())
            .forEach(System.out::println);

            
        System.out.println("\nAnswer f\n");
        companies.stream()
            .sorted(Comparator.comparing((Company c) -> c.getCompanyState().startsWith(""+'D')).reversed())
            .forEach(System.out::println);


        System.out.println("\nAnswer g\n");
        companies.stream()
            .map(company -> {
                if (company.getCompanyCity().startsWith("Mt")) {
                    return new Company(
                        company.getCompanyName(),
                        company.getCompanyCity().toUpperCase(),
                        company.getCompanyState(),
                        company.getTotalProfit()
                    );
                } else {return company;}
            })
            .collect(Collectors.toList())
            .forEach(System.out::println);


        System.out.println("\nAnswer h\n");
        companies.stream()
            .sorted(Comparator
                .comparing((Company c) -> c.getCompanyCity().startsWith("C"))
                .thenComparing((Company c) -> c.getCompanyCity().startsWith("H")).reversed()
            )
            .collect(Collectors.toList())
            .forEach(System.out::println);





    }
}
