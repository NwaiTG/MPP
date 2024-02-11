package Lab_7;

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
        System.out.println("Department Name: " + this.name + ", Location: " + this.location);
        for(Position p : positions){
            p.print();
        }
    }

    public String toString(){
        String strPosition = "";
        for(Position p : positions){
            strPosition = strPosition + p.toString();
        };
        return "Department Name: " + this.name + ", Location: " + this.location + "\n" +
                strPosition;

    }

    public boolean equals(Object obj){
        if(obj == null) return false;
        if(!(obj instanceof Department)) return false;
        Department dept = (Department) obj;
        return name.equals(dept.name) && location.equals(dept.location) && positions.equals(dept.positions);
    }
}
