package Lesson18.Lection;

import java.time.Year;

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("God Moves in a Mysterious Way.");
        text.append(" (William Cowper)");
        System.out.println(text);
        int year = Year.now().getValue();

        System.out.println(year + " " + text);
    }
}
