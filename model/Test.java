package model;


import DB.connection;


public class Test implements model{
    public String TestID;
    public String Name;
    public int  Price;


    public Test(){

    }



    public Test(String TestID, String Name, int Price){
        this.TestID = TestID;
        this.Name = Name;
        this.Price = Price;
    }


    public void save() {
        String query = "INSERT INTO test (TestID, Name, Price) " +
                "VALUES ('" + this.TestID + "', '" + this.Name + "', '" + this.Price + "')";
        try {
            int rc = connection.Execute(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
