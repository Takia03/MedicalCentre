package Controller;

import model.Medicine;

import java.util.Scanner;

public class Medicine_Controller implements controller{

    public void create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the MedID:");
        String MedID = sc.nextLine();
        System.out.println("Enter the Name: ");
        String Name = sc.nextLine();
        System.out.println("Enter the Generic: ");
        String Generic = sc.nextLine();
        System.out.println("Enter the Producer: ");
        String Producer = sc.nextLine();

        Medicine medicine = new Medicine(MedID, Name, Generic, Producer);
        medicine.save();



    }
}


