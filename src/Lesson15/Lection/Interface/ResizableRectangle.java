package Lesson15.Lection.Interface;

public class ResizableRectangle implements Resizable{
    double length;
    double width;
    @Override
    public double resize(double length, double width) {
        return length * width;
    }
}
