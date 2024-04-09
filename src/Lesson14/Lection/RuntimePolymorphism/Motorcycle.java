package Lesson14.Lection.RuntimePolymorphism;

public class Motorcycle extends Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle is a Vehicle");
    }
}
