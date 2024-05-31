package Lesson24.Lection;

public class MainLambda {
    public static void main(String[] args) {
        IntFcLambda positive = x -> System.out.println(x + (x>= 0 ? " is positive." : " is negative."));

        positive.check(-5);
        positive.check(3);
        };
    }