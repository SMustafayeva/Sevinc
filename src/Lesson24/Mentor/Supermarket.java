package Lesson24.Mentor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Supermarket {
    private final List<Product> products = new ArrayList<Product>();

    public void addProduct(Product prod) {
        if (prod != null && !products.contains(prod)) {
            products.add(prod);
        }
    }

    void removeProduct(long productId, double amount) {
        for (Product prod : products) {
            if (prod.getProductId() == productId) {
                double prodAmount = prod.getAmount();
                if (amount == prodAmount) {
                    products.remove(prod);
                } else if (amount < prodAmount) {
                    prod.setAmount(prodAmount - amount);
                }
                break;
            }
        }
    }
    public List<Product> getProducts() {
        products.sort(Comparator.comparingDouble(Product::getPrice));
        return products;
    }
}
