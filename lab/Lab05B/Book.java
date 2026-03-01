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

    @Override
    public String toString() {
        return String.format("%s (%d) by %s",this.title, this.year, this.author);
    }

    @Override
    public boolean equals(Object o) {
        // cannot access private fields from other class, as the toString uses all three fields, 
        // this method is used to compare two classes.
        if (o.toString().equals(this.toString())) {
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
