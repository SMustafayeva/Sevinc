package Lesson7;

public class Dimentional_Array {
    public static void main(String[] args) {
        Character[][] twoDimArray = new Character[3][8];

        int lastNum = 65;
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = (char) (lastNum++);
            }
        }

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
