package Lesson6;

import java.util.Scanner;

public class NameInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your name:");
        String inputName = scanner.nextLine();
        char[] nameArray = new char[inputName.length()];

        for (int i = 0; i < inputName.length(); i++) {
            nameArray[i] = inputName.charAt(i);
        }
        System.out.println("The letters of your name is:");
        for(char c: nameArray){
            System.out.print(c+" ");
        }
    }
}
