package Lesson14.Lection.CompileTimePolymorphism;

import Lesson9.Mentor.Homework.Restaurant;

public class CompilePolymorphism {
    public static void main(String[] args) {
        ShapeCalculator rectangle = new ShapeCalculator();
        System.out.println("Rectangle: "+rectangle.calculateArea(7,4.0) );;
        ShapeCalculator circle = new ShapeCalculator();
        System.out.println("Circle: " + circle.calculateArea(4.5));;
        ShapeCalculator triangle = new ShapeCalculator();
        System.out.println("Triangle: "+triangle.calculateArea(4.0,3));;
    }
}
