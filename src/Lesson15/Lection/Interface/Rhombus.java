package Lesson15.Lection.Interface;

public class Rhombus implements  Resizable{

    @Override
    public double resize(double xDiagonal, double yDiagonal) {
        return xDiagonal*yDiagonal*0.5;
    }
}
