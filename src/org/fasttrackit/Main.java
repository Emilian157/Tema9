package org.fasttrackit;

import org.fasttrackit.exercise1.Cosmetics;
import org.fasttrackit.exercise1.Electronics;
import org.fasttrackit.exercise1.Fridge;
import org.fasttrackit.exercise1.Product;
import org.fasttrackit.exercise2.DatabaseAdmin;
import org.fasttrackit.exercise2.Employee;
import org.fasttrackit.exercise2.Programmer;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------------ex1--------------");

        Product paine = new Product(3.50, "Paine", "fara gluten", 12);
        System.out.println(paine.getPrice());
        System.out.println(paine.getName());
        System.out.println(paine.getDescription());
        System.out.println(paine.getQuantity());

        System.out.println("-----------------------------");

        Cosmetics ruj = new Cosmetics(64.99, "Ruj", "rezista 24Hr", 23, "rosu", 15);
        System.out.println(ruj.getPrice());
        System.out.println(ruj.getName());
        System.out.println(ruj.getDescription());
        System.out.println(ruj.getQuantity());
        System.out.println(ruj.getColor());
        System.out.println(ruj.getWeight());

        System.out.println("-----------------------------");

        Electronics ventilator = new Electronics(123, "Ventilator", "9 viteze", 7,
                                                    "electro-caznice", 0.7,0.6,1,24.5);
        System.out.println(ventilator.getPrice());
        System.out.println(ventilator.getName());
        System.out.println(ventilator.getDescription());
        System.out.println(ventilator.getQuantity());
        System.out.println(ventilator.getType());
        System.out.println(ventilator.getLength());
        System.out.println(ventilator.getWidth());
        System.out.println(ventilator.getHeight());
        System.out.println(ventilator.getWeight());
        System.out.println("-----------------------------");

        Fridge fridge = new Fridge(749.99, "Frigider Samsung", "Are si congelator", 6,
                                                    "Smart fridge", 0.5,0.4,2.5,75,88);
        System.out.println(fridge.getPrice());
        System.out.println(fridge.getName());
        System.out.println(fridge.getDescription());
        System.out.println(fridge.getQuantity());
        System.out.println(fridge.getType());
        System.out.println(fridge.getLength());
        System.out.println(fridge.getWidth());
        System.out.println(fridge.getHeight());
        System.out.println(fridge.getWeight());
        System.out.println(fridge.getTemperature());

        System.out.println("---------------ex2--------------");

        Employee employee = new Employee("03.04.2021", "Employee",
                                            "Giorgiana", "Mihalache",
                                                "21.04.2001", "Str. Lalelelor nr.2");

        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getBirthDay());
        System.out.println(employee.getAddress());
        System.out.println(employee.getDateOfEmployment());
        System.out.println(employee.getPosition());

        System.out.println("-----------------------------");

        Programmer programmer = new Programmer("21.07.2018", "IT worker",
                "Bogdan", "Dumitrescu",
                "30.10.1998", "Str. Randunicii nr.9", "JAVA");

        System.out.println(programmer.getFirstName());
        System.out.println(programmer.getLastName());
        System.out.println(programmer.getBirthDay());
        System.out.println(programmer.getAddress());
        System.out.println(programmer.getDateOfEmployment());
        System.out.println(programmer.getPosition());
        System.out.println(programmer.getLanguage());

        System.out.println("-----------------------------");

        DatabaseAdmin databaseAdmin = new DatabaseAdmin("25.09.2016", "Data Base Admin",
                "Lupan", "Ungureanu",
                "17.05.1995", "Str. Franzelei nr.7", "MySQL");

        System.out.println(databaseAdmin.getFirstName());
        System.out.println(databaseAdmin.getLastName());
        System.out.println(databaseAdmin.getBirthDay());
        System.out.println(databaseAdmin.getAddress());
        System.out.println(databaseAdmin.getDateOfEmployment());
        System.out.println(databaseAdmin.getPosition());
        System.out.println(databaseAdmin.getDbTechnology());

        System.out.println("---------------ex3--------------");

        System.out.println("Employee full name: " + employee.fullName());
        System.out.println("Programmer full name: " + programmer.fullName());
        System.out.println("Data Base Admin full name: " + databaseAdmin.fullName());
    }
}
