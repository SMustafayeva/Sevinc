package Lesson13.Mentor.Company;

public class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    public Employee(String name, String birthDate, String hireDate, long employeeId, String endOfContract) {
        super(name, birthDate, endOfContract);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Contract start date: "+ hireDate);
        System.out.println("Employee ID: "+employeeId);
    }
}
