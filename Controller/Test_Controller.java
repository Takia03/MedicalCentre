package Controller;

import model.Test;

import java.util.Scanner;

public class Test_Controller implements controller{

    public void create(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the TestID:");
        String TestID = sc.nextLine();
        System.out.println("Enter the Name: ");
        String Name = sc.nextLine();
        System.out.println("Enter the Price: ");
        int Price = sc.nextInt();


        Test test = new Test(TestID, Name, Price);
        test.save();
    }
}
