package Lab7_level4;

public final class Immutable_Person {
    private final String name;
    private final String phone;
    private final int age;

    public Immutable_Person(String name, String phone, int age){
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary(){
        return 0;
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        return "Name: " + this.name + ", Phone: " + this.phone + ", Age: " + this.age;
    }
}
