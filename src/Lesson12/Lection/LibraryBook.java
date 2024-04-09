package Lesson12.Lection;

public class LibraryBook {
    private String title;
    private  String author;
    private int yearOfPublication;
    boolean checkedOut;

    public LibraryBook(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.checkedOut = false;
    }

    public void checkOut(boolean checkedOut) {
        if (checkedOut ==true){
            System.out.println("Book is checked out.");
        } else {
            System.out.println("Book isn't checked out.");
        }
    }

    public void returnBook(boolean checkedOut) {
        if (checkedOut == false) {
            System.out.println("Book is returned to the library and available");
        } else {
            System.out.println("Book is not in the library");
        }
    }
    public boolean isAvailable() {
        return checkedOut;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
