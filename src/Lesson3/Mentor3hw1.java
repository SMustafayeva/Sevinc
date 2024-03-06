package Lesson3;

import java.util.Scanner;

public class Mentor3hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String gece = "Beli,gecedir.";
//        String gunduz = "Beli,gunduzdur.";
//        String gecedir = "Xeyr,gunduzdur.";
//        String gunduzdur = "Xeyr,gecedir.";
//        String itHurur = "It hurur.";
//        String itHurmur = "It hurmur.";
//        String cavabBeli = "Beli";
//        String cavabXeyr = "Xeyr";

        System.out.println("It hururmu? Eger hururse 1 yazin hurmurse 0");
        int answer=scanner.nextInt();

        if(answer==1){
            System.out.println("problem var");
        } else if (answer==0) {
            System.out.println("problem yoxdu");
        }



       /*



        System.out.println(gece);
        System.out.println(gunduz);
        System.out.println(gecedir);
        System.out.println(gunduzdur);
        System.out.println(itHurur);
        System.out.println(itHurmur);*/

    }
}