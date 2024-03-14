package Lesson7;

import java.util.Arrays;
import java.util.Scanner;

public class Garages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] place = {"1", "2", "3", "4", "5"};
        String[] car = {"Audi A4 1994", "Bentley Continental GT 2003", "Cadillac Escalade 1999",
                "Dodge Charger 2006", "Mercedes E-Class 1993"};
        String[][] garage = {place, car};
        System.out.println(Arrays.deepToString(garage));

        System.out.println("Welcome to our parking service.");
      for (int i = 0; i < car.length; i++) {
            for (int j = 0; j < place.length; j++) {

                System.out.print(place[j] + " ");
            }System.out.println(car[i]);

//
//        for (String p : place) {
//            for (String c : car) {
//                System.out.println(p + "-" + " " + c);
//            }

                }
            }

        }

