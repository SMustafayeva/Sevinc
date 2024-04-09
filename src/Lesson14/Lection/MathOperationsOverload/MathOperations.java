package Lesson14.Lection.MathOperationsOverload;

public class MathOperations {
    public int add (int a, int b){
        return  a+b;
    }
    public double add (int a, double b){
        return  a+b;
    }
    public int subtract (int a, int b){
        return  a-b;
    }
    public double subtract (int a, double b){
        return  a-b;
    }
    public int subtract (int a, int b, int c){
        return a-b-c;
    }
    public int multiplyDivide (int a, int b ){
        return a*b;
    }
    public int multiplyDivide (int a, int b, int c){
        return a/b/c;
    }
}
