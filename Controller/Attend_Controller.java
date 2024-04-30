package Controller;

import model.Attend;
import java.util.Scanner;

public class Attend_Controller implements controller{
    public void create(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id of the attend:");
        int id = sc.nextInt();
        System.out.println("Enter the nurseID of the attend: ");
        int nurseID = sc.nextInt();
        System.out.println("Enter the doctorID of the attend: ");
        int doctorID = sc.nextInt();
        System.out.println("Enter the visitID of the attend: ");
        int visitID = sc.nextInt();

        Attend attend = new Attend(id, nurseID, doctorID, visitID);
        attend.save();
    }
}
