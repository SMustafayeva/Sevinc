package Lesson7.Mentor;

import java.util.Scanner;

public class MentorHomeworkDimention {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String [][] array = new String[5][5];
        System.out.println("Please, input a string: ");
        String userString = scanner.nextLine();
        System.out.println("Which row do you want to replace it?");
        int rows = scanner.nextInt();
        System.out.println("Which row do you want to replace it?");
        int columns = scanner.nextInt();
        System.out.println("Here is the array:");
        array [rows][columns] = userString;

        for (String[] table :array){
            for(String request : table){
                System.out.print(request != null ? request : "-" +" ");
            }
            System.out.println();
        }
    }
}
