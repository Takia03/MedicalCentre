package Controller;

import model.Visit;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Visit_Controller implements controller{
    public void create(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter visit id:");
        int id = sc.nextInt();
        System.out.println("Enter patient id: ");
        int patientId = sc.nextInt();
        System.out.println("Enter the visit date of the visit (dd-MMM-yyyy): ");
        String visitDateString = sc.nextLine();
        System.out.println("Enter the visit time of the visit (HH:mm:ss): ");
        String visitTimeString = sc.nextLine();

        // Create a SimpleDateFormat object with the specified format
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat stf = new SimpleDateFormat("HH:mm:ss");

        Date visitDate = null;
        Time visitTime = null;
        try {
            // Parse the visitDateString to obtain a Date object
            visitDate = sdf.parse(visitDateString);
            visitTime = new Time(stf.parse(visitTimeString).getTime());
        } catch (Exception e) {
            // Handle parsing exception
            System.out.println("Error parsing date: " + e.getMessage());
            return; // Exit the program
        }

        // Create a Visit object with the parsed date
        Visit visit = new Visit(id, patientId, visitDate, new java.sql.Time(visitTime.getTime()));
        visit.save();

    }
}
