package org.fasttrackit.exercise2;


public class Employee implements Person{
    private String dateOfEmployment;
    private String position;
    private String firstName;
    private String lastName;
    private String birthday;
    private String address;

    public Employee(String dateOfEmployment, String position, String firstName, String lastName, String birthday, String address) {
        this.dateOfEmployment = dateOfEmployment;
        this.position = position;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
    }

    public Employee(String firstName, String lastName) {

    }

    public String getDateOfEmployment() {
        return "Date of employment: " + dateOfEmployment;
    }
    public String getPosition() {
        return "Position is " + position;
    }
    public String getFirstName() {
        return "First name: " + firstName;
    }
    public String getLastName() {
        return "Last name: " + lastName;
    }
    public String getBirthDay() {
        return "Birthday: " + birthday;
    }
    public String getAddress() {
        return "Address: " + address;
    }


    //ex3
    public String fullName() {
        return firstName + " " + lastName;
    }
}
