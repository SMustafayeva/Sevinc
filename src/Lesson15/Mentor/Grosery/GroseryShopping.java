package Lesson15.Mentor.Grosery;

import Lesson9.Mentor.Exercise.Item;

import java.util.Arrays;

public class GroseryShopping {
    Product[] shoppingList = new Product[0];
    private int index;


    public void addProduct(Product product) {
        int len = shoppingList.length;
        shoppingList = Arrays.copyOf(shoppingList, len + 1);
        shoppingList[len] = product;
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Product p : shoppingList) {
            totalCost += p.getCost();
        }
        return totalCost;
    }

    public void printReceipt() {
        System.out.println("Receipt: ");
        System.out.println();

    }
}
