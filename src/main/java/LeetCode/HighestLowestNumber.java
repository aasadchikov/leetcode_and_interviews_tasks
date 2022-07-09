package LeetCode;

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
}
