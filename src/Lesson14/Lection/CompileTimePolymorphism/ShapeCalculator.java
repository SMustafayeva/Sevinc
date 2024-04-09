package Lesson14.Lection.CompileTimePolymorphism;

public class ShapeCalculator {
    double length;
    double width;
    double base;
    double radius;

    public double calculateArea(double length,double width){
        return length*width;
    }
    public double calculateArea (double radius){
        return Math.PI*radius*radius;
    }
    public double calculateArea (double base, int height){
        return 0.5 * base* height;
    }
}
