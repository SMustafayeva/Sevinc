package Lesson12.Lection;

public class LibraryTest {
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("Outliers", "Malcolm Gladwell", 2008);
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Publication year: " + book.getYearOfPublication());
        book.checkOut(false);
        book.isAvailable();
        System.out.println("Book is available? " + book.isAvailable());
        book.returnBook(true);
        System.out.println("Book is available: " + book.isAvailable());
    }

}

