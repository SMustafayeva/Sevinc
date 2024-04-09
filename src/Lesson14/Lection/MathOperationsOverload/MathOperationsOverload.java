package Lesson14.Lection.MathOperationsOverload;

public class MathOperationsOverload {
    public static void main(String[] args) {
        MathOperations operation = new MathOperations();

        System.out.println("Sum of 2 integers = " + operation.add( 7,8));
        System.out.println("Sum of integer and double = " + operation.add(5,4.3));
        System.out.println("Difference of 2 integers = " + operation.subtract(6,3));
        System.out.println("Difference of integer and double = " + operation.subtract(6,3.6));
        System.out.println("Difference of 3 integers = " + operation.subtract(6,3,1));
        System.out.println("Product of 2 integers = " + operation.multiplyDivide(5,6));
        System.out.println("Quotient of 3 integers = " + operation.multiplyDivide(30,5,2));

    }
}
