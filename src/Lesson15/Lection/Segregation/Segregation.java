package Lesson15.Lection.Segregation;

public class Segregation {
    public static void main(String[] args) {
        Person person = new Person();
        person.swim();
        person.walk();
        Duck duck = new Duck();
        duck.Fly();
        duck.swim();
        duck.walk();
    }
}
