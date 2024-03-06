package Lesson4;

import java.util.Scanner;

public class ExamScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Please, enter your score:");
        int score = scanner.nextInt();
//        if (score%10==0){
//        score=score/10;
//            score --;}
        switch ((score-1)/10){
            case 9:
                System.out.println("Your grade: A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5,4,3,2,1,0:
                System.out.println("F");
                break;
            default:
                System.out.println("Error score");
        }
    }}




//        String scoreA = a>=81 && a<91;

//        switch (a){
//            case "A" 0:
//
//        }


//        switch (a) {
//            case a>91 && a<101:
//
//                    System.out.println("A");
//                    break;
//            case 2:
//                        if (a >= 81 && a < 91) {
//                            System.out.println("B");
//                            break;
//            //case 3:


//        switch (a){
//            case a>60:
//                System.out.println("A");
//                break;
//            case 2:
//                System.out.println("B");
//                break;
//            case 3:
//                System.out.println("C");
//                break;
//            case 4:
//                System.out.println("D");
//                break;
//            case 5:
//                System.out.println("F");
//                break;
//            case 6:
//                System.out.println("Error score");
//                break;}

