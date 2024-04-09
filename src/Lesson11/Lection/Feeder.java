package Lesson11.Lection;

public class Feeder {
    static String ingredients = "";
    String food;

    public Feeder(String food, String... products) {
        this.food = food;
        for(String product : products) {
            addProduct(product);
        }
    }
    public void prepareMeal() {
        System.out.println("Products:" + ingredients);
        System.out.println("Meal: " + food);
    }
    public void addProduct(String product) {
        if (!ingredients.isEmpty()) {
            ingredients += ", ";
        }
        ingredients += product;
    }

}
