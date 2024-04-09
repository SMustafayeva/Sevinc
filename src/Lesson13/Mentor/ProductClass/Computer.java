package Lesson13.Mentor.ProductClass;

public class Computer {
    // Brand - Apple
    // model - MacBook Pro
    // CPU - 14 CPU cores
    // 4.1 GHz
    // GPU 512 GB
    //clock speed 3.5 GHz
    public static void main(String[] args) {
        Product computer = new Product("Apple", "Macbook Air 14 ");
        CPU cpu = new CPU("Apple", "Macbook Air 14", 14, 30);
        GPU gpu = new GPU("Apple", "Macbook Air 14", 128);
        cpu.printDetails();
        gpu.printDetails();
        Laptop laptop = new Laptop("Apple", "Macbook Air 14", cpu, gpu);

        System.out.println("Computer info:");
        laptop.printDetails();


    }
}
