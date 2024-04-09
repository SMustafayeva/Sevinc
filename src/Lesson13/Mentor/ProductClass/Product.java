package Lesson13.Mentor.ProductClass;

public class Product {
    private String brand;
    private String model;

    public Product(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public final String getInfo()  {
        return brand + " " + model;
    }
     public void printDetails(){
         System.out.println("Brand: " + brand);
         System.out.println("Model: " + model);
    }
}
