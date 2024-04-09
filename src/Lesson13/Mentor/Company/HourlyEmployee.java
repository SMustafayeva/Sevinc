package Lesson13.Mentor.Company;

import Lesson13.Mentor.Company.Employee;

public class HourlyEmployee extends Employee {
    private final double hourlySalary;


    public HourlyEmployee(String name, String birthDate, String hireDate, long employeeId, String endOfContract,
                          double hourlySalary) {
        super(name, birthDate, hireDate, employeeId, endOfContract);
        this.hourlySalary=hourlySalary;
    }

    public double getMonthlySalary() {
        return hourlySalary*40*4;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Payment: " + getMonthlySalary());
    }
}
