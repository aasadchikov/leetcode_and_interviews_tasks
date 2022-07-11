package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class FindNumberRepetedSymbols {

    public static void countDuplicatedCharacters(String str) {

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] charArray = str.toCharArray();

        for (char ch : charArray) {

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            }
            else {
                map.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }

    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";

        // Function Call
        countDuplicatedCharacters(str);
    }
}
