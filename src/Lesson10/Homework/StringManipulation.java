package Lesson10.Homework;

import com.sun.source.tree.BreakTree;

public class StringManipulation {
    String proverb;
    int letters;

    public int lettersCount(String proverb) {
        int letters = 0;
        for (int i = 0; i < proverb.length(); i++) {
            if (!Character.isWhitespace(proverb.charAt(i)))
                letters++;
        }
        return letters;
    }

    public String upperCase(String proverb) {
        return proverb.toUpperCase();
    }

    public String lowerCase(String proverb) {
        return proverb.toLowerCase();
    }

    public boolean firstLetterA(String proverb) {
        return proverb.startsWith("A");
    }

    public boolean endLetterZ(String proverb) {
        return proverb.endsWith("Z");
    }
    public String replaceWithE (String proverb){
        return proverb.replace("e","E");
    }
    public String[] splitIntoArray (String proverb){
        return proverb.split("\\s+");
    }
    public int indexOfO (String proverb,char letterO){
        return proverb.indexOf(letterO);
    }
    public String extractSubstring (String proverb, int startIndex, int endIndex){
        return proverb.substring(startIndex - 1, endIndex);
    }
    public String spaceRemove (String proverb){
        return proverb.trim();
    }
}
