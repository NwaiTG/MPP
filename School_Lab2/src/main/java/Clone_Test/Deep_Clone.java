package Clone_Test;

public class Deep_Clone implements Cloneable{
    private String name;
    private Address address;

    public Deep_Clone(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Perform a deep copy
        Deep_Clone clonedPerson = (Deep_Clone) super.clone();
        // Clone the Address object as well
//        clonedPerson.address = (Address) address.clone();
        return clonedPerson;
    }
}
