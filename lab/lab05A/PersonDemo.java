/**
* PersonDemo.java 
* @author Justin Meckmann                 
* Purpose:  Demonstrating the abstract Person using the Employee2 and Student subclasses.
**/


public class PersonDemo {
    public static void main() {
        // print username and timestamp
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString()); 
        System.out.println(); // line wrap

        Person[] myPersons = new Person[2]; 

        myPersons[0] = new Student("Alice", "CNIT");
        myPersons[1] = new Employee2("Bob", 50_000); 


        // loop through array using enhanced loop
        for (Person e : myPersons) {
            System.out.println(e.getDescription()); 
        }
    }
}