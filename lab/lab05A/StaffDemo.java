/**
* StaffDemo.java 
* @author Justin Meckmann                 
* Purpose:  Demonstrating the Employee superclass and the manager subclass
**/


public class StaffDemo {
    public static void main() {
        // print username and timestamp
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString()); 
        System.out.println(); // line wrap

        // declaring and initializing the staff array
        Employee[] staff = new Employee[3];

        // creating and assigning Employee objects
        staff[0] = new Manager("Carl Cracker", 80_000, 1990, 12, 3);
        staff[1] = new Employee("Harry Hacker", 50_000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40_000, 1990, 3, 15); 

        // set bonus for manager
        ((Manager) staff[0]).setBonus(5000);

        // loop through array using enhanced loop
        for (Employee e : staff) {
            System.out.println("Name " + e.getName()+ " Salary: " + e.getSalary()); 
        }
    }
}
