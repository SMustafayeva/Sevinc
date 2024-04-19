package Lesson15.Lection.Interface;

public class Main {
    public static void main(String[] args) {
        ResizableRectangle rectangle = new ResizableRectangle();
        System.out.println("Rectangle area: " + rectangle.resize(5,3));
        Rhombus rhombus = new Rhombus();
        System.out.println("Rhombus area: " + rhombus.resize(7,9));
    }
}
