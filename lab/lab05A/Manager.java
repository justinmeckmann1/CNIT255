/**
* Manager.java 
* @author Justin Meckmann                 
* Purpose:  child of Employee -> extends Employee 
            additional fields: 
            - bonus -> double

            additional methods: 
            - setBonus -> void

            overwritten methods: 
            - getSalery -> double, adds the bonus to the salary. 
**/



public class Manager extends Employee {
    // fields for Manager
    private double bonus = 0; 
    
    // constructor
    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day); // calls the constructor of the suerclass
    }

    
    // methods
    public void setBonus(double amount) {
        this.bonus = amount; 
    }

    // overwriting method from superclass
    @Override
    public double getSalary() {
        return super.getSalary() + bonus; 
    }
}
