package org.fasttrackit.exercise2;

public class Programmer extends Employee{
    private String language;

    public Programmer(String dateOfEmployment, String position, String firstName,
                      String lastName, String birthday, String address, String language) {

        super(dateOfEmployment, position, firstName, lastName, birthday, address);
        this.language = language;
    }

    public String getLanguage() {
        return "Language: " + language;
    }
    @Override
    public String getPosition() {
        return "Position is Programmer";
    }
}
