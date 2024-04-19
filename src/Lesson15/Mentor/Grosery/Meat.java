package Lesson15.Mentor.Grosery;

public class Meat implements Product{

    private String name;
    private double unitPrice;
    private double amount;

    public Meat(String name, double unitPrice, double amount) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.amount = amount;
    }

    @Override
    public double getUnitPrice(double unitPrice) {
        return unitPrice;
    }

    @Override
    public double getAmount(double amount) {
        return amount;
    }

    @Override
    public double getCost() {
        return amount * unitPrice;
    }
}
