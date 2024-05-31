package Lesson24.Mentor;

import java.util.ArrayList;
import java.util.List;

public class BuyAllYouCan {
    public static void main(String[] args) {
//        Product product1 = new Product(12345678910L,"Apple",1.20,1.00);
//        Product product2 = new Product(12345678911L,"Banana",2.50,1.01);
//        Product product3 = new Product(12345678912L,"Mango",3.56,0.47);
//        Product product4 = new Product(12345678913L,"Melon",2.37,5.49);
//        Product product5 = new Product(12345678914L,"Grape",5.64,2.83);
//
//        List<Product> prodList = new ArrayList<>();
//        prodList.add(product1);
//        prodList.add(product2);
//        prodList.add(product3);
//        prodList.add(product4);
//        prodList.add(product5);
//
//        Supermarket supermarket = new Supermarket(prodList);
//        System.out.println("Products in supermarket: ");
//        for (Product p : supermarket.getProducts()){
//            System.out.println(p);
//        }
//        Product product6 = new Product(12345678915L,"Pear",1.85,2.86);
//        supermarket.addProduct(product6);
//        System.out.println("Products after adding new products: ");
//        for (Product p : supermarket.getProducts()){
//            System.out.println(p);
//            supermarket.removeProduct(12345678912L,0.47);
//            supermarket.removeProduct(12345678913L,5.49);
//
//
////        supermarket.removeProduct(12345678912L,0.47);
////        supermarket.removeProduct(12345678913L,5.43);
////        Customer customer1 = new Customer("Anna", 50.00,);
//
////        Customer customer2 = new Customer("Jack", 35.00, (List<Product>) product5);


        Supermarket store = new Supermarket();
        ArrayList<Product> products = new ArrayList<>(List.of (
                new Product(1, "Laptop", 1200.00, 50),
                new Product(2, "Smartphone", 800.00, 150),
                new Product(3, "Tablet", 300.00, 100),
                new Product(4, "Smartwatch", 200.00, 75),
                new Product(5, "Headphones", 100.00, 200),
                new Product(6, "Keyboard", 50.00, 250),
                new Product(7, "Mouse", 40.00, 100),
                new Product(8, "Monitor", 250.00, 80),
                new Product(9, "Printer", 150.00, 60),
                new Product(10, "Camera", 600.00, 40),
                new Product(11, "Speaker", 120.00, 110),
                new Product(12, "External Hard Drive", 80.00, 130),
                new Product(13, "USB Flash Drive", 20.00, 500),
                new Product(14, "Router", 70.00, 90),
                new Product(15, "Webcam", 60.00, 140)
        ));

        products.forEach(store::addProduct);

        Customer c1 = new Customer("Amil", 100_000);

        c1.doShoppingIn(store);



    }
}
