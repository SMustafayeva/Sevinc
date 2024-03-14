package Lesson7;

import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [][] garage = new String[2][3];
        for (int i = 0; i < garage.length; i++) {
            if(garage[i][0]== null){
                System.out.println("Enter details for car: " + (i+1));
                System.out.print("Make: ");
                garage [i][0] = scanner.next();
                System.out.print("Model: ");
                garage [i][1] = scanner.next();
                System.out.print("Year: ");
                garage [i][2] = scanner.next();
                System.out.println("Car parked succesfully");
            }
        }
        System.out.println("Garage is full.No more parking space available.");
    }
}
