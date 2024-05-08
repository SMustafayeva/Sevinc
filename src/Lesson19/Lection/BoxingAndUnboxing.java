package Lesson19.Lection;

public class BoxingAndUnboxing {
    public static void main(String[] args) {
        int x = 10;
        Integer boxX = 5;
        int boxedX = Integer.valueOf(x);
        System.out.println(boxedX);
        int unboxX = boxX.intValue();
        System.out.println(unboxX);
    }

}
