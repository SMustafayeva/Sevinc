package Lesson8.Lecture;

public class BankAccount {
    String accountNumber;
    double balance;
    double amount;
    double cashdrawAmount;

    
    public double deposit( double Cash) {

        System.out.println("Your balance is:"+ (balance+amount));
        return balance+ amount;
    }
    public double cashdraw(double Cash){
        if(amount>balance){
            System.out.println("Insufficient amount.");
        } else if (amount<balance ) {
            System.out.println("Your balance is: "+(balance-amount));
        }
        return balance-amount;
    }
}
