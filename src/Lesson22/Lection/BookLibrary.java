package Lesson22.Lection;

import Lesson22.Lection.ComparableInterface.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookLibrary {
    public static void main(String[] args) {
        List<ComparableComparator> books = new ArrayList<>();
        books.add(new ComparableComparator("Harry Potter and the Philosopher's Stone", "J.K.Rowling", 1997, 10));
        books.add(new ComparableComparator("Pride and Prejudice", "Jane Austen", 1813, 18));
        books.add(new ComparableComparator("The Count of Monte Cristo", "Alexandre Dumas", 1844, 12));
        books.add(new ComparableComparator("Les Misérables", "Victor-Marie Hugo", 1862, 17));
        books.add(new ComparableComparator("Crime and Punishment", "Fyodor Dostoevsky", 1866, 20));

        Collections.sort(books);
        for (ComparableComparator book : books) {
            System.out.println(book);
        }
    }
}
