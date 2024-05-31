package Lesson24.Mentor;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String name;
    private double budget;
    private final List<Product> basket = new ArrayList<>();

    public Customer(String name, double budget) {
        this.name = name;
        this.budget = budget;
    }
    public void doShoppingIn(Supermarket store) {
        List<Product> stock = store.getProducts().stream().toList();
        for (Product prod : stock) {
            if (budget > 0) {
                double cost = prod.getAmount() * prod.getPrice();
                if (cost <= budget) {
                    store.removeProduct(prod.getProductId(), prod.getAmount());
                    basket.add(prod);
                    budget -= cost;
                } else {
                    break;
                }
            }
        }
        basket.forEach (System.out::println);
        System.out.println();
        System.out.println(store.getProducts());
    }

    @Override
    public String toString() {
        return name + "'s budget=" + budget + "\n products= " + basket;
    }
}



//
//
//    public void  addProduct(Product... product){
//        for (Product prod: product){
//            if (prod != null && ! products.contains(prod)){
//                products.add(prod);
//            }
//        }
//
//    }
//    void removeProduct(long productId, double amount){
//        for(Product prod: products){
//            if (prod.getId() == productId) {
//                double prodAmount = prod.getAmount();
//                if(amount==prodAmount){
//                    products.remove(prod);
//                }else if (amount< prodAmount){
//                    prod.setAmount(prodAmount-amount);
//                }
//                break;
//            }
//        }
//    }
//}
