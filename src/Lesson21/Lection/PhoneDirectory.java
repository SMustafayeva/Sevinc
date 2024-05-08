package Lesson21.Lection;
import Lesson14.Lection.CompileTimePolymorphism.ShapeCalculator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class PhoneDirectory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Corporate directory");
        Map<String, Integer> contact = new HashMap<>();
        contact.put("Adam", 1134);
        contact.put("Alex", 1145);
        contact.put("Cavad", 1257);
        contact.put("Namiq", 2398);
        contact.put("Tofiq", 4372);
        System.out.println("4) All corporate directory:");
        for (Map.Entry <String, Integer > entry : contact.entrySet()){
            System.out.println(entry.getKey()+": "+ entry.getValue());
        }

        System.out.println("2) Search user's contact number:");
        String name = scanner.nextLine();
        switch (name){
            case "Adam":
                System.out.println("Internal number: " + contact.get("Adam"));
                break;
            case "Alex":
                System.out.println("Internal number: " + contact.get("Alex"));
                break;
            case "Cavad":
                System.out.println("Internal number: " + contact.get("Cavad"));
                break;
            case "Namiq":
                System.out.println("Internal number: " + contact.get("Namiq"));
                break;
            case "Tofiq":
                System.out.println("Internal number: " + contact.get("Tofiq"));
                break;
            default:
                System.out.println("User don't exist");
        }
        System.out.println("3) Enter user's name for deleting from the directory: ");
        String delete = scanner.nextLine();

        switch (delete) {
            case "Adam":
                contact.remove("Adam");
            System.out.println("Adam has successfully been removed  from the phone number " + contact.getOrDefault("Adam",1134));
            break;
            case "Alex":
                contact.remove("Alex");
                System.out.println("Adam has successfully been removed  from the phone number " + contact.getOrDefault("Alex",1145));
                break;
            case "Cavad":
                contact.remove("Cavad");
                System.out.println("Adam has successfully been removed  from the phone number " + contact.getOrDefault("Cavad",1257));
                break;
            case "Namiq":
                contact.remove("Namiq");
                System.out.println("Adam has successfully been removed  from the phone number " + contact.getOrDefault("Namiq",2398));
                break;
            case "Tofiq":
                contact.remove("Tofiq");
                System.out.println("Adam has successfully been removed  from the phone number " + contact.getOrDefault("Tofiq",4372));
                break;
        }
//        contact.getOrDefault("Adam",0);
//        for (Map.Entry<String, Integer> c : contact.entrySet()) {
//        //    String name = scanner.nextLine();
//            System.out.println("Name and contact: " + c);

//            if (name.equalsIgnoreCase("exit")) {
//                System.out.println("5) Exiting from the corporate directory");
//                break;
//            }
//        }
    }
}

