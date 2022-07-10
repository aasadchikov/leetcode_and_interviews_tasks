package LeetCode;

import java.util.Arrays;

public class HighestLowestNumber {

    public static String getHighestLowestNumber(String numbers) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String[] str = numbers.split(",");
        for (int i = 0; i < str.length; i++) {
            int currentNum = Integer.parseInt(str[i]);
            if(currentNum > max)
                max = currentNum;
            if (currentNum < min)
                min = currentNum;
        }

        return max + "," + min;
    }

    public static String getHighestLowestNumber1(String numbers) {

        String[] str = numbers.split(",");
        int[] numInt = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            numInt[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(numInt);

        return numInt[numInt.length-1] + "," + numInt[0];
    }
}
