package Controller;

import model.Doctor;

import java.sql.Time;
import java.text.SimpleDateFormat;
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

        // Create a Doctor object with the parsed date
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Time startTime = null;
        Time endTime = null;
        try {
            // Parse the startTimeString to obtain a Time object
            startTime = Time.valueOf(startTimeString);
            endTime = Time.valueOf(endTimeString);
        } catch (Exception e) {
            // Handle parsing exception
            System.out.println("Error parsing time: " + e.getMessage());
            return; // Exit the program
        }

        // Create a Doctor object with the parsed date
        Doctor doctor = new Doctor(id, name, specialization, phone, email, startTime, endTime);
        doctor.save();
    }
}
