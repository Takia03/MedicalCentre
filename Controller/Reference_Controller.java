package Controller;

import model.Reference;

import java.util.Scanner;

public class Reference_Controller {

public void create(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the AttendID:");
        String AttendID = sc.nextLine();
        System.out.println("Enter the Comment: ");
        String Comment = sc.nextLine();
        System.out.println("Enter the PID: ");
        String PID = sc.nextLine();

        Reference reference = new Reference(AttendID, Comment, PID);
        reference.save();
    }

}
