package Lesson16.Lection.RegistrationSystem;

public class Participant {
    String name;
    int age;
    String email;

    public Participant(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    public void displayParticipants() {
        if (age < 18) {
            throw new ArithmeticException("Participation is prohibited for " + name);
        }
        else {
            System.out.println(toString());
        }
    }
}
