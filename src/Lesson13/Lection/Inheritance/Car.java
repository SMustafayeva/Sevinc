package Lesson13.Lection.Inheritance;

public class Car extends Vehicle {
    private int numDoors;

    public Car(String make, String model, int numDoors) {
        super(make, model);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }
}
