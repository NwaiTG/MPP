package Lab3_Mailing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

    public static double getDouble() throws IOException // reads an double from the keyboard input
    {
        String s = getString();
        return (Double.valueOf(s)).doubleValue();
    }

    public static String getString() throws IOException {  //reads a string from the keyboard input
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
    public static void putText(String s){ //writes string s to the screen
        System.out.println(s);
    }

    public static void calLowestPrice(Package pkg, List<ICarrier> carriers){
        double lowestPrice = Double.MAX_VALUE;
        double price = 0.00;
        String carrierName = "";
        for(ICarrier carrier : carriers){
            price = carrier.calRate(pkg.weight, pkg.zone);
            if(price < lowestPrice){
                lowestPrice = price;
                carrierName = carrier.getClass().getSimpleName();
            }
        }

        System.out.print(String.format("%s\t", pkg.desc) + String.format("$%,.2f\t", lowestPrice) + String.format("%s", carrierName)  + "\n");
    }
    public static void main(String[] args){
        putText("Enter Package information: Description, Quantity And Zone. ");
        //String input = getString();

        List<ICarrier> carriers = List.of(new UPS(), new USMail(), new FedEx());
        List<Package> packages = List.of(
                new Package("Book", 2, "IA"),
                new Package("Phone", 4, "MA"),
                new Package("Boots", 6, "NY")
        );

        for (Package pkg : packages) {
            calLowestPrice(pkg, carriers);
        }
    }
}
