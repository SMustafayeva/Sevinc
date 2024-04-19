package Lesson15.Mentor.BirdPlane;

public class Main {
    public static void main(String[] args) {
        Animal sparrow = new Bird();
        sparrow.getName("Sparrow");
        sparrow.makeSound("Sparrow");
        Plane boeing = new Plane();
        boeing.takeOff();
        boeing.getDestination("Baku");
        boeing.getCapacity();
        boeing.land();
        boeing.setDestination("NYC");
    }

}
