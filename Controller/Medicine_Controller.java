package Controller;

import model.Medicine;

import java.util.Scanner;

public class Medicine_Controller implements controller{

    public void create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Medicine ID:");
        int id = sc.nextInt();
        System.out.println("Enter the Medicine Name: ");
        String name = sc.nextLine();
        System.out.println("Enter the Medicine Generic: ");
        String type = sc.nextLine();
        System.out.println("Enter the Medicine Producer: ");


    }
}


