package Lesson7.Lection;

import java.util.Scanner;

public class Garage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] garage = {"1", "2", "3", "4", "5"};
        String[] cars = {"Audi A4 1994", "Cadillac Escalade 1999", "Ferrari 488 GTB 2015", "Lamborghini Aventador 2011", "Mercedes E-Class 1993"};

        System.out.println("Welcome to our parking service.");

        for (int i = 0; i < garage.length; i++) {
            for (int j = 0; j < cars.length; j++) {
                System.out.print(garage [j] + " ");
        }System.out.print(cars[i] + " ");
    //        System.out.println("is on the " +garage[i] + " " + "place");
        }
    }

}

