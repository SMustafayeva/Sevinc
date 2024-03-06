package Lesson2;

import java.util.Scanner;

public class Lesson2Calculate {
    public static void main(String[] args) {
        Scanner calculator = new Scanner(System.in);
        System.out.println("Zehmet olmasa deyerleri daxil edin");
        double number=calculator.nextDouble();

        double number1= calculator.nextDouble();
        double sum=number+number1;
        System.out.println("cem="+sum);
        double subtract=number-number1;
        System.out.println("ferq= "+subtract);
        double multiply=number*number1;
        System.out.println("hasil="+multiply);
        double divided = number/number1;
        System.out.println("qismet="+divided);
        double remainder=number%number1;
        System.out.println("qaliq="+remainder);
    }
}
