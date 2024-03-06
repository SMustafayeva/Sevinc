package Lesson3;

import java.util.Scanner;

public class Mentor3Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gecedir?");
        String night = scanner.nextLine();
        System.out.println("It hururmu?");
        String dog = scanner.nextLine();


        if (dog.equalsIgnoreCase("hurur")){
            if (night.equalsIgnoreCase("gece")) {
                System.out.println("Ehtiyyatli olun");
            } else {
                System.out.println("It hurur");
            }
        } else {
            System.out.println("Sakitcilikdi");
        }



    }
}


//        System.out.println("It hururmu? Eger hururse 1 yazin hurmurse 0");
//        int answer=scanner.nextInt();
//
//        if(answer==1){
//            System.out.println("problem var");
//        } else if (answer==0) {
//            System.out.println("problem yoxdu");
//        }
//
//       if (itHurur){
//           System.out.println("Ehtiyyatli olun");}
//       else {System.out.println("Sakit olun");}



//        if (gecedir < beli && gecedir < xeyr && gecedir <itHurur) {
//            System.out.println("Ehtiyyatli olun");
//        }
//        if (gecedir < xeyr && itHurur < beli){
//         System.out.println("Ehtiyyatli olun");
//        }
//        if (gecedir < beli && itHurur < xeyr){
//            System.out.println("Sakit olun, it var");
//
//        if (gecedir < xeyr && itHurur < xeyr) {
//                System.out.println("ite xesaret yetirmeyin");




