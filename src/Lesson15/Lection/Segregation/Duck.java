package Lesson15.Lection.Segregation;

public class Duck implements Swim,Fly,Walk{
    @Override
    public void Fly() {
        System.out.println("Duck can fly");
    }

    @Override
    public void swim() {
        System.out.println("Duck can swim");
    }

    @Override
    public void walk() {
        System.out.println("Duck can walk");
    }
}
