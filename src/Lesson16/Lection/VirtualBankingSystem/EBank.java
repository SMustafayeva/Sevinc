package Lesson16.Lection.VirtualBankingSystem;

import javax.naming.InsufficientResourcesException;

public class EBank {
    public static void main(String[] args) throws InsufficientResourcesException {
        BankAccount acc1= new BankAccount(43568,"Aliyev", 207);
        BankAccount acc2= new BankAccount(43569,"Agayev", 3000);
        BankAccount acc3= new BankAccount(43588,"Agasiyev", 20);
        BankAccount acc4= new BankAccount(43598,"Alimov", 2340);
        acc1.withdrawAmount(5);
        acc2.withdrawAmount(4000);
        acc3.withdrawAmount(50000);
        acc4.withdrawAmount(23);


    }
}
