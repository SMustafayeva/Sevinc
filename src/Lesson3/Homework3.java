package Lesson3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "A)Please, enter the number:";
        System.out.println(text);
        int a = scanner.nextInt();
        System.out.println("1)User’s input: "+a);

        boolean check = (a > 10);
        if (check){System.out.println("2)Result: Greater than 10");}
        else{System.out.println("2)Result: Less than 10");}

        int negA = -a;
        if (a > 10) {System.out.println("3)Negation: " + negA);}
        else {System.out.println("3)Original value: " +a);}

        boolean checkEvenOdd = a%2==0;
        if (a%2==0) {System.out.println("4)Even number");}
        else {System.out.println("4)Odd number");}

        String text2 = "B)Please, enter decimal number:";
        System.out.println(text2);
        double b = scanner.nextDouble();
        System.out.println("5)User’s inputs sum: "+(a+b));

        int random = (int) (Math.random() * 6 + 1);
        System.out.println("6)" + random);

        if (random > 20 ) {
            System.out.println("7)The result is greater than 20");}
                else {System.out.println ("7)The result is less than 20");}


        }
    }