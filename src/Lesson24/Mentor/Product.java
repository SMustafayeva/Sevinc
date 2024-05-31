package Lesson24.Mentor;

public class Product {
    private final long productId;
    private final String productName;
    private final double price;
    private double amount;

    public Product(long productId, String productName, double price, double amount) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.amount = amount;
    }

    public long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "[%d] %s -- %.2f x %.2f₼".formatted(productId, productName, amount, price);
    }
}

