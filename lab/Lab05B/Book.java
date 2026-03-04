/**
* Book.java 
* @author Justin Meckmann                 
* Purpose:  Class that stores information to a book, using the fields: 
            - title, author & year with corresponding getter functions

            Overwrites toString, equals and hashCode
**/


import java.util.Objects;

public class Book {
    private String title; 
    private String author; 
    int year; 

    public Book(String title, String author, int year) {
        this.title = title; 
        this.author = author; 
        this.year = year;  
    }

    // getter methods --> needed to compare the properties of two objects in equals 
    public String getTitle() {
        return this.title; 
    }

    public String getAuthor() {
        return this.author; 
    }

    public int getYear() {
        return this.year; 
    }

    @Override
    public String toString() {
        return String.format("%s (%d) by %s",this.title, this.year, this.author);
    }

    @Override
    public boolean equals(Object o) {
        // check if object is same reference as current object
        if (o == this) {
            return true; 
        }

        Book book = (Book) o; // cast to type Book -> required to use getter functions

        // this method is used to compare two classes.
        if (this.title.equals((book.getTitle())) && this.author.equals(book.getAuthor()) && this.year == book.getYear()) {
            return true; 
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.title, this.author, this.year); 
    }
}
