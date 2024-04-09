package Lesson13.Mentor.ProductClass;

public class CPU extends Product{
    private int cores;
    private double clockSpeed;

    public CPU(String brand, String model, int cores, double clockSpeed) {
        super(brand, model);
        this.cores = cores;
        this.clockSpeed = clockSpeed;
    }

    public String process(int cores, double clockSpeed){
        return "Core: " + cores + ". Clock Speed: " + clockSpeed + "GHz";
    }

    @Override
    public void printDetails() {
        System.out.println("Core: " + cores + " CPU cores");
        System.out.println("Clock speed: " + clockSpeed + " GHz GPU cores");
    }
}
