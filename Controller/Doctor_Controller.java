package Controller;

import model.Doctor;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Doctor_Controller implements controller{
    public void create(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id of the doctor:");
        int id = sc.nextInt();
        System.out.println("Enter the name of the doctor: ");
        String name = sc.nextLine();
        System.out.println("Enter the specialization of the doctor: ");
        String specialization = sc.nextLine();
        System.out.println("Enter the phone number of the doctor: ");
        String phone = sc.nextLine();
        System.out.println("Enter the email of the doctor: ");
        String email = sc.nextLine();
        System.out.println("Enter the start time of the doctor (HH:mm:ss): ");
        String startTimeString = sc.nextLine();
        System.out.println("Enter the end time of the doctor (HH:mm:ss): ");
        String endTimeString = sc.nextLine();

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

        // Create a Doctor object with the parsed date
        Doctor doctor = new Doctor(id, name, specialization, phone, email, new java.sql.Time(startTime.getTime()), new java.sql.Time(endTime.getTime()));
        doctor.save();
    }
}
