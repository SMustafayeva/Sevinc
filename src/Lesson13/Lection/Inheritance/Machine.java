package Lesson13.Lection.Inheritance;

public class Machine {
    public static void main(String[] args) {
        Bike bike = new Bike("Classic","Kit Road",2);
        Car car = new Car("Mercedes","Benz",4);
        System.out.println("Bike:"+bike.getMake()+ " "+bike.getModel());
        System.out.println("Number of wheels is " +bike.getNumWheels() );
        System.out.println("Car:"+car.getMake()+ " "+car.getModel());
        System.out.println("Number of doors is "+ car.getNumDoors());
    }

}
