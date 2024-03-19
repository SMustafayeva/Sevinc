package Lesson9.Lecture;

public class Book {
    String title;
    int publicationYear;
    Author author;


    @Override
    public String toString() {
        return "Book:" +
                title +
                " (" + author.name +
                ", Publication Year:" + publicationYear +
                ')';
    }
}
