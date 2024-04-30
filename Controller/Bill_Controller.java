package Controller;

import model.Bill;

import java.util.Scanner;
public class Bill_Controller implements controller{

    public void create(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the RID:");
        String RID = sc.nextLine();
        System.out.println("Enter the amount: ");
        int amount = sc.nextInt();
        System.out.println("Enter the BillID: ");
        String BillID = sc.nextLine();

        Bill bill = new Bill(RID, amount, BillID);
        bill.save();
    }
}
