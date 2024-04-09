package Lesson11.Lection;

public class AnimalMain {
    public static void main(String[] args) {
        Animal cat = new Animal("Cat", "Basilio", "Myau");
        Animal dog = new Animal("Dog", "Barbos", "Hav-hav");
        Animal tiger = new Animal("Tiger", "Shere Khan", "Rrrr");
        System.out.println(cat.Sound());
        System.out.println(dog.Sound());
        System.out.println(tiger.Sound());

        // Visitor count


        System.out.println("Today's total visitor was: " + Animal.getTotalVisitors());

        // Trainer

        Animal.Trainer trick1 = new Animal.Trainer("Sit");
        Animal.Trainer trick2 = new Animal.Trainer("Stand");
        Animal.Trainer trick3 = new Animal.Trainer("Lie");
        char command = '!';
        char performance = 's';
        System.out.println(trick1.trick + command);
        System.out.println(dog.species+ " " + trick1.trick+performance);
        System.out.println(trick2.trick + command);
        System.out.println(cat.species+" "+ trick2.trick + performance);
        System.out.println(trick3.trick + command);
        System.out.println(tiger.species+" "+ trick3.trick + performance);
    }
}
