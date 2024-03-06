package Lesson7;

import java.util.Scanner;

public class CarParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the quantity of cars: ");
        int numOfCars = scanner.nextInt();
        scanner.nextLine();
        String[]brands = new String[numOfCars];
        String[] models = new String[numOfCars];
        int[] years = new int[numOfCars];
        String[] parkingLocations = new String[numOfCars];
        for (int i = 0; i < numOfCars; i++) {
            System.out.print("Please car's make" + (i+1) + ": ");
            brands[i] = scanner.nextLine();
            System.out.print("Please car's model" + (i+1) + ": ");
            models[i] = scanner.nextLine();
            System.out.print("Please car's years" + (i+1) + ": ");
            years[i] = scanner.nextInt();
            scanner.nextLine();
        }
        for (int i = 0; i < numOfCars; i++) {
            parkingLocations[i] = findParkingLocation(brands[i],models[i],years[i]);
        }
        for (int i = 0; i < numOfCars; i++) {
            System.out.println("Car"+ (i+1)+ "is on the place number: " + parkingLocations[i]);
        } scanner.close();
    }
    private static String  findParkingLocation(String brand,String model, int year){
        return "Parking A";
    }
}
