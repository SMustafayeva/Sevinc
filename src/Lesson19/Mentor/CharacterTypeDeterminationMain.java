package Lesson19.Mentor;

import java.util.Scanner;

public class CharacterTypeDeterminationMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the Character Type Guessing Game!");
        System.out.println("Answer the following questions to find out your character type.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you outgoing and sociable? yes/no)");
        boolean social = scanner.nextBoolean();
        System.out.println("Do you enjoy spending time alone? (yes/no)");
        boolean alone = scanner.nextBoolean();
        System.out.println("Are you comfortable in both social and solitary situations? (yes/no)");
        boolean both = scanner.nextBoolean();

        System.out.println("Your character type is: ");
        System.out.println(CharacterDeterminator.getType(social, alone, both));
    }
}
