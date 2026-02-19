/**
* ParameterPlayground.java 
* @author Justin Meckmann                 
* Purpose: Demonstrating how Java passes primitive values and object references
*          to methods, and therefore showing what can and cannot be changed using these methods**/


public class Student {
    
    // variables 
    private final int id;
    private String name;
    private static int nextId = 1;  

    // object initialization block
    {
        this.id = nextId++; 
    }

    // Constructor when name is given 
    public Student(String name) {
        this.name = name; 
    }

    // constructor when name is not given 
    public Student() {
        this.name = "Unnamed";
    }

    // getter method for name
    public String getName() {
        return this.name; 
    }

    // setter method for name 
    public void setName(String newName) {
        this.name = newName;
    }

    // getter method for next free ID 
    static int getNextId() {
        return nextId;
    }

    // toString method 
    @Override
    public String toString() {
        return String.format("Student #%d: %s.", this.id, this.name);
    }

    public static void main(String args[]) {
        // print username and timestamp
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString()); 
        System.out.println(); // line wrap

        // creating 3 new students 
        Student student1 = new Student("Alice"); 
        Student student2 = new Student("Bob"); 
        Student student3 = new Student(); 

        // using setter method to set name of third student
        student3.setName("Eve"); 

        // print using the toString method
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
