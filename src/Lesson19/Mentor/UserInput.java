package Lesson19.Mentor;

import javax.swing.*;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputValidator validator = new InputValidator();

        while (true){
            System.out.println("Please, enter your input: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")){
                break;
            }
            InputCategory category = validator.categorizeInput(input);
            System.out.println("Input category: " + category.getCategory());
        }
    }
}
