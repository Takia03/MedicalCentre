package Controller;

import model.Prescription;

import java.util.Scanner;

public class Prescription_Controller implements controller{
    public void create(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter prescription ID:");
        int id = sc.nextInt();
        System.out.println("Enter the attendID: ");
        int attendID = sc.nextInt();
        System.out.println("Enter the comment: ");
        String comment = sc.nextLine();

        Prescription prescription = new Prescription(id, attendID, comment);
        prescription.save();
    }
}
