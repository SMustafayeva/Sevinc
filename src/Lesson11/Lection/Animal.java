package Lesson11.Lection;

public class Animal {
    String name;
    String species;
    int age;
    String sound;
    static int totalVisitors = 0;

    public Animal(String species, String name, String sound) {
        this.species = species;
        this.name = name;
        this.sound = sound;
        totalVisitors++;
    }

    public String Sound() {
        System.out.println(name + " makes sound " + sound + ".It is?:");

        return species;
    }

    public String animal() {
        return species;
    }



    public Animal(){
        totalVisitors++;

    }
    public static int getTotalVisitors() {
        return totalVisitors;
    }

    public static class Trainer {
        String trick;


        public Trainer(String trick) {
            this.trick = trick;
        }
        public String teachTrick(String trick,Animal animal) {
            return "tranier " + animal.name + trick + " oyredir  ";

        }

    }
}
