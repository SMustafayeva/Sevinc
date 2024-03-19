package Lesson9.Mentor.Homework;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Kabab details(name price)");
        String kababName = scanner.next();
        double kababPrice = scanner.nextDouble();
        Kabab kabab = new Kabab (kababName,kababPrice);

        System.out.println("Enter Meze details(name price)");
        String mezeName = scanner.next();
        double mezePrice = scanner.nextDouble();
        Meze meze = new Meze (mezeName,mezePrice);

        System.out.println("Enter Drinks details(name price)");
        String drinksName = scanner.next();
        double drinksPrice = scanner.nextDouble();
        Drinks drinks = new Drinks (drinksName,drinksPrice);

        Menu menu = new Menu(kabab, meze, drinks);
 System.out.println("\nMenu:");
 System.out.println(menu);
    }
}
