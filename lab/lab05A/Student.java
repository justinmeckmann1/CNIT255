/**
* Student.java 
* @author Justin Meckmann                 
* Purpose:  extends the abtract class Person and overwrites its getDescription function.
            Addtitionally, a new field "major" is added
**/


public class Student extends Person {

    private String major; 

    public Student(String name, String major) {
        super(name); 
        this.major = major; 
    }
    
    @Override
    public String getDescription() {
        return String.format("a student majoring in %s.", major); 
    }
}
