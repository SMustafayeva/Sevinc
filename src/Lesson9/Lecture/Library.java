package Lesson9.Lecture;

public class Library {
    public static void main(String[] args) {
        Author author1 = new Author();
        author1.name = "J.K. Rowling";
        author1.birthYear= 1965;

        Book book1 = new Book();
        book1.title = "Harry Potter and the Philosopher's Stone";
        book1.publicationYear = 1997;
        book1.author = author1;


        Author author2 = new Author();
        author2.name = "George Orwell";
        author2.birthYear= 1903;

        Book book2 = new Book();
        book2.title = "1984";
        book2.publicationYear = 1949;
        book2.author = author2;

        Author author3 = new Author();
        author3.name = "Harper Lee";
  //    author3.birthYear=;

        Book book3 = new Book();
        book3.title = "To Kill a Mockingbird";
        book3.publicationYear = 1960;
        book3.author = author3;


        System.out.println(author1);
        System.out.println(book1);
        System.out.println(author2);
        System.out.println(book2);
        System.out.println(author3);
        System.out.println(book3);
    }
}
