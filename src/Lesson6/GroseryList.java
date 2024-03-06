package Lesson6;

import java.util.Scanner;

public class GroseryList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What will you buy today?");
        String [] grosery = new String[7];

        for (int i = 0; i < grosery.length ; i++) {
            grosery[i] = scanner.nextLine();
        }


    }
}
