package q5;

import java.util.ArrayList;
    public class ArrayListDemo {
        public static void main(String[] args) {

            // create ArrayList
            ArrayList<String> courses = new ArrayList<>();

            // add courses
            courses.add("Java I");
            courses.add("Database Fundamentals");
            courses.add("Networking Basics");
            courses.add("Web Development");

            // print courses
            System.out.println("Courses:");
            for (String course : courses) {
                System.out.println(course);
            }

            // print total
            System.out.println("\nTotal courses: " + courses.size());

            // remove one course (remove Database Fundamentals)
            courses.remove("Database Fundamentals");

            // print updated list
            System.out.println("\nAfter removal:");
            for (String course : courses) {
                System.out.println(course);
        }
    }
}


/* 
Reflective question: What does <String> mean in ArrayList<String>, and how does it help the 
programmer? 

<String> in ArrayList<String> specifies the type of elements that are stored in the ArrayList. By specifying that type,
it provides type safety and thereby helps by preventing incorrect data types from being added and eliminates the need for casting.

*/