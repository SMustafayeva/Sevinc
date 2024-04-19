package Lesson15.Lection.Segregation;

public class Person implements Swim,Walk{
    @Override
    public void swim() {
        System.out.println("Person is swim");
    }

    @Override
    public void walk() {
        System.out.println("Person is walk");

    }
}
