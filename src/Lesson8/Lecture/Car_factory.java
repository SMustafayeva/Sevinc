package Lesson8.Lecture;

public class Car_factory {

    String make;
    String model;
    String year;
    boolean produce = true;

    public void produce(boolean produce) {
        if (produce) {
            System.out.println(make + " " + model + " " + year);
        } else {
            System.out.println("Does not belong to the factory");
        }
    }
    }

