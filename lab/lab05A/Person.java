/**
* StaffDemo.java 
* @author Justin Meckmann                 
* Purpose:  Abstract class Person. Contains the field: 
            - name -> String

            and the abstract method: 
            - getDescription -> String
**/


public abstract class Person {
    private String name; 

    // constructor
    public Person(String name) {
        this.name = name;
    }

    // abstract method
    public abstract String getDescription(); 
}
