package Lesson13.Mentor.Company;

import Lesson13.Mentor.Company.Employee;

public class SalariedEmployee extends Employee {
    private final double annualSalary;

    public SalariedEmployee(String name, String birthDate, String hireDate,
                            long employeeId, double annualSalary,String endOfContract ) {
        super(name, birthDate, hireDate, employeeId, endOfContract);
        this.annualSalary = annualSalary;
    }

    public double getMonthlySalary() {
        return annualSalary/12;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Salary: " + getMonthlySalary());
    }
}
