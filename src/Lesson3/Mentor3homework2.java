package Lesson3;

import java.util.Scanner;

public class Mentor3homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yashinizi qeyd edin:");
        int a = scanner.nextInt();
        String ushaq = "Ushaqsiniz";
        String cavan = "Cavansiniz";
        String qoca = "Yashlisiniz";

        if (a < 18 ) {
            System.out.println(ushaq);
        } else if (a>=18 && a<36) {
            System.out.println(cavan);
        } else {
            System.out.println(qoca);
        }
    }
}



