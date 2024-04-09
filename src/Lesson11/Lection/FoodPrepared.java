package Lesson11.Lection;

public class FoodPrepared {
    public static void main(String[] args) {
        Feeder plov = new Feeder("Plov","rice","butter");
        plov.prepareMeal();
        Feeder pizza = new Feeder("Pizza","sausage","tomato","pepper");
        pizza.prepareMeal();
        Feeder chicken = new Feeder("chicken","potatoes","butter","salt");
        chicken.prepareMeal();

    }
}
