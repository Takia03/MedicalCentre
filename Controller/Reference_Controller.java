package Controller;

import model.Reference;

import java.util.Scanner;

public class Reference_Controller {

public void create(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the reference ID:");
        int id = sc.nextInt();
        System.out.println("Enter the attendID: ");
        int attendID = sc.nextInt();
        System.out.println("Enter the comment: ");
        String comment = sc.nextLine();

        Reference reference = new Reference(id, attendID, comment);
        reference.save();
    }

}
