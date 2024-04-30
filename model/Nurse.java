package model;

import java.sql.Time;
import java.util.Date;
import DB.connection;
import java.text.SimpleDateFormat;

public class Nurse implements model{
    public int id;
    public String name;
    public String phone;
    public String email;
    public Time startTime;
    public Time endTime;
    public double salary;

    public Nurse() {
    }
    public Nurse(int id, String name, String phone, String email, Time startTime, Time endTime, double salary) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.startTime = startTime;
        this.endTime = endTime;
        this.salary = salary;
    }

    public void save() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String formattedStartTime = sdf.format(this.startTime);
        String formattedEndTime = sdf.format(this.endTime);
        String query = "INSERT INTO nurse (ID, Name, Phone, Email, StartTime, EndTime, Salary) " +
                "VALUES ('" + this.id + "', '" + this.name + "', '" + this.phone + "', '" + this.email + "', TO_DATE('" + formattedStartTime + "', 'DD-MON-YYYY'), TO_DATE('" + formattedEndTime + "', 'DD-MON-YYYY'), '" + this.salary + "')";
        try {
            int rc = connection.Execute(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
