package Lab2_lvl1_Stream;

public class Person {
    private String name;
    private String phone;
    private int age;

    Person(String name, String phone, int age){
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
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
