package Lab2_level2_Launch;

import Lab2_level2.*;
import Lab2_level2.Faculty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DepartmentApplication {
    public static void main(String[] args) throws IOException {
        Department dept = new Department("ComputerScience");

        // Create faculty objects
        Faculty frankMoore = new Faculty("Frank Moore","472-5921",43,10000);
        Faculty samHoward = new Faculty("Sam Howard","472-7222",55,9500);
        Faculty johnDoodle = new Faculty("John Doodle","472-6190",39,8600);

        dept.addPerson (frankMoore);
        dept.addPerson(samHoward);
        dept.addPerson(johnDoodle);


        // Create student objects
        Student johnDoe = new Student("John Doe","472-1121",22,4.0);
        Student maryJones = new Student("Mary Jones","472-7322",32,3.80);
        Student leeJohnson = new Student("Lee Johnson","472-6009",19,3.65);

        dept.addPerson (johnDoe);
        dept.addPerson(maryJones);
        dept.addPerson(leeJohnson);


        // Create staff objects
        Staff frankGore = new Staff("Frank Gore","472-3321",33,4050);
        Staff adamDavis = new Staff("Adam Davis","472-7552",50,5500);
        Staff davidHeck = new Staff("David Heck","472-8890",29,3600);
        dept.addPerson (frankGore);
        dept.addPerson(adamDavis);
        dept.addPerson(davidHeck);

        // Create staffStudent objects
        StudentStaff Gore = new StudentStaff("Frank Gore","472-3321",33,3.7, 2500);
        StudentStaff Davis = new StudentStaff("Adam Davis","472-7552",50,4.0, 2000);
        StudentStaff Heck = new StudentStaff("David Heck","472-8890",29,4.3, 2200);
        dept.addPerson (Gore);
        dept.addPerson(Davis);
        dept.addPerson(Heck);

        Course cs201 = new Course("cs201","programming",4);
        Course cs360 = new Course("cs360","database",3);
        Course cs404 = new Course("cs404","compiler",4);
        Course cs240 = new Course("cs240","datastructure",2);
        Course cs301 = new Course("cs301","Software engg",3);
        Course cs450 = new Course("cs450","Advanced architecture",5);

        // Faculty course
        johnDoodle.addCourse(cs201);
        samHoward.addCourse(cs360);
        johnDoodle.addCourse(cs404);
        johnDoodle.addCourse(cs240);
        samHoward.addCourse(cs301);
        frankMoore.addCourse(cs450);

        // Student course
        johnDoe.addCourse(cs201);
        johnDoe.addCourse(cs360);
        johnDoe.addCourse(cs404);
        johnDoe.addCourse(cs301);
        maryJones.addCourse(cs201);
        maryJones.addCourse(cs404);
        maryJones.addCourse(cs450);
        leeJohnson.addCourse(cs201);
        leeJohnson.addCourse(cs360);
        leeJohnson.addCourse(cs240);
        leeJohnson.addCourse(cs450);

        // StaffStudent course
        Gore.addCourse(cs201);
        Davis.addCourse(cs201);
        Heck.addCourse(cs201);

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
