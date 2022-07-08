package LeetCode;

import java.util.HashMap;

public class FirstUniqCharIndex {

    public static int firstUniqChar(String s) {
        //1st step Count of all characters in the string
        //2nd step to compare input string characters to our key/value pais

        HashMap<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (countMap.containsKey(letter)) {
                countMap.put(letter, countMap.get(letter) + 1);
            } else {
                countMap.put(letter, 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

}
