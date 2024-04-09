package Lesson11.Lection;

public class CircleArea {
    // Area = pi*r v kvadrate
    double radius;

    public CircleArea(double radius) {
        this.radius = radius;
    }
    public double area(){
        return Math.PI * radius*radius;
    }
    public static void main(String[] args) {
        CircleArea circle = new CircleArea(5);
        CircleArea circle1 = new CircleArea(6);
        System.out.println(circle.area());
        System.out.println(circle1.area());
    }
}
