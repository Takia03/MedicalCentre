package Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import model.Nurse;

public class Nurse_Controller implements controller{
    public void create(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id of the nurse:");
        int id = sc.nextInt();
        System.out.println("Enter the name of the nurse: ");
        String name = sc.nextLine();
        System.out.println("Enter the phone number of the nurse: ");
        String phone = sc.nextLine();
        System.out.println("Enter the email of the nurse: ");
        String email = sc.nextLine();
        System.out.println("Enter the start time of the nurse (HH:mm:ss): ");
        String startTimeString = sc.nextLine();
        System.out.println("Enter the end time of the nurse (HH:mm:ss): ");
        String endTimeString = sc.nextLine();
        System.out.println("Enter the salary of the nurse: ");
        double salary = sc.nextDouble();

        // Create a SimpleDateFormat object with the specified format
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        Date startTime = null;
        Date endTime = null;
        try {
            // Parse the startTimeString to obtain a Date object
            startTime = sdf.parse(startTimeString);
            endTime = sdf.parse(endTimeString);
        } catch (ParseException e) {
            // Handle parsing exception
            System.out.println("Error parsing date: " + e.getMessage());
            return; // Exit the program
        }

        // Create a Nurse object with the parsed date
        Nurse nurse = new Nurse(id, name, phone, email, new java.sql.Time(startTime.getTime()), new java.sql.Time(endTime.getTime()), salary);
        nurse.save();
    }
}
