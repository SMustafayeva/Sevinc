package Lesson15.Mentor.BirdPlane;

import Lesson15.Mentor.BirdPlane.Flyable;
import Lesson15.Mentor.BirdPlane.Transport;

public class Plane implements Transport, Flyable {

    @Override
    public String takeOff() {
        System.out.println("Plane is taking off.");
        return null;
    }

    @Override
    public String land() {
        System.out.println("Plane is landing");
        return null;
    }

    @Override
    public int getCapacity() {
        System.out.println("200 person on board");
        return 200;
    }

    @Override
    public String getDestination(String city) {
        System.out.println("From: " + city);
        return null;
    }

    @Override
    public String setDestination(String city) {
        System.out.println("To: " + city);
        return null;
    }
}
