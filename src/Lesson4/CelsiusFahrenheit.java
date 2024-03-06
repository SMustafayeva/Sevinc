package Lesson4;

import java.util.Scanner;

public class CelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, choose the temperature Type: F or C");
        String temperatureUnit = scanner.nextLine();
        if(temperatureUnit.equalsIgnoreCase("C")||temperatureUnit.equalsIgnoreCase("F")){
            System.out.println("Please, enter temperature degree:");
            double temperature = scanner.nextDouble();
            String celsius = "C";
            String fahrenheit = "F";
            if (temperatureUnit.equalsIgnoreCase(celsius)) {
                System.out.println("F=" + (temperature * 9/5 +32));
            } else if (temperatureUnit.equalsIgnoreCase(fahrenheit)) {
                System.out.println("C=" + ((temperature-32)*5/9));
            }
        }else {
            System.out.println("Wrong temperature unit");
        }







    }
}
