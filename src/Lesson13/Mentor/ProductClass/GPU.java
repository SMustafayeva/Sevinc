package Lesson13.Mentor.ProductClass;

public class GPU extends Product{
    private int vRam;

    public GPU(String brand, String model, int vRam) {
        super(brand, model);
        this.vRam = vRam;
    }

    public void render(){

    }

    @Override
    public void printDetails() {
        System.out.println("GPU: " + vRam + " vRam");
    }
}
