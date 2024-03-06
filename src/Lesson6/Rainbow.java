package Lesson6;

public class Rainbow {
    public static void main(String[] args) {
        String [] rainbow = {"Red","Orange","Yellow","Green","Blue","Indigo","Violet"};
        String [] color = new String[7];
        color [0] = "Red";
        color [1] = "Orange";
        color [2] = "Yellow";
        color [3] = "Green";
        color [4] = "Blue";
        color [5] = "Indigo";
        color [6] = "Violet";

        for ( String colors : color){
            System.out.println(colors);
        }
    }
}
