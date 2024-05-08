package Lesson19.Lection;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexRegularExpression {
    //    String poem = "Hold fast to dreams\n" +
//            "For if dreams die\n" +
//            "Life is a broken-winged bird\n" +
//            "That cannot fly.\n" +
//            "\n" +
//            "Hold fast to dreams\n" +
//            "For when dreams go\n" +
//            "Life is a barren field\n" +
//            "Frozen with snow.";
//
    public static void main(String[] args) {
        String text = "It is a dangerous thing to unbelieve something only because it frightens you.";

        Pattern pattern = Pattern.compile("\\bs\\w*");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
