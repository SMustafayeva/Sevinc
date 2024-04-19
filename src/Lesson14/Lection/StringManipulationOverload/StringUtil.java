package Lesson14.Lection.StringManipulationOverload;

public class StringUtil {
    String name;
    String surname;
    String middleName;

    public String concatenate (String name, String surname) {
        return name.concat(" ").concat(surname);
    }
    public String concatenate (String name, String surname, String middleName) {
        return name + " " + surname + " " + middleName;
    }
    public  String uppercase (String name){
        return name.toUpperCase();
    }
    public String uppercase (String name, String middleName){
        return name.toUpperCase()+ middleName.toUpperCase();
    }
//    public String reversal (String name){
//        return name.re
//    }
}
