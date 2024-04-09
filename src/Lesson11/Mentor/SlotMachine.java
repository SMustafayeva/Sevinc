package Lesson11.Mentor;

import Lesson6.Rainbow;

import java.util.Random;

public class SlotMachine {
    static String[] symbols = {"🍒", "🍋", "🍊", "🔔", "🍉", "🍇"};
    public void pullLever(){
        Random random = new Random();
        String [] result = new String[3];
        for (int i = 0; i < result.length; i++) {
            result[i] = symbols[random.nextInt(6)];
        }
        System.out.println("Result: " + String.join("",result));
        if (result[0].equals(result[1]) && result[1].equals(result[2])){
            System.out.println("Congratulations, you won!");
        }else {
            System.out.println("Sorry, you lost.Try again!");
        }
    }
    public static void main(String[] args) {
        SlotMachine slotMachine = new SlotMachine();
        slotMachine.pullLever();
    }
}
