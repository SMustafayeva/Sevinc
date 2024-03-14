package Lesson8.Lecture;

public class Car {
    public static void main(String[] args) {
        Car_factory cars = new Car_factory();
        cars.make = "Mercedes";
        cars.year = "2002";
        cars.model = "Benz";
        cars.produce = false;

        cars.produce(cars.produce);
    }
}
