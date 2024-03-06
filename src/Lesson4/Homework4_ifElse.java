package Lesson4;

import java.util.Scanner;

public class Homework4_ifElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if ( a>=91 && a<101){
            System.out.println("A");
        }
          else if (a>=81 && a<91){
            System.out.println("B");
        } else if (a>=71 && a<81 ) {
                System.out.println("C");
        } else if (a>=61 && a<71) {
              System.out.println("D");
        } else if (a>=0 && a<61) {
              System.out.println("F");
        } else{
              System.out.println("Error score number");
          }

        }
}




