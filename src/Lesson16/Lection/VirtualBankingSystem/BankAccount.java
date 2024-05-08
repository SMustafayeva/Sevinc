package Lesson16.Lection.VirtualBankingSystem;

import javax.naming.InsufficientResourcesException;

public class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }



    public void depositAmount(double depositAmount) {
        System.out.println(depositAmount + " deposited to the balance.");
        System.out.println("Your new balance: " + balance + depositAmount);
    }

    public void withdrawAmount(double withdrawAmount) throws InsufficientResourcesException {
        if (withdrawAmount > balance) {
            throw new InsufficientResourcesException("Insufficient funds");
        }else {
            balance -= withdrawAmount;


            System.out.println(withdrawAmount + " withdrawed from the balance.");
            System.out.println("Your new balance: " + balance);
        }


        }

//    public void transferFunds(double transferFunds, double amount) throws InsufficientResourcesException{
//         withdrawAmount(transferFunds);
//            des





//    }
}
