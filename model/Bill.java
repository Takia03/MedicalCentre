package model;

import DB.connection;

public class Bill implements model{
    public String RID;
    public  int amount;
    public String BillID;

    public Bill(){

    }

    public Bill(String RID, int amount, String BillID){
        this.RID = RID;
        this.amount = amount;
        this.BillID = BillID;
    }

    public void save() {
        String query = "INSERT INTO bill (RID, Amount, BillID) " +
                "VALUES ('" + this.RID + "', '" + this.amount + "', '" + this.BillID + "')";
        try {
            int rc = connection.Execute(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
