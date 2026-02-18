package com.happyjoa;

public class Employee {

    private static int nextId = 1; // shared along every object of this class

    private String name;
    private double salary;
    private int id;

    public Employee(String aName, double aSalary) {
        name = aName;
        salary = aSalary;
        setId();
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
    public void setId() {
        id = nextId;
        nextId++; // increments for the next time another object is created
    }

    public static int getNextId() {
        return nextId;
    }

} //end class
