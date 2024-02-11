package Lab3_2_Stream;

import java.util.ArrayList;

public class Department {
    String name;
    String location;
    ArrayList<Position> positions = new ArrayList<>();

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void addPosition(Position position) {
        positions.add(position);
    }

    public void print() {
        System.out.println("Department: " + name + ", Location: " + location);

        for (Position position : positions) {
            position.print();
        }
    }

    public double getSalary(){
        double totalSal = 0.0;

        for(Position pos : positions){
            totalSal += pos.getSalary();
        }
        return totalSal;
    }
}
