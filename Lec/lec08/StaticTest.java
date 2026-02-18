package com.happyjoa;

public class StaticTest {
    public static void main(String[] args) {

        //Identification and Timestamp
        String choSmith5087 = System.getProperty("user.name");
        String time = java.time.LocalDateTime.now().toString();
        System.out.println(choSmith5087);
        System.out.println(time);

        Employee[] staff = new Employee[3]; // create objects 

        staff[0] = new Employee("Tom", 40000);
        staff[1] = new Employee("Dick", 60000);
        staff[2] = new Employee("Harry", 65000);

        for(Employee e: staff) {
            e.getId();
            System.out.println("name=" + e.getName() +
                    ", id=" + e.getId() +
                    ", salray=" + e.getSalary());
        }

        int n = Employee.getNextId(); //calls static method
        System.out.println("Next avilable id=" + n);

    }
}
