/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
*/
package InerviewsTasks;

import java.util.Arrays;

public class AnagramString {

    public static Boolean isAnagram(String s1, String s2) {
        Boolean result = false;

        String str1 = s1.replaceAll("\\s", "");
        String str2 = s2.replaceAll("\\s", "");

        if (str1.length() == str2.length()) {
            char[] arrayS1 = str1.toLowerCase().toCharArray();
            char[] arrayS2 = str2.toLowerCase().toCharArray();

            Arrays.sort(arrayS1);
            Arrays.sort(arrayS2);

            result = Arrays.equals(arrayS1, arrayS2);
        }

        return result;
    }
}
