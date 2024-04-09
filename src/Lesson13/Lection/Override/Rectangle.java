package Lesson13.Lection.Override;

public class Rectangle extends Shape{
    private double lenght;
    private double wight;

    public Rectangle(double lenght, double wight) {
        this.lenght = lenght;
        this.wight = wight;
    }

    @Override
    public double calculateArea() {
        return lenght*wight;
    }
}
