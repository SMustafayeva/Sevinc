package Lesson6;

import java.util.Scanner;

public class BookName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name the :");

        String [] bookDetails = new String [3];
        System.out.println("Please, enter the name of the last book, you have read:");
        bookDetails[0] = scanner.nextLine();
        System.out.println("Enter the book's author:");
        bookDetails[1] = scanner.nextLine();
        System.out.println("Enter the publication year:");
        bookDetails[2] = scanner.nextLine();
        System.out.println("Title: " + bookDetails[0]);
        System.out.println("Author: " + bookDetails[1]);
        System.out.println("Year: " + bookDetails[2]);
    }
}
