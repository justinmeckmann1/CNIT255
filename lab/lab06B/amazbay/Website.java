package amazbay;

import java.util.Arrays;

public class Website
{
    private Person[] users;
    private Message[] messages; 

    public Website()
    {
        users = new Person[0];
        messages = new Message[0];
    }

    public void addPerson(Person p)
    {
        // We will need to create a new Person[] array that is 1 more in size
        // than what `users` used to be, and copy the contents of `users`
        // into it.
        Person newArray[] = new Person[users.length+1];
        for(int i = 0; i < users.length; i+=1)
        {
            newArray[i] = users[i];
        }

        // TODO - add p to newUsers, and update `users`
        newArray[users.length] = p; 
        users = newArray; 
    }

    public Person getPersonByUID(int uid)
    {
        // TODO - loop through `users`, and return the first person whose uid
        // matches.  Otherwise, return null as below.
        for (Person p : users) {
            if (p.getUID() == uid) {
                return p;
            }
        }
        return null;
    }

    void addMessage(Message m)
    {
        this.messages = Arrays.copyOf(this.messages, this.messages.length + 1); // create a new copy of array with increased length
        this.messages[this.messages.length - 1] = m; // add new message at the end 

        // TODO - decide how to store m, so that you can later retrieve the
        // right ones in getMessagesFor().
    }

    public Message[] getMessagesFor(int uid)
    {   
        Message[] messagesToReturn = new Message[this.messages.length]; // new array with length messages

        // iterate over array, only add messages where sender or receiver have uid which is searched for
        int i = 0;
        for (Message m : this.messages) {
            if (m.getReceiver().getUID() == uid || m.getSender().getUID() == uid) {
                messagesToReturn[i] = m; 
                i++; 
            }
        }
        // TODO - return all messages added on the Website where either
        // the sender or the receiver was the person with uid `uid`, in
        // the order they were sent.
        return Arrays.copyOf(messagesToReturn, i); // resize array to number of messages it actually contains
    }
}
