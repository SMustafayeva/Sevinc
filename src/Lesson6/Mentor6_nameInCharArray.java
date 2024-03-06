package Lesson6;

import java.util.Scanner;

public class Mentor6_nameInCharArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String size = scanner.nextLine();
        char[] name = new char[size.length()];

        for (int i = 0; i < size.length(); i++) {
            System.out.println("Please enter the letter of your name");
            name[i] = scanner.next().charAt(i);
        }
        System.out.println("The letters of your name is:");
        for (char letters : name){
            System.out.println(letters + "");
        }
    }
}



