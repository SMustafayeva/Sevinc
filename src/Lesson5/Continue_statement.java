package Lesson5;

public class Continue_statement {
    public static void main(String[] args) {

        for (int x = 0; x < 21; x++) {
            if (x%3==0){
                continue;
            }
                System.out.println(x);
        }
    }
}

