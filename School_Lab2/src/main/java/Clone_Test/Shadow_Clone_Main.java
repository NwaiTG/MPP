package Clone_Test;

public class Shadow_Clone_Main {
    public static void main(String[] args) {
        try {
            Shadow_Clone original = new Shadow_Clone(42);

            // Using clone() to create a shallow copy
            Shadow_Clone cloned = (Shadow_Clone) original.clone();

            // Modifying the original object
            original.setValue(99);

            // Checking if the clone reflects the changes
            System.out.println("Original value: " + original.getValue());  // 99
            System.out.println("Cloned value: " + cloned.getValue());      // 42 (unchanged)
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
