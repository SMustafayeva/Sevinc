package Lesson20.Lection;

public class PairMain {
    public static void main(String[] args) {
        Pair <Integer,Integer> pair1 = new Pair<>(5,6);
        System.out.println("First Integer's value: " + pair1.valueA);
        System.out.println("Second Integer's value: " + pair1.valueB);
        Pair <Integer,String> pair2 = new Pair<>(7,"Wonders");
        System.out.println(pair2.valueA + " " + pair2.valueB + " of the world");

    }
}
