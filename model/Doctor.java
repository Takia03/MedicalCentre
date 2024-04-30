package model;

import java.sql.Time;
import java.util.Date;
import DB.connection;
import java.text.SimpleDateFormat;
public class Doctor implements model{
    public int id;
    public String name;
    public String specialization;
    public String phone;
    public String email;
    public Time startTime;
    public Time endTime;


    public Doctor(){

    }
    public Doctor(int id, String name, String specialization, String phone, String email, Time startTime, Time endTime) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.phone = phone;
        this.email = email;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void save(){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String formattedStartTime = sdf.format(this.startTime);
        String formattedEndTime = sdf.format(this.endTime);
        String query = "INSERT INTO doctor (ID, Name, Specialization, Phone, Email, StartTime, EndTime) " +
                "VALUES ('" + this.id + "', '" + this.name + "', '" + this.specialization + "', '" + this.phone + "', '" + this.email + "', '" + formattedStartTime + "', '" + formattedEndTime + "')";
        try {
            int rc = connection.Execute(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
