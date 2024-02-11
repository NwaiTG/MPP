package Lab2_level2;

public class Person {
    private String name;
    private String phone;
    private int age;
    Person(String name, String phone, int age){
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public double getSalary(){
        return 0;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        return "Name: " + name + ", Phone: " + phone + ", Age: " + age;
    }
}
