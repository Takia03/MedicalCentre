package model;

import  DB.connection;
public class Medicine implements model{
    public String MedID;
    public String Name;
    public String Generic;
    public String Producer;

    public Medicine(){

    }

    public Medicine(String MedID, String Name, String Generic, String Producer){
        this.MedID = MedID;
        this.Name = Name;
        this.Generic = Generic;
        this.Producer = Producer;
    }

    public void save() {
        String query = "INSERT INTO medicine (MedID, Name, Generic, Producer) " +
                "VALUES ('" + this.MedID + "', '" + this.Name + "', '" + this.Generic + "', '" + this.Producer + "')";
        try {
            int rc = connection.Execute(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
