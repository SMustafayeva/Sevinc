package Lesson9.Mentor.Exercise;

import java.util.Arrays;

public class ShoppingList {
    Item [] items = new Item[0];

 //   public void addItem(Item i){
    public void addItem (Item... newItems) {
        for (Item i : newItems) {
            items = Arrays.copyOf(items, items.length + 1);
            items[items.length - 1] = i;
        }
    }
    public double totalCost() {
        double sum = 0;
        for (Item i : items) {
            sum += i.getPrice();
        }
        return sum;
    }
        @Override
        public String toString () {
            String list = "";
            for (Item i : items) {
                list += i + "\n";
            }
            list += "Total is: " + totalCost();
            return list;
        }
    }
