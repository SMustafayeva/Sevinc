package Lesson13.Mentor.Company;

import Lesson12.Mentor.Contact;

public class Company {
    public static void main(String[] args) {
        Company company = new Company();
        Worker worker = new Worker("Ali", "1990","2000");
        worker.printDetails();
        Employee employee = new Employee("Adil","1991","2000",342566789,"2003");
        employee.printDetails();
        SalariedEmployee sEmployee = new SalariedEmployee("Asim","1989",
                "2004",765865765,12000.48,"2015");
        sEmployee.printDetails();
        HourlyEmployee hEmpl = new HourlyEmployee("Amin","1987","2015",
                7687685,"2016",10);
        hEmpl.printDetails();
    }
}
