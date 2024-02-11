package Lab2_level3_launch_Stream;

import Lab2_level3_Stream.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DepartmentApplication {
    public static void main(String[] args) throws IOException {
        Department dept = new Department("ComputerScience");

        // Create faculty objects
        Person frankMoore = new Faculty("Frank Moore", "472-5921", 43, 10000);
        Person samHoward = new Faculty("Sam Howard","472-7222",55,9500);
        Person johnDoodle = new Faculty("John Doodle","472-6190",39,8600);
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

        StudentStaff tom = new StudentStaff("Tom","472-1121",22,4.0, 3000);
        StudentStaff joe = new StudentStaff("Joe","472-7322",32,3.80, 3500);
        StudentStaff racheal = new StudentStaff("Racheal","472-6009",19,3.65, 3600);
        dept.addPerson(tom);
        dept.addPerson(joe);
        dept.addPerson(racheal);

//        Course cs201 = new Course("cs201","programming",4);
//        Course cs360 = new Course("cs360","database",3);
//        Course cs404 = new Course("cs404","compiler",4);
//        Course cs240 = new Course("cs240","datastructure",2);
//        Course cs301 = new Course("cs301","Software engg",3);
//        Course cs450 = new Course("cs450","Advanced architecture",5);

        Course cs201 = new Course("cs201","programming",4,(Faculty)johnDoodle);
        Course cs360 = new Course("cs360","database",3,(Faculty)samHoward);
        Course cs404 = new Course("cs404","compiler",4,(Faculty)johnDoodle);
        Course cs240 = new Course("cs240","datastructure",2,(Faculty)johnDoodle);
        Course cs301 = new Course("cs301","Software engg",3,(Faculty)samHoward);
        Course cs450 = new Course("cs450","Advanced architecture",5,(Faculty)frankMoore);

        frankMoore.addCourse(cs450);
        johnDoodle.addCourse(cs201);
        johnDoodle.addCourse(cs404);
        johnDoodle.addCourse(cs240);
        samHoward.addCourse(cs301);
        samHoward.addCourse(cs360);

        // Lab_2.Faculty course
        /*johnDoodle.addCourse("cs201","programming",4);
        samHoward.addCourse("cs360","database",3);
        johnDoodle.addCourse("cs404","compiler",4);
        johnDoodle.addCourse("cs240","datastructure",2);
        samHoward.addCourse("cs301","Software engg",3);
        frankMoore.addCourse("cs450","Advanced architecture",5);*/

        /*johnDoodle.addCourse(cs201);
        samHoward.addCourse(cs360);
        johnDoodle.addCourse(cs404);
        johnDoodle.addCourse(cs240);
        samHoward.addCourse(cs301);
        frankMoore.addCourse(cs450);*/

        // Lab_2.Student course
        /*johnDoe.addCourse("cs404","compiler",4);
        johnDoe.addCourse("cs360","database",3);
        johnDoe.addCourse("cs404","compiler",4);
        johnDoe.addCourse("cs301","Software engg",3);
        maryJones.addCourse("cs404","compiler",4);
        maryJones.addCourse("cs404","compiler",4);
        maryJones.addCourse("cs450","Advanced architecture",5);
        leeJohnson.addCourse("cs404","compiler",4);
        leeJohnson.addCourse("cs360","database",3);
        leeJohnson.addCourse("cs240","datastructure",2);
        leeJohnson.addCourse("cs450","Advanced architecture",5);*/

        double totsalary = 0;

        while(true)
        {
            putText("Enter first letter of ");
            putText("getTotalSalary, showAllMembers, unitsPerFaculty, printAllStudentOfFaculty or quit : ");
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
                case 'p':
                    Faculty arg = null;
                    putText("Select the faculty:");
                    putText("1.Frank Moore");
                    putText("2.Sam Howard");
                    putText("3.John Doodle");
                    Scanner scan = new Scanner (System.in);
                    int opt = scan.nextInt();
                    if (opt == 1) arg =(Faculty)frankMoore;
                    else if (opt == 2) arg =(Faculty)samHoward;
                    else if (opt == 3) arg =(Faculty)johnDoodle;
                    else System.out.println("Invalid entry");
//                    dept.printStudents(arg);
                    dept.printAllStudentsOfFaculty(arg);
                case 'q': return;
                default:
                    putText("Invalid entry\n");
            }  // end switch
        }  // end while
    }

    public static void putText(String s){ //writes string s to the screen
        System.out.println(s);
    }

    public static String getString() throws IOException {  //reads a string from the keyboard input
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
