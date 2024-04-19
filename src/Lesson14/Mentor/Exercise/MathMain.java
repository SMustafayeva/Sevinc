package Lesson14.Mentor.Exercise;

public class MathMain {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        AdvancedMathOperations method = new AdvancedMathOperations();
        int result1 = math.multiply(3,4);
        double result2 = math.multiply(3.7,4.5);
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);

        int result3 = method.multiply(4,5,true);
        int result5 = method.multiply(4,5,false);
        int result4 = method.multiply(6,4);
        System.out.println("Result 3: " + result3);
        System.out.println("Result 4: " + result4);
        System.out.println("Result 5: " + result5);
    }
}
