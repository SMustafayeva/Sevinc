package Lesson21.Mentor;

import java.util.*;

public class AnagramGroups {

    public static void main(String[] args) {
        String[] strings = new String[5];
        var map = groupAnagrams("eat", "tea", "tan", "ate", "nat", "bat");
        for (var entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
    public static Map<String, List<String>> groupAnagrams(String... words) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : words) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            List<String> strings = map.get(sorted);
            strings.add(word);
        }
        return map;
    }
}
