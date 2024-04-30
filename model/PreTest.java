package model;

import DB.connection;

public class PreTest implements model {

    public  String TestID;
    public String PID;
    public String Comment;


    public PreTest(){

    }

    public PreTest(String TestID, String PID, String Comment){
        this.TestID = TestID;
        this.PID = PID;
        this.Comment = Comment;
    }

    public void save() {
        String query = "INSERT INTO pretest (TestID, PID, Comment) " +
                "VALUES ('" + this.TestID + "', '" + this.PID + "', '" + this.Comment + "')";
        try {
            int rc = connection.Execute(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
