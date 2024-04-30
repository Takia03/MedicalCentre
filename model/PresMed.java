package model;

import DB.connection;

public class PresMed implements model{
    public String MedID;
    public String PID;
    public String Comment;


    public PresMed(){

    }


    public PresMed(String MedID, String PID, String Comment){
        this.MedID = MedID;
        this.PID = PID;
        this.Comment = Comment;
    }

    public void save() {
        String query = "INSERT INTO presmed (MedID, PID, Comment) " +
                "VALUES ('" + this.MedID + "', '" + this.PID + "', '" + this.Comment + "')";
        try {
            int rc = connection.Execute(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
