package Lesson4;

import java.util.Scanner;

public class Homework4ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your exam score:");
        int a = scanner.nextInt();
        String score = (a<0 || a>100) ? "Error score":
        (a>=91 && a<=100) ? "A":
        (a>=81 && a<=90) ? "B":
        (a>=71 && a<=80) ? "C":
        (a>=61 && a<=70) ? "D":
        (a>=0 && a<=60) ? "F" : "Wrong score";

        System.out.println("Your grade: " + score);


    }
}
