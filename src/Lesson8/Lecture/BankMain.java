package Lesson8.Lecture;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        bankAccount.balance = 10;
        System.out.println("Please, choose the operation: Deposit or Cashdraw.");
        String client = scanner.nextLine();
        System.out.println("Please, enter the amount");
        bankAccount.amount = scanner.nextDouble();

        if (client.equalsIgnoreCase("Deposit")){
            bankAccount.deposit(bankAccount.amount);
        } else if (client.equalsIgnoreCase("Cashdraw")) {
            bankAccount.cashdraw(bankAccount.amount);
        };
        }
    }
