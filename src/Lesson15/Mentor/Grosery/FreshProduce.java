package Lesson15.Mentor.Grosery;

public class FreshProduce implements Product{

    private String name;
    private double unitPrice;
    private double amount;

    public FreshProduce(String name, double unitPrice, double amount) {
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
        return unitPrice*amount;
    }

    @Override
    public String toString() {
        return "FreshProduce{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", amount=" + amount +
                '}';
    }
}
