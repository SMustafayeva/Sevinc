package Lesson13.Mentor.Company;

public class Worker {
    private String name;
    private String birthDate;
    private String endOfContract;

    public Worker(String name, String birthDate, String endOfContract) {
        this.name = name;
        this.birthDate = birthDate;
        this.endOfContract = endOfContract;
    }

    public String retire(){
        return endOfContract;
    }
    public void printDetails(){
        System.out.println("Personal info:");
        System.out.println("Name: " + name);
        System.out.println("Birth date: " + birthDate);
        System.out.println("Contract expire date: " + endOfContract);
    }
}
