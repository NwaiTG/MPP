package Clone_Test;

public class Address implements Cloneable{
    private String city;
    private String country;

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Perform a shallow copy for simplicity in this example
        return super.clone();
    }
}
