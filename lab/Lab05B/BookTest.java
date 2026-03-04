/**
* BookTest.java 
* @author Justin Meckmann                 
* Purpose:  Class do demonstrate the usage of the Book Class.
**/


import java.util.HashSet;

public class BookTest {
    public static void main(String[] args) {
        // print username and timestamp
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString()); 
        System.out.println(); // line wrap

        Book book1 = new Book("TitleA", "Alice", 1970);
        Book book2 = new Book("TitleA", "Alice", 1970); // equal to book1
        Book book3 = new Book("TitleB", "Bob", 1971);   // different book

        System.out.println("Book 1 equals Book 2: " + book1.equals(book2));
        System.out.println("Book 1 equals Book 3: " + book1.equals(book3));

        HashSet<Book> booksHashSet = new HashSet<>();
        booksHashSet.add(book1); 
        booksHashSet.add(book2); // same as book1
        System.out.println("Hash set Size (b1, b2): " + booksHashSet.size()); 

        booksHashSet.add(book3); // different book
        System.out.println("Hash set Size (b1, b2, b3): " + booksHashSet.size()); 
    }
}