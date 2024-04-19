package Lesson14.Mentor.Exercise;

public class AdvancedMathOperations extends MathOperations {

 //   @Override
    public int multiply(int num1, int num2, boolean flag) {
        if (flag) {
           return (int) Math.pow(num1, num2);
        } else {
        return super.multiply(num1, num2);
        }
    }
}
