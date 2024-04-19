package Lesson15.Lection.Abstract;

public class Square extends Shape {
    double side;
    @Override
    double calculateArea() {
        return side*side;
    }
}
