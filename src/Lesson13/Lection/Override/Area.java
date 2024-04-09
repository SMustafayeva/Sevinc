package Lesson13.Lection.Override;

public class Area {
    public static void main(String[] args) {
        Circle circle = new Circle(4.5);
        Rectangle rectangle = new Rectangle(5,4);
        System.out.println(circle.calculateArea());
        System.out.println(rectangle.calculateArea());
    }
}
