package Lesson14.Lection.RuntimePolymorphism;

public class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car is a vehicle");
    }
}
