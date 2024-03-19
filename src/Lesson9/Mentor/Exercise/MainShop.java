package Lesson9.Mentor.Exercise;

public class MainShop {
    public static void main(String[] args) {
        Item i1 = new Item("un",1);
        Item i2 = new Item("sheker",2);
        Item i3 = new Item("yumurta", 0.20);


        ShoppingList sl =new ShoppingList();
        sl.addItem(i1);
        sl.addItem(i2);
        sl.addItem(i3);

        System.out.println(sl);

    }
}
