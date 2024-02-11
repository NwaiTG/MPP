package Lab3_1_Stream;

import java.util.ArrayList;

public class Department {
    private String name;
    private String location;
    private ArrayList<Position> positions;

    public Department(String name, String loc){
        this.name = name;
        this.location = loc;
        positions = new ArrayList<Position>();
    }

    public void setPositions(Position position) {
        positions.add(position);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return location;
    }

    public void print(){
        System.out.println("\nDepartment Name: " + this.name + ", Location: " + this.location);

        positions.stream()
                .forEach(Position::print);

//        for(Position p : positions){
//            p.print();
//        }
    }
}
