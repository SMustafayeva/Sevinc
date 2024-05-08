package Lesson16.Mentor.StudentScore;

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        int numberOfStudents;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        numberOfStudents = scanner.nextInt();
        for (int i = 0; i <= numberOfStudents; i++) {
            sum += scanner.nextInt();
        }
        System.out.println(sum / numberOfStudents);
    }
}
