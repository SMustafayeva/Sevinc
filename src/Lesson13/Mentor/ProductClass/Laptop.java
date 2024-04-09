package Lesson13.Mentor.ProductClass;

public class Laptop extends Product{
    private CPU cpu;
    private GPU gpu;
    public Laptop(String brand, String model, CPU cpu, GPU gpu) {
        super(brand, model);
        this.cpu = cpu;
        this.gpu = gpu;
    }

    public void start(){

    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("CPU: " + cpu);
        System.out.println("GPU: " + gpu);
    }
}
