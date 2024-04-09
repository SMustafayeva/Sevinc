package Lesson11.Lection;

import java.util.Scanner;

public class Topic_StringClassConcat {
//    String firstName;
//    String lastName;
//
//    public Topic_StringClass(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Please, enter your last name: ");
        String surname = scanner.nextLine();

        System.out.println(name.concat(surname));

    }
}
