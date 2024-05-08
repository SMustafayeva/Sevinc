package Lesson20.Lection;

import java.util.ArrayList;
import java.util.List;


public class ArrayListTest {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Peach");
        fruits.add("Watermelon");
        for (String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
