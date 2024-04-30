package model;

import DB.connection;

public class Attend implements model{
    public int id;
    public int nurseID;
    public int doctorID;
    public int visitID;

    public Attend(){

    }

    public Attend(int id, int nurseID, int doctorID, int visitID){
        this.id = id;
        this.nurseID = nurseID;
        this.doctorID = doctorID;
        this.visitID = visitID;
    }

    public void save() {
        String query = "INSERT INTO attend (ID, NurseID, DoctorID, VisitID) " +
                "VALUES ('" + this.id + "', '" + this.nurseID + "', '" + this.doctorID + "', '" + this.visitID + "')";
        try {
            int rc = connection.Execute(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
