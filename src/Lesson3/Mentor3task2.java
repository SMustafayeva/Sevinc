package Lesson3;

import java.util.Scanner;

public class Mentor3task2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int random = (int) (Math.random() * 100);
        System.out.println(random);

        boolean check = random%2==0;
        System.out.println(check);
        if (check){
            System.out.println("Cüt ədəd");
        }
        else {
            System.out.println("Tək ədəd");
        }

    }
}
