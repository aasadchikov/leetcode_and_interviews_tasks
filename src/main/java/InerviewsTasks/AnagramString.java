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
