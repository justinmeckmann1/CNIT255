
import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

//    public Employee() { }

    public Employee(String aName, double aSalary, int year, int month, int day) {
        name = aName;
        salary = aSalary;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(int byPercent) {
        double raise = salary * byPercent/100;
        salary += raise;
    }
}
