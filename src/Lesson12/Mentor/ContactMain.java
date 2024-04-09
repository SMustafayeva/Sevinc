package Lesson12.Mentor;

public class ContactMain {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Ali",516754567);
        Contact contact2 = new Contact("Ali",507649837);
        Contact contact3 = new Contact("Veli",507649837);
        Contact contact4 = new Contact("Veli",507649837);

        contact1.setPhone(90, 1234567);


        System.out.println(contact1.equals(contact2));
        System.out.println(contact2.equals(contact4));
        System.out.println(contact3.equals(contact4));
    }
}
