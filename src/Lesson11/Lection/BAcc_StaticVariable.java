package Lesson11.Lection;

public class BAcc_StaticVariable {

    String name;
    int accNumber;
    int amount;

    static int account = 0;

    public BAcc_StaticVariable(String name, int accNumber, int amount) {
        this.name = name;
        this.accNumber = accNumber;
        this.amount = amount;
        account++;

    }
}


