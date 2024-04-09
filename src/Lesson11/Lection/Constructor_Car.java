package Lesson11.Lection;

public class Constructor_Car {
    String make;
    String model;

    public Constructor_Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    @Override
    public String toString() {
        return make + " " + model;
    }
}
