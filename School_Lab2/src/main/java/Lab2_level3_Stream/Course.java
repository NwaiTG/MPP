package Lab2_level3_Stream;

import java.util.Objects;

public class Course {
    private String number;
    private String title;
    private int units;
    private Faculty faculty;

    public Course(String number, String title, int unit, Faculty faculty){
        this.number = number;
        this.title = title;
        this.units = unit;
        this.faculty = faculty;
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

    @Override
    public String toString() {
        return "Course{" +
                "number='" + number + '\'' +
                ", title='" + title + '\'' +
                ", units=" + units +
                ", faculty=" + faculty +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Course course = (Course) obj;
        return Objects.equals(number, title);
    }
}
