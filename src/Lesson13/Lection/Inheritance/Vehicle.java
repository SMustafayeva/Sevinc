package Lesson13.Lection.Inheritance;

public class Vehicle {
    private String make;
   private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
