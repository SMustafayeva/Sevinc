package Lesson4;

import java.util.Scanner;

public class Days_In_A_Month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
         String month;
       switch (x) {
           case "January", "March", "May","July","August", "October", "December":
               System.out.println("31 days");
               break;
           case "February":System.out.println("28 or 29 days");
               break;
           case "April", "June", "September", "November":
               System.out.println("30 days");
               break;
           default:
               System.out.println("Wrong input!");
       }

    }
}
