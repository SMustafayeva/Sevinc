package Lesson22.Lection.ComparableInterface;

import Lesson22.Lection.ComparableInterface.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookShop {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Harry Potter and the Philosopher's Stone","J.K.Rowling",10));
        books.add(new Book("Pride and Prejudice","Jane Austen",18));
        books.add(new Book("The Count of Monte Cristo","Alexandre Dumas",12));
        books.add(new Book("Les Misérables","Victor-Marie Hugo",17));
        books.add(new Book("Crime and Punishment","Fyodor Dostoevsky",20));

        Collections.sort(books);
        for(Book book : books){
            System.out.println(book);
        }
    }
}
