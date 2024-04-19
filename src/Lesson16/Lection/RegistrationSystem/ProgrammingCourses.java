package Lesson16.Lection.RegistrationSystem;

public class ProgrammingCourses {
    public static void main(String[] args) {

        System.out.println("Participants:");

         Participant p1 = new Participant("Adam", 29, "adam@gmail.com");
            Participant p2 = new Participant("Amin", 45, "amin@gmail.com");
            Participant p3 = new Participant("Alim", 30, "alim@gmail.com");
            Participant p4 = new Participant("Aqil", 5, "aqil@gmail.com");
            Participant p5 = new Participant("Akif", 22, "akif@gmail.com");

        try{
            p1.displayParticipants();
            p2.displayParticipants();
            p3.displayParticipants();
            p4.displayParticipants();
            p5.displayParticipants();
        }catch (ArithmeticException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
