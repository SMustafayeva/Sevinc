package Lesson9.Mentor.Homework;

public class Drinks {
    String name;
    double price;

    public Drinks(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Drinks(" +
                "name='" + name + '\'' +
                ", price=" + price +
                ')';
    }
}
