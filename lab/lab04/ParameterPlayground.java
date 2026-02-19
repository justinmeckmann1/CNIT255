/**
* Student.java 
* @author Justin Meckmann                 
* Purpose: 
**/

public class ParameterPlayground {
    static void tripleNumber(int x) {
        x *= 3;
    } 

    static void renameStudent(Student s) {
        s.setName("Changed"); 
    } 

    static void swap(Student a, Student b) {
        Student temp = a;
        a = b;
        b = temp;
    } 

    public static void main(String args[]) {

        // print username and timestamp
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString()); 
        System.out.println(); // line wrap

        // create new students 
        Student a = new Student("Ana"); 
        Student b = new Student("Ben"); 
        int n = 10; 

        // invoke methods
        tripleNumber(n);    
        renameStudent(a);
        swap(a, b);

        // print
        System.out.println("n = " + n + " \t\t\t\t-> unchanged");   // Java passes primitives by value, so x is just a copy of n, changing x has no effect on n
        System.out.println("a = " + a + " \t-> name changed");      // a does change (name becomes "Changed"). The method receives a copy of the reference, but it still points to the same Student object.
        System.out.println("b = " + b + " \t\t-> unchanged");       // a and b do not swap. The references are passed by value, swapping them only affects the local copies inside that method. The original references are untouched 

    }
}
