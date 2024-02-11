package Clone_Test;

public class Deep_Clone_Main {
    public static void main(String[] args) {
        try {
            // Creating an original Person object with an Address
            Address originalAddress = new Address("City1", "Country1");
            Deep_Clone originalPerson = new Deep_Clone("John", originalAddress);

            // Creating a deep copy of the original Person
            Deep_Clone clonedPerson = (Deep_Clone) originalPerson.clone();

            // Modifying the original Person's Address
            originalPerson.getAddress().setCity("City2");
            clonedPerson.getAddress().setCity("City3");

            // Checking if the clone reflects the changes
            System.out.println("Original City: " + originalPerson.getAddress().getCity());  // City2
            System.out.println("Cloned City: " + clonedPerson.getAddress().getCity());      // City1 (unchanged)
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
