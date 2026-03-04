
public class ManagerTest {
    public static void main(String[] args) {
      //  Manager hr = new Manager();
        Manager boss = new Manager("Carl Cracker", 8000, 1999, 12, 3);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 5000, 2003, 2, 5);
        staff[2] = new Employee("Tommy Tester", 4000, 2009, 4, 23);
        for(Employee e: staff)
            System.out.println("name= " + e.getName() +
                    ", salary= " + e.getSalary());

    }
}
