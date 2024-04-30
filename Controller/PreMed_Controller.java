package Controller;

import model.PresMed;

import java.util.Scanner;

public class PreMed_Controller implements controller{

    public void create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the PreMedID:");
        String MedID = sc.nextLine();
        System.out.println("Enter the PID: ");
        String PID = sc.nextLine();
        System.out.println("Enter the Comment: ");
        String Comment = sc.nextLine();

        PresMed preMed = new PresMed(MedID, PID, Comment);

        preMed.save();

    }
}
