package Lab7_level4;

public class Course {
    private CourseType type;
    private String number;
    private String title;
    private int units;
    private Faculty faculty;

    Course(String number, String title, int unit, CourseType type){
        this.number = number;
        this.title = title;
        this.units = unit;
        this.type = type;
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

    public String toString(){
        return "Title: " + title + "Type: " + type + ", Units: " + units;// + ", Faculty: " + faculty.toString();
    }
}
