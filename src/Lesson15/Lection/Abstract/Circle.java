package Lesson15.Lection.Abstract;

public class Circle extends Shape {
    double radius;
    @Override
    double calculateArea() {
       return Math.PI*radius*radius;
    }
}
