package Lesson7;

import java.util.Arrays;
import java.util.Scanner;

public class Blackwork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] carPlace = {"1", "2", "3", "4", "5"};
        String[] carMake = {"Audi A4 1994", "Bentley Continental GT 2003","Cadillac Escalade 1999",
                            "Dodge Charger 2006","Mercedes E-Class 1993"};
        String[] carModel = {"A4", "continental GT", "Escalade", "Charger", "488 GTB", "Q50", "Aventador", "GranTurismo", "Mazda3", "E-class"};
        String[] carYear = {"1994", "2003", "1999", "2006", "2015", "2013", "2011", "2007", "2003", "1993"};

        String [][] car =new String[][]{carPlace, carMake,};
        System.out.println(Arrays.deepToString(car));

        for (int i = 0; i < carPlace.length; i++) {
            for (int j = 0; j < carMake.length; j++) {
                if(i==j){
                    System.out.println(car[i][j]);}
                    else {System.out.println(" ");}
                }

            }

        }
//        for(String[] garage : car){
//            for (String g : garage){
//                System.out.println( g+" ");
//            }
//            System.out.println();
        }



