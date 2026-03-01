/**
* Employee.java 
* @author Justin Meckmann                 
* Purpose:  extends the abtract class Person and overwrites its getDescription function.
            Addtitionally, a new field "salary" is added
**/




import java.text.NumberFormat;

public class Employee2 extends Person {
    private double salary; 


    public Employee2(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public String getDescription() {
        NumberFormat formatCurrency = NumberFormat.getCurrencyInstance();
        return String.format("an employee with a salary of %s", formatCurrency.format(salary));
    }
    
}
