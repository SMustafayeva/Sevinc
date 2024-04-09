package Lesson14.Lection.RuntimePolymorphism;

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        car.start();
        motorcycle.start();
    }
}
