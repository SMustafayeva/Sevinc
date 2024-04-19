package Lesson15.Mentor.BirdPlane;

import Lesson15.Mentor.BirdPlane.Animal;
import Lesson15.Mentor.BirdPlane.Flyable;

public class Bird implements Animal, Flyable {


    @Override
    public void getName(String name) {
        System.out.println(name + " is a bird.");
    }
    @Override
    public void makeSound(String name) {
        System.out.println(name + " makes sound.");
    }

    @Override
    public String takeOff() {
        System.out.println("Bird can take off.");
        return null;
    }

    @Override
    public String land() {
        System.out.println("Bird can land.");
        return null;
    }
}
