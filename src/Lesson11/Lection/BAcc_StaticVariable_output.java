package Lesson11.Lection;

public class BAcc_StaticVariable_output {
    public static void main(String[] args) {
        BAcc_StaticVariable account1 = new BAcc_StaticVariable("Aliyev",232432,4);
        BAcc_StaticVariable account2 = new BAcc_StaticVariable("Agayev",232433,200);
        BAcc_StaticVariable account3 = new BAcc_StaticVariable("Agasiyev",232434,1000);


        System.out.println(BAcc_StaticVariable.account);

    }
}
