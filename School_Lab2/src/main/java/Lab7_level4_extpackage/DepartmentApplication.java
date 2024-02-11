package Lab7_level4_extpackage;

import Lab7_level4.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DepartmentApplication {
    public static void main(String[] args) throws IOException{
        Department dept = new Department("ComputerScience");

        // Create faculty objects
        Faculty frankMoore = new Faculty("Frank Moore", "472-5921", 43, 10000);
        Faculty samHoward = new Faculty("Sam Howard","472-7222",55,9500);
        Faculty johnDoodle = new Faculty("John Doodle","472-6190",39,8600);
        dept.addPerson(frankMoore);
        dept.addPerson(samHoward);
        dept.addPerson(johnDoodle);

        // Create student objects
        Student johnDoe = new Student("John Doe","472-1121",22,4.0);
        Student maryJones = new Student("Mary Jones","472-7322",32,3.80);
        Student leeJohnson = new Student("Lee Johnson","472-6009",19,3.65);
        dept.addPerson(johnDoe);
        dept.addPerson(maryJones);
        dept.addPerson(leeJohnson);

        // Create staff objects
        Person frankGore = new Staff("Frank Gore","472-3321",33,4050);
        Person adamDavis = new Staff("Adam Davis","472-7552",50,5500);
        Person davidHeck = new Staff("David Heck","472-8890",29,3600);
        dept.addPerson(frankGore);
        dept.addPerson(adamDavis);
        dept.addPerson(davidHeck);

//        Course cs201 = new Course("cs201","programming",4);
//        Course cs360 = new Course("cs360","database",3);
//        Course cs404 = new Course("cs404","compiler",4);
//        Course cs240 = new Course("cs240","datastructure",2);
//        Course cs301 = new Course("cs301","Software engg",3);
//        Course cs450 = new Course("cs450","Advanced architecture",5);

        // Lab_2.Faculty course
        johnDoodle.addCourse("cs201","programming",4, CourseType.COMPRO);
        samHoward.addCourse("cs360","database",3, CourseType.MBA);
        johnDoodle.addCourse("cs404","compiler",4, CourseType.DATASECIENCE);
        johnDoodle.addCourse("cs240","datastructure",2, CourseType.MBA);
        samHoward.addCourse("cs301","Software engg",3, CourseType.COMPRO);
        frankMoore.addCourse("cs450","Advanced architecture",5, CourseType.DATASECIENCE);

        /*johnDoodle.addCourse(cs201);
        samHoward.addCourse(cs360);
        johnDoodle.addCourse(cs404);
        johnDoodle.addCourse(cs240);
        samHoward.addCourse(cs301);
        frankMoore.addCourse(cs450);*/

        // Lab_2.Student course
        johnDoe.addCourse("cs404","compiler",4, CourseType.DATASECIENCE);
        johnDoe.addCourse("cs360","database",3, CourseType.MBA);
        johnDoe.addCourse("cs404","compiler",4, CourseType.DATASECIENCE);
        johnDoe.addCourse("cs301","Software engg",3, CourseType.COMPRO);
        maryJones.addCourse("cs404","compiler",4, CourseType.DATASECIENCE);
        maryJones.addCourse("cs404","compiler",4, CourseType.DATASECIENCE);
        maryJones.addCourse("cs450","Advanced architecture",5, CourseType.DATASECIENCE);
        leeJohnson.addCourse("cs404","compiler",4, CourseType.DATASECIENCE);
        leeJohnson.addCourse("cs360","database",3, CourseType.MBA);
        leeJohnson.addCourse("cs240","datastructure",2, CourseType.MBA);
        leeJohnson.addCourse("cs450","Advanced architecture",5, CourseType.DATASECIENCE);

        double totsalary = 0;

        while(true)
        {
            putText("Enter first letter of ");
            putText("getTotalSalary, showAllMembers, unitsPerFaculty or quit : ");
            int choice = getChar();
            switch(choice)
            {
                case 'g':
                    totsalary=dept.getTotalSalary();
                    putText("Total sum of all salaries is:");
                    putText(String.valueOf(totsalary)+"\n");
                    break;
                case 's':
                    dept.showAllMembers();
                    break;
                case 'u':
                    dept.unitsPerFaculty();
                    break;
                case 'i':
                    IPerson.myStatic();
                    IPerson staff = new Staff("David Heck","472-8890",29,3600);
                    staff.myAbstract();
                    staff.myDefault();
                case 'q': return;
                case 'c' : dept.displayFacultyCourse();
                default:
                    putText("Invalid entry\n");
            }  // end switch
        }  // end while
    }

    public static void putText(String s){ //writes string s to the screen
        System.out.println(s);
    }

    public static String getString() throws IOException{  //reads a string from the keyboard input
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static char getChar() throws IOException{ //reads a character from the keyboard input
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException{ // reads an integers from the keyboard input
        String s = getString();
        return Integer.parseInt(s);
    }
}
