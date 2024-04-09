package Lesson11.Lection;

import Lesson11.Lection.Constructor_Car;

public class Constructor_Car_output {
    public static void main(String[] args) {
        Constructor_Car car = new Constructor_Car("C-class","Benz");
        Constructor_Car car1 = new Constructor_Car("E-class","Benz");

       String make = "Mercedes";
        System.out.println( make + " " + car.toString());
    }
}
