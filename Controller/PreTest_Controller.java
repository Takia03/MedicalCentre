package Controller;

import model.PreTest;

import java.util.Scanner;

public class PreTest_Controller implements controller{

    public void create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the TestID:");
        String TestID = sc.nextLine();
        System.out.println("Enter the PID: ");
        String PID = sc.nextLine();
        System.out.println("Enter the Comment: ");
        String Comment = sc.nextLine();

        PreTest preTest = new PreTest(TestID, PID, Comment);

        preTest.save();

    }
}
