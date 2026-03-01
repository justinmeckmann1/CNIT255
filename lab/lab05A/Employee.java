import java.time.LocalDate;

/**
* Employee.java 
* @author Justin Meckmann                 
* Purpose:  Super / Parent class Employee, contains the fields:
            - name      -> String
            - salary    -> double 
            - hireDate  -> local date

            and the methods: 
            - getName   -> String
            - getSalery -> double 
            - raiseSalery -> void 
**/

public class Employee {

    // fields
    private String name; 
    private double salary; 
    private LocalDate hireDate; 

    // constructor
    public Employee(String name, double salary, int year, int month, int day){
        // assign values to variables
        this.name = name;
        this.salary = salary;
        this.hireDate = LocalDate.of(year, month, day);
    }


    public String getName() {
        // return name
        return this.name; 
    }


    public double getSalary() {
        // return salary
        return this.salary; 
    }


    public void raiseSalary(double percent) {
        // increase salary by given percent
        this.salary *= (1 + (percent/100));
    }


}
