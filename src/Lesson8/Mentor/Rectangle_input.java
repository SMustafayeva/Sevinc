package Lesson8.Mentor;

public class Rectangle_input {
    String color;
    double width;
    double length;
    double area;

    public double calculateArea (){

        return width*length;
    }
    public void printShape (){
        if(width==length){
        System.out.println(color + "square is "+ calculateArea()+"sq. metres.");}
        else {
            System.out.println(color + "rectangle is " + calculateArea() + "sq. metres.");
        }
    }
}
