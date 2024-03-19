package Lesson9.Mentor.Homework;

import Lesson9.Mentor.Exercise.Item;

import java.util.Arrays;

public class Menu {
    Kabab kabab;
    Meze meze;
    Drinks drinks;

    public Menu(Kabab kabab, Meze meze, Drinks drinks) {
        this.kabab = kabab;
        this.meze = meze;
        this.drinks = drinks;
    }
    public double calculateTotalPrice (){
        return kabab.getPrice() + meze.getPrice()+drinks.getPrice();
    }

    @Override
    public String toString() {
        return "Menu{" +
                "kabab=" + kabab +
                ", meze=" + meze +
                ", drinks=" + drinks +
                '}'+ "\nTotal: " + calculateTotalPrice() + " AZN";
    }
}
