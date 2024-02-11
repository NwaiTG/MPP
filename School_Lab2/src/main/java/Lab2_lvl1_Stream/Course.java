package Lab2_lvl1_Stream;

public class Course {
    private String number;
    private String title;
    private int units;
    private Faculty faculty;

    Course(String number, String title, int unit){
        this.number = number;
        this.title = title;
        this.units = unit;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public String getNumber() {
        return number;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public String getTitle() {
        return title;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public int getUnits() {
        return units;
    }
}
