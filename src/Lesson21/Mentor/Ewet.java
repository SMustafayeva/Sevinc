package Lesson21.Mentor;

import java.util.*;

public class Ewet {
    public static void main(String[] args) {

        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for(String word : words){
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            if (!anagramGroups.containsKey(sortedWord)){
                anagramGroups.put(sortedWord, new ArrayList<>());
            }anagramGroups.get(sortedWord).add(word);
        }
        int anagramCount = 0;
        for(List<String> group: anagramGroups.values()){
            if(group.size()>1){
                System.out.println("Anagram group: " + group);
                anagramCount++;
            }
        }
        System.out.println("Anagram Group: " + anagramCount);
    }
}
