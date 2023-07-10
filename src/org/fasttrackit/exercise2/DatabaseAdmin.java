package org.fasttrackit.exercise2;

import java.time.LocalDateTime;

public class DatabaseAdmin extends Employee {
    private String dbTechnology;

    public DatabaseAdmin(String dateOfEmployment, String position, String firstName,
                         String lastName, String birthday, String address, String dbTechnology) {
        super(dateOfEmployment, position, firstName, lastName, birthday, address);
        this.dbTechnology = dbTechnology;
    }

    public String getDbTechnology() {
        return "dbTechnology + " + dbTechnology;
    }

    @Override
    public String getAddress() {
        return "dbAdmin " + "Address: " + super.getAddress();
    }
}
