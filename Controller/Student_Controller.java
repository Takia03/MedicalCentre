package Controller;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import model.Student;

public class Student_Controller {
    public static void create_student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id of the student:");
        int id = sc.nextInt();
        System.out.println("Enter the name of the student: ");
        String name = sc.nextLine();
        System.out.println("Enter the department of the student: ");
        String department = sc.nextLine();
        System.out.println("Enter the date of birth of the student (yyyy-MM-dd): ");
        String dobString = sc.nextLine();

        // Create a SimpleDateFormat object with the specified format
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date dob = null;
        try {
            // Parse the dobString to obtain a Date object
            dob = sdf.parse(dobString);
        } catch (ParseException e) {
            // Handle parsing exception
            System.out.println("Error parsing date: " + e.getMessage());
            return; // Exit the program
        }

        System.out.println("Enter the phone number of the student: ");
        String phone = sc.nextLine();
        System.out.println("Enter the email of the student: ");
        String email = sc.nextLine();

        // Create a Student object with the parsed date
        Student student = new Student(id, name, department, dob, phone, email);

        student.save();
    }
}


// cardboard -> boro
// bonduk
//
