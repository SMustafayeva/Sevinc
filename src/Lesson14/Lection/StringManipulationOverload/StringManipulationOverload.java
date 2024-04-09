package Lesson14.Lection.StringManipulationOverload;

public class StringManipulationOverload {
    public static void main(String[] args) {
        StringUtil name = new StringUtil();
        System.out.println(name.concatenate("Sevinc","Mustafayeva"));
        System.out.println(name.concatenate("Sevinc","Mustafayeva",
                "Baxtiyar"));

    }
}
