package model;

import DB.connection;

public class Prescription implements model{
    public int id;
    public int attendID;
    public String comment;

    public Prescription(){

    }

    public Prescription(int id, int attendID, String comment){
        this.id = id;
        this.attendID = attendID;
        this.comment = comment;
    }

    public void save() {
        String query = "INSERT INTO prescription (ID, AttendID, Comment) " +
                "VALUES ('" + this.id + "', '" + this.attendID + "', '" + this.comment + "')";
        try {
            int rc = connection.Execute(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
