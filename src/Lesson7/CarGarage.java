package Lesson7;

import java.util.Arrays;
import java.util.Scanner;

public class CarGarage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] carSpace = {"1", "2", "3", "4", "5"};
        String[] carMake = {"Audi A4 1994", "Bentley Continental GT 2003", "Cadillac", "Dodge", "Ferrari", "Infiniti", "Lamborghini", "Maserati", "Mazda", "Mercedes"};
        String[] carModel = {"A4", "continental GT", "Escalade", "Charger", "488 GTB", "Q50", "Aventador", "GranTurismo", "Mazda3", "E-class"};
        String[] carYear = {"1994", "2003", "1999", "2006", "2015", "2013", "2011", "2007", "2003", "1993"};
   //     String [][] garage = new String[1][1];
        System.out.println("Welcome to our parking service.");

        System.out.println("Please, name your car's make?");
        for (String s : carMake) {
            System.out.print(s + " ");
        }
        String make = scanner.nextLine();

        System.out.println("Please, name your car's model:");
        for (String a : carModel) {
            System.out.print(a + " ");
        }
        String model = scanner.nextLine();

        System.out.println("Please, name your car's year:");

        for (String c : carYear) {
            System.out.print(c + " ");
        }
        String year = scanner.nextLine();


        String[][] garage = {carSpace, carMake, carModel, carYear};
        {
            for (int i = 0; i < carSpace.length; i++) {
                for (int j = 0; j < carMake.length; j++) {
 //                   if userInput
                        }
                    }

        //    System.out.println("Your car is on the "+ carSpace[i]+ " place.");
                }
            }
}


//
//
//Cadillac Escalade 1999
//Dodge Charger 2006
// Ferrari 488 GTB 2015
// Infiniti Q50 2013
//Lamborghini Aventador 2011
//Maserati GranTurismo 2007
//Mazda Mazda3 2003
//Mercedes E-Class 1993