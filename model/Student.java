package model;

import java.util.Date;
import DB.connection;
import java.text.SimpleDateFormat;

public class Student {
    private int id;
    private String name;
    private String Department;
    private Date dob;
    private String Phone;
    private String Email;

    public Student() {
    }

    public Student(int id, String name, String Department, Date dob, String Phone, String Email) {
        this.id = id;
        this.name = name;
        this.Department = Department;
        this.dob = dob;
        this.Phone = Phone;
        this.Email = Email;
    }

    public void save() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        String formattedDob = sdf.format(this.dob);
        String query = "INSERT INTO student (ID, Name, Department, DateOfBirth, Phone, Email) VALUES ('" + this.id + "', '" + this.name + "', '" + this.Department + "', TO_DATE('" + formattedDob + "', 'DD-MON-YYYY'), '" + this.Phone + "', '" + this.Email + "')";
        try {
            int rc = connection.Execute(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
