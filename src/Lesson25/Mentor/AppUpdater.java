package Lesson25.Mentor;

import java.util.Scanner;

import static Lesson25.Mentor.ApplicationUpdater.applications;
import static Lesson25.Mentor.ApplicationUpdater.setup;

public class AppUpdater {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        setup(new Application("Intellij", 3.5), scanner);
        setup(new Application("Intellij", 3.7), scanner);
        setup(new Application("Intellij", 3.9), scanner);
        setup(new Application("Intellij", 4.0), scanner);
        long endTime = System.currentTimeMillis();
        System.out.println("Execution time: " + (endTime - startTime) + "ms");
    }
    public static void setup (Application app, Scanner scanner){
        //  Double curVer = applications.get
    }
}
