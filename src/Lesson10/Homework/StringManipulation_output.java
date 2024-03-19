package Lesson10.Homework;

public class StringManipulation_output {
    public static void main(String[] args) {
        StringManipulation proverb = new StringManipulation();
        proverb.proverb = "All Roads lead to Rome";
        int letters = proverb.lettersCount(proverb.proverb);
        String uppercase = proverb.upperCase(proverb.proverb);
        String lowercase = proverb.lowerCase(proverb.proverb);

        System.out.println("1.The number of letters is: " + letters);
        System.out.println("2.Uppercase is: " + uppercase);
        System.out.println("3.Lowercase is: " + lowercase);

        boolean startsWithA = proverb.firstLetterA(proverb.proverb);
        if (startsWithA) {
            System.out.println("4.First letter is: 'A'.");
        } else {
            System.out.println("4.First letter is not 'A'.");
        }
        ;
        boolean endsWithZ = proverb.endLetterZ(proverb.proverb);
        if (endsWithZ) {
            System.out.println("5.Last letter is: " + startsWithA);
        } else {
            System.out.println("5.Last letter is not 'Z'.");
        }
        ;
        String replacement = proverb.replaceWithE(proverb.proverb);
        System.out.println("6." + replacement);

        String[] splitIntoWords = proverb.splitIntoArray(proverb.proverb);
        System.out.println("7.");
        for (String word : splitIntoWords) {
            System.out.println(word);
        }
        char letterIndexO = 'o';
        int letterIndex = proverb.indexOfO(proverb.proverb,letterIndexO);
        if (letterIndex!=-1){
            System.out.println("8.Index of the first occurrence of '" + letterIndexO + "' is: " + letterIndex);
        }else {
            System.out.println("8.The letter '" + letterIndexO + "' is not found in the string");
        }
        int startIndex = 5;
        int endIndex = 10;
        String substringExtract = proverb.extractSubstring(proverb.proverb,startIndex,endIndex);
        System.out.println("9.Substring is: " + substringExtract);

        String whitespaceRemove = proverb.spaceRemove(proverb.proverb);
        System.out.println("10.Proverb after removing whitespaces: " + whitespaceRemove);
    }

}
