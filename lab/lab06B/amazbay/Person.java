/**
 * Person.java
 * @author Justin Meckmann
 * Purpose: Represents a user in the AmazBay messaging system.
 */

package amazbay;

public class Person
{
    // TODO - add the other fields mentioned in the handout, and create
    // getters and setters for each.
    private String firstName; 
    private String lastName; 
    private int uid;

    public Person(int uid, String firstName, String lastName) {
        setUID(uid);
        setFirstName(firstName);
        setLastName(lastName);
    }

    // UID setter and getter
    public int getUID() {
        return uid;
    }

    public void setUID(int uid) {
        this.uid = uid;
    }

    // first name setter and getter
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName; 
    }

    // last name setter and getter
    public String getLastName() {
        return this.lastName; 
    }

    public void setLastName(String lastName) {
        this.lastName = lastName; 
    }

    public String getFullName() {
        return String.format("%s %s",this.firstName, this.lastName); 
    }

    // message 
    public void sendMessageTo(Person receiver, String message, long when,
                              Website website)
    {
        Message m = new Message(this, receiver, message, when);
        website.addMessage(m);
    }
}
