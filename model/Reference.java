package model;

import DB.connection;

public class Reference implements model{
    public String AttendID;
    public String Comment;
    public String PID;


    public Reference(){

    }

    public Reference(String AttendID, String Comment, String PID){
        this.AttendID = AttendID;
        this.Comment = Comment;
        this.PID = PID;
    }

    public void save() {
        String query = "INSERT INTO reference (AttendID, Comment, PID) " +
                "VALUES ('" + this.AttendID + "', '" + this.Comment + "', '" + this.PID + "')";
        try {
            int rc = connection.Execute(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
