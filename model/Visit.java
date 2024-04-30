package model;

import DB.connection;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Visit implements model{
    public int id;
    public int patientId;
    public Date visitDate;
    public Time visitTime;


    public Visit(){

    }
    public Visit(int id, int patientId, Date visitDate, Time visitTime) {
        this.id = id;
        this.patientId = patientId;
        this.visitDate = visitDate;
        this.visitTime = visitTime;
    }

    public void save() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat stf = new SimpleDateFormat("HH:mm:ss");
        String formattedVisitDate = sdf.format(this.visitDate);
        String formattedVisitTime = stf.format(this.visitTime);

        String query = "INSERT INTO visit (ID, PatientID, DoctorID, VisitDate, VisitTime) VALUES ('" + this.id + "', '" + this.patientId + "', '" + "', TO_DATE('" + formattedVisitDate + "', 'DD-MON-YYYY'), '" + formattedVisitTime + "')";
        try {
            int rc = connection.Execute(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
